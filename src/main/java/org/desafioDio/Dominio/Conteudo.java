package org.desafioDio.Dominio;

public abstract class Conteudo {
    //constante => final
    //static -> vou pode usa ela fora de conteudo
    //protected -> os filhos de conteudo que vai pode ter acesso a esse atributo
    protected static final double XP_PADRAO = 10d;
    private String titulo;
    private String descricao;

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
