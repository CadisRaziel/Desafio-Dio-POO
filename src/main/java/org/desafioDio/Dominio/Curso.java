package org.desafioDio.Dominio;


import java.time.LocalDateTime;

public class Curso extends Conteudo{

    private int cargaHoraria;

    //quando eu nao crio construtor, por debaixo dos panos existe um construtor vazio !!


    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Classe Curso -> {" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }


}
