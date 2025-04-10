/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.sahara.system;

import core.sahara.book.Libro;
import java.util.ArrayList;

/**
 *
 * @author edangulo
 */
public class Bodega {
    
    private double latitud;
    private double longitud;
    private ArrayList<Libro> libros;
    private ArrayList<Integer> existencias;

    public Bodega(double latitud, double longitud) {
        this.latitud = latitud;
        this.longitud = longitud;
        this.libros = new ArrayList<>();
        this.existencias = new ArrayList<>();
    }
    
}
