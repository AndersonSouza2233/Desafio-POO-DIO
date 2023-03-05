package br.com.dio.desafio.dominio;

public class Curso {
    private String titulo;
    private String descrição;
    private int cargaHoraria;


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String tirulo) {
        this.titulo = titulo;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "tirulo='" + titulo + '\'' +
                ", descrição='" + descrição + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
