package org.desafioDio.Dominio;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Mentoria extends Conteudo{

    private LocalDate data;


    //quando eu nao crio construtor, por debaixo dos panos existe um construtor vazio !!


    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Classe Mentoria -> {" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + data +
                '}';
    }
}
