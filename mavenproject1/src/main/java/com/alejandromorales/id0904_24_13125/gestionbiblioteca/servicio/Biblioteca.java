package com.alejandromorales.id0904_24_13125.gestionbiblioteca.servicio;

import java.util.ArrayList;
import java.util.List;
import com.alejandromorales.id0904_24_13125.gestionbiblioteca.modelo.Libro;

public class Biblioteca {

    private List<Libro> libros;

    public Biblioteca() {
        libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public List<Libro> obtenerLibros() {
        return new ArrayList<>(libros);
    }

    public Libro buscarPorTitulo(String titulo) {
        for (Libro l : libros) {
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                return l;
            }
        }
        return null;
    }
}