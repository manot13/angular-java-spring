package com.company;

public class Lutador implements ControleLutador{

    private String nome;
    private String nacionalidade;
    private int idade;
    private float peso;
    private float altura;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String no, String na, int id, float pe,
                   float al, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.peso = setPeso(pe);
        this.altura = al;
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public float getPeso() {
        return peso;
    }

    public float setPeso(float pe) {
        this.peso = pe;
        setCategoria();
        return pe;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float al) {
        this.altura = al;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso<52.2){
            this.categoria = "Inválido";
        } else if (this.peso<=70.3){
            this.categoria = "Leve";
        } else if (this.peso<=83.9){
            this.categoria = "Médio";
        } else if (this.peso<=120.2){
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vi) {
        this.vitorias = vi;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int de) {
        this.derrotas = de;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int em) {
        this.empates = em;
    }

    @Override
    public void apresentar() {
        System.out.println("\nLutador: " + getNome());
        System.out.println("Origem: " + getNacionalidade());
        System.out.println(getIdade() + " anos");
        System.out.println("Pesando: " + getPeso());
        System.out.println("Ganhou: " + getVitorias());
        System.out.println("Perdeu: " + getDerrotas());
        System.out.println("Empatou: " + getEmpates());
    }

    @Override
    public void status() {
        System.out.println("\n");
        System.out.println(getNome());
        System.out.println("é um peso " + getCategoria());
        System.out.println(getVitorias() + " vitórias");
        System.out.println(getDerrotas() + " derrotas");
        System.out.println(getEmpates() + " empates");
    }

    @Override
    public void ganharLuta() {
        this.setVitorias(this.getVitorias()+1);
    }

    @Override
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas()+1);
    }

    @Override
    public void empatarLuta() {
        this.setEmpates(this.getEmpates()+1);
    }
}
