/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.sahara.system;

import core.person.Usuario;
import core.sahara.book.Libro;
import java.util.ArrayList;

/**
 *
 * @author edangulo
 */
public class Compra {
    
    private Usuario usuario;
    private ArrayList<Libro> libros;
    private ArrayList<Integer> unidades;
    private ArrayList<Bodega> bodegas;
    private double total;

    public Compra(Usuario usuario, ArrayList<Libro> libros, ArrayList<Integer> unidades, ArrayList<Bodega> bodegas) {
        this.usuario = usuario;
        this.libros = libros;
        this.unidades = unidades;
        this.bodegas = bodegas;
        this.total = this.calculateTotal();
    }
    
    private double calculateTotal() {
        return 0;
    }
    
}
