package org.desafioDio.Dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    //A partir do momento que o dev se inscrever no bootcamp ele ja vai ter conteudoInscrito
    //A partir do momento que for progredindo no bootcamp o dev tera 'progredir' e ter 'conteudosConcluidos'
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp) {
        //A partir do momento que o dev se inscreve no bootcamp todo o conteudo do bootcamp vai pra sua conta em 'conteudosInscritos'
        //resumindo eu to pegando tudo que tem dentro do bootcamp usando getConteudos e colocando dentro de conteudosINscritos
        this.conteudosInscritos.addAll(bootcamp.getConteudos());

        //adicionando o dev no bootcamp
        bootcamp.getDevsIncritos().add(this); //this -> se refere a classe 'Dev'
    }

    public void progredit() {
        //findFirst -> para pegar na ordem, o primeiro que ele for fazendo
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();

        //agora preciso tirar do conteudoInscritos e colocar no conteudosConcluidos
        if (conteudo.isPresent()) {
            //se existir eu coloco dentro de conteudosConcluidos
            this.conteudosConcluidos.add(conteudo.get());

            //removendo do conteudos incritos
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            //caso esteja vazio
            System.err.println("Você não esta matriculado em nenhum conteudo");
        }
    }

    public double calcularXp() {
        return this.conteudosConcluidos
                .stream()
                //.mapToDouble(conteudo -> conteudo.calcularXp()) // ou posso por lambda ou usa o reference method como abaixo
                .mapToDouble(Conteudo::calcularXp)
                .sum(); //sum -> somar
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}
