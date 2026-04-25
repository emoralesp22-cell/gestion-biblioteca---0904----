package com.alejandromorales.id0904_24_13125.gestionbiblioteca.modelo;

public class Libro {

    private String titulo;
    private String autor;
    private int yearPublicacion;

    public Libro(String titulo, String autor, int yearPublicacion) {

        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("Titulo inválido");
        }

        if (autor == null || autor.trim().isEmpty()) {
            throw new IllegalArgumentException("Autor inválido");
        }

        if (yearPublicacion <= 0) {
            throw new IllegalArgumentException("Año inválido");
        }

        this.titulo = titulo;
        this.autor = autor;
        this.yearPublicacion = yearPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getYearPublicacion() {
        return yearPublicacion;
    }

    public boolean esAntiguo() {
        return yearPublicacion < 2000;
    }
}