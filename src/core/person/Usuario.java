/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.person;

import core.sahara.book.Libro;
import core.sahara.system.Compra;
import core.sahara.system.Evaluacion;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author edangulo
 */
public class Usuario extends Persona {
    
    private ArrayList<Compra> compras;
    private ArrayList<Evaluacion> evaluaciones;

    public Usuario(int id, String nombre, int telefono, String direccion) {
        super(id, nombre, telefono, direccion);
        this.compras = new ArrayList<>();
        this.evaluaciones = new ArrayList<>();
    }
    
    public void addCompra(Compra compra) {
        this.compras.add(compra);
    }
    
    public void makeEvaluacion(Libro libro, LocalDateTime fecha, int estrellas, String comentario) {
        this.evaluaciones.add(new Evaluacion(this, libro, fecha, estrellas, comentario));
    }
    
    public void like(Evaluacion evaluacion) {
        evaluacion.increaseLikes();
    }
    
    public void dislike(Evaluacion evaluacion) {
        evaluacion.increaseDislikes();
    }
    
}
