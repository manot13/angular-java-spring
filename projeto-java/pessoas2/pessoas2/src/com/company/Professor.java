package com.company;

public final class Professor extends Pessoa{
    private String especialidade;
    private float salario;

    public void receberAumento(float valor){
        this.setSalario(getSalario()+valor);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "\nProfessor{" +
                "\nespecialidade='" + especialidade + '\'' +
                ",\nsalario=" + salario +
                ",\nnome=" + this.getNome() +
                ",\nidade=" + this.getIdade() +
                ",\nsexo=" + this.getSexo() +
                '}';
    }
}
