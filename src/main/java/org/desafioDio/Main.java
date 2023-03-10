package org.desafioDio;

import org.desafioDio.Dominio.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.LinkedList;

public class Main {

    //Herança
    //tudo que tem dentro de conteudo tem em curso/mentoria
    //mais nem tudo que tem em curso/mentoria tem dentro de conteudo

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso mysql");
        curso2.setDescricao("descrição curso mysql");
        curso2.setCargaHoraria(6);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("descrição da mentoria de java");
        mentoria.setData(LocalDate.now());



        //Polimorfismo
        //Conteudo conteudo = new Curso();
        //Conteudo conteudo1 = new Mentoria();
        //List<String> lista1 = new ArrayList<>();


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devVitor = new Dev();
        devVitor.setNome("Vitor");
        devVitor.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Vitor -> " + devVitor.getConteudosInscritos());
        System.out.println();
        //fazendo o dev se concluir em um curso
        devVitor.progredit();
        //conteudo que eu ja conclui
        System.out.println("Conteudos inscritos Vitor -> " + devVitor.getConteudosInscritos());
        System.out.println();
        System.out.println("Conteudos concluidos Vitor -> " + devVitor.getConteudosConcluidos());
        System.out.println();
        System.out.println("XP: -> " + devVitor.calcularXp());
        System.out.println("----------------------");

        Dev devAri = new Dev();
        devAri.setNome("Ariella");
        devAri.inscreverBootcamp(bootcamp);
        System.out.println();
        System.out.println("Conteudos inscritos Ari -> " + devAri.getConteudosInscritos());
        System.out.println();
        System.out.println("Conteudos concluidos Ari -> " + devAri.getConteudosConcluidos());


    }
}
