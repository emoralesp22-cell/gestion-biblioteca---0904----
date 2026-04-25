package com.alejandromorales.id0904_24_13125.gestionbiblioteca.app;

import com.alejandromorales.id0904_24_13125.gestionbiblioteca.modelo.Libro;
import com.alejandromorales.id0904_24_13125.gestionbiblioteca.servicio.Biblioteca;

public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        // 3 libros válidos
        Libro l1 = new Libro("El Quijote", "Cervantes", 1605);
        Libro l2 = new Libro("Clean Code", "Robert Martin", 2008);
        Libro l3 = new Libro("Java Básico", "Autor X", 2015);

        biblioteca.agregarLibro(l1);
        biblioteca.agregarLibro(l2);
        biblioteca.agregarLibro(l3);

        // libro inválido
        try {
            Libro l4 = new Libro("", "", -1);
            biblioteca.agregarLibro(l4);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // imprimir libros
        System.out.println("=== LIBROS ===");
        for (Libro l : biblioteca.obtenerLibros()) {
            System.out.println(
                l.getTitulo() + " - " +
                l.getAutor() + " - " +
                l.getYearPublicacion()
            );
        }

        // buscar libro
        System.out.println("\n=== BUSCAR ===");

        Libro encontrado = biblioteca.buscarPorTitulo("El Quijote");

        if (encontrado != null) {
            System.out.println("Encontrado: " + encontrado.getTitulo());
        } else {
            System.out.println("No encontrado");
        }
    }
}