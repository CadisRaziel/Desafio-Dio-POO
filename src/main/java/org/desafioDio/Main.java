package org.desafioDio;

import org.desafioDio.Dominio.Conteudo;
import org.desafioDio.Dominio.Curso;
import org.desafioDio.Dominio.Mentoria;

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

        System.out.println(curso1);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("descrição da mentoria de java");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);

        //Polimorfismo
        //Conteudo conteudo = new Curso();
        //Conteudo conteudo1 = new Mentoria();
        //List<String> lista1 = new ArrayList<>();
    }
}
