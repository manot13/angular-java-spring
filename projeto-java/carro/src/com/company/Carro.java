package com.company;

public class Carro implements ControladorCarro{
    //Atributos
    private boolean ligado;
    private int marcha;
    private boolean acelerador;
    private boolean freioPe;
    private boolean freioMao;
    private boolean portaFechada;
    private boolean embreagem;

    //Métodos Especiais
    public Carro() {
        this.ligado = false;
        this.marcha = 0;
        this.acelerador = false;
        this.freioPe = false;
        this.freioMao = true;
        this.portaFechada = true;
        this.embreagem = false;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private int getMarcha() {
        return marcha;
    }

    private void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    private boolean getAcelerador() {
        return acelerador;
    }

    private void setAcelerador(boolean acelerador) {
        this.acelerador = acelerador;
    }

    private boolean getFreioPe() {
        return freioPe;
    }

    private void setFreioPe(boolean freioPe) {
        this.freioPe = freioPe;
    }

    private boolean getFreioMao() {
        return freioMao;
    }

    private void setFreioMao(boolean freioMao) {
        this.freioMao = freioMao;
    }

    private boolean getPortaFechada() {
        return portaFechada;
    }

    private void setPortaFechada(boolean portaFechada) {
        this.portaFechada = portaFechada;
    }

    private boolean getEmbreagem() {
        return embreagem;
    }

    private void setEmbreagem(boolean embreagem) {
        this.embreagem = embreagem;
    }

    //Métodos Abstratos
    @Override
    public void ligar() {
        if (this.getMarcha()==0) {
            this.setLigado(true);
        } else {
            System.out.println("\nO carro precisa estar na marcha neutra.");
        }
    }

    @Override
    public void desligar() {
        if (this.getLigado()) {
            if (this.getMarcha()==0) {
                if (this.getFreioMao()) {
                    this.setLigado(false);
                } else {
                    System.out.println("\nO carro precisa estar com o freio de mão puxado.");
                }
            } else {
                System.out.println("\nO carro precisa estar na marcha neutra para desligar.");
            }
        } else {
            System.out.println("\nO carro não está ligado.");
        }
    }

    @Override
    public void acelerar() {
        if (this.getEmbreagem() && this.getMarcha()==1){
            if (!this.getFreioMao()) {
                if (this.getPortaFechada()) {
                    this.setAcelerador(true);
                } else {
                    System.out.println("\nAs portas precisam estar fechadas.");
                }
            } else {
                System.out.println("\nO freio de mão tem que estar abaixado.");
            }
        } else {
            System.out.println("\nO carro precisa estar engatado na primeira marcha.");
        }
    }

    @Override
    public void freiar() {
        if (!this.getAcelerador()) {
            this.setFreioPe(true);
        } else {
            System.out.println("Tire o pé o acelerador.");
        }
    }

    @Override
    public void pisarEmbreagem() {
        this.setEmbreagem(true);
    }

//    @Override
//    public void tirarEmbreagem() {
//        this.setEmbreagem(false);
//    }

    @Override
    public void passarMarcha() {
        this.setMarcha(1);
    }

    @Override
    public void levantarFreio() {
        if (!this.getLigado()){
            this.setFreioMao(true);
        } else {
            System.out.println("O carro precisa estar desligado.");
        }
    }

    @Override
    public void abaixarFreio() {
        if (this.getLigado()){
            this.setFreioMao(false);
        } else {
            System.out.println("O carro precisa estar ligado.");
        }
    }

    @Override
    public void abrirPorta() {
        this.setPortaFechada(false);
    }

//    @Override
//    public void fecharPorta() {
//        if (!this.getLigado())
//    }

    @Override
    public void status() {
        System.out.println("\n---------- STATUS DO CARRO ----------");
        System.out.println("Acelerando? " + this.getAcelerador());
        System.out.println("Embreagem ativa? " + this.getEmbreagem());
        System.out.println("Porta fechada? " + this.getPortaFechada());
        System.out.println("Ligado? " + this.getLigado());
        System.out.println("Qual marcha? " + this.getMarcha());
        System.out.println("Freiando? " + this.getFreioPe());
        System.out.println("Freio de mão ativo? " + this.getFreioMao());
        System.out.println("-------------------------------------");

    }
}
