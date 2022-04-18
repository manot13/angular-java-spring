package com.company;

public final class Tecnico extends Aluno{
    private int registroProfissional;

    public void praticar(){
        System.out.println("O técnico está praticando.");
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "registroProfissional=" + registroProfissional +
                ",\nnome=" + this.getNome() +
                ",\nidade=" + this.getIdade() +
                ",\nsexo=" + this.getSexo() +
                ",\ncurso=" + this.getCurso() +
                ",\nmatricula=" + this.getMatricula() +
                '}';
    }
}
