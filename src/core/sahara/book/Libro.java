/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.sahara.book;

import core.person.Autor;
import core.sahara.system.Bodega;
import core.sahara.system.Evaluacion;
import java.util.ArrayList;

/**
 *
 * @author edangulo
 */
public class Libro {
    
    private int id;
    private String titulo;
    private ArrayList<Autor> autores;
    private String editorial;
    private ArrayList<Integer> ediciones;
    private String isbn;
    private String caracteristicas;
    private Genero genero;
    private double precio;
    private ArrayList<Bodega> bodegas;
    private ArrayList<Evaluacion> evaluaciones;

    public Libro(int id, String titulo, ArrayList<Autor> autores, String editorial, ArrayList<Integer> ediciones, String isbn, String caracteristicas, Genero genero, double precio) {
        this.id = id;
        this.titulo = titulo;
        this.autores = autores;
        this.editorial = editorial;
        this.ediciones = ediciones;
        this.isbn = isbn;
        this.caracteristicas = caracteristicas;
        this.genero = genero;
        this.precio = precio;
        this.bodegas = new ArrayList<>();
        this.evaluaciones = new ArrayList<>();
        
        for (Autor autor : this.autores) {
            autor.addLibro(this);
        }
    }
    
    public void addBodega(Bodega bodega) {
        this.bodegas.add(bodega);
    }
    
    public void addEvaluacion(Evaluacion evaluacion) {
        this.evaluaciones.add(evaluacion);
    }

    public int getId() {
        return id;
    }

    public double getPrecio() {
        return precio;
    }

    public ArrayList<Bodega> getBodegas() {
        return bodegas;
    }
    
}
