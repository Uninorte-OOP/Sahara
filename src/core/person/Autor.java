/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.person;

import core.sahara.book.Libro;
import java.util.ArrayList;

/**
 *
 * @author edangulo
 */
public class Autor extends Persona {
    
    private ArrayList<Libro> libros;
    
    public Autor(int id, String nombre, int telefono, String direccion) {
        super(id, nombre, telefono, direccion);
        this.libros = new ArrayList<>();
    }
    
}
