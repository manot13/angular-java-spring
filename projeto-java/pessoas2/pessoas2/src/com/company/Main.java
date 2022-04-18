package com.company;

public class Main {
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa();
//        Visitante v1 = new Visitante();
//        v1.setNome("Juvenal");
//        v1.setIdade(22);
//        v1.setSexo("M");
//        System.out.println(v1.toString());

//        Aluno a1 = new Aluno();
//        a1.setNome("Cláudio");
//        a1.setMatricula(11111);
//        a1.setCurso("Informática");
//        a1.setIdade(16);
//        a1.setSexo("M");
//        a1.pagarMensalidade();
//        Bolsista b1 = new Bolsista();
//        b1.setMatricula(1112);
//        b1.setNome("Jubileu");
//        b1.setBolsa(12.5f);
//        b1.setSexo("M");
//        b1.pagarMensalidade();
//        System.out.println(b1.toString());
        Tecnico t1 = new Tecnico();
        t1.setNome("Fernanda");
        t1.setIdade(22);
        t1.setSexo("F");
        t1.setRegistroProfissional(192);
        t1.setCurso("Medicina");
        t1.setMatricula(11123);
        t1.praticar();
        t1.pagarMensalidade();
        t1.fazerAniversario();
        System.out.println(t1.toString());

//        Professor p1 = new Professor();
//        p1.setNome("Daniel");
//        p1.setSalario(2000);
//        p1.setEspecialidade("Química");
//        p1.setIdade(42);
//        p1.setSexo("M");
//        p1.receberAumento(200);
//        System.out.println(p1.toString());

    }
}
