/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.sahara.system;

import core.person.Usuario;
import core.sahara.book.Libro;
import java.time.LocalDateTime;

/**
 *
 * @author edangulo
 */
public class Evaluacion {
    
    private Usuario autor;
    private Libro libro;
    private LocalDateTime fecha;
    private int estrellas;
    private String comentario;
    private int likes;
    private int dislikes;

    public Evaluacion(Usuario autor, Libro libro, LocalDateTime fecha, int estrellas, String comentario) {
        this.autor = autor;
        this.libro = libro;
        this.fecha = fecha;
        this.estrellas = estrellas;
        this.comentario = comentario;
        this.likes = 0;
        this.dislikes = 0;
    }
    
}
