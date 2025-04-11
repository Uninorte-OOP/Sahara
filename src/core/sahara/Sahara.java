/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.sahara;

import core.person.Usuario;
import core.sahara.book.Libro;
import core.sahara.system.Bodega;
import core.sahara.system.Compra;
import java.util.ArrayList;

/**
 *
 * @author edangulo
 */
public class Sahara {
    
    private ArrayList<Usuario> usuarios;
    private ArrayList<Libro> libros;
    private ArrayList<Bodega> bodegas;
    private ArrayList<Compra> compras;

    public Sahara() {
        this.usuarios = new ArrayList<>();
        this.libros = new ArrayList<>();
        this.bodegas = new ArrayList<>();
        this.compras = new ArrayList<>();
    }
    
    public void addBodega(Bodega bodega) {
        this.bodegas.add(bodega);
    }
    
    public void addCompra(Usuario usuario, ArrayList<Libro> libros, ArrayList<Integer> unidades) {
        ArrayList<Bodega> bodegas = new ArrayList<>();
        for (Libro libro : libros) {
            for (Bodega bodega : libro.getBodegas()) {
                if (!bodegas.contains(bodega)) {
                    bodegas.add(bodega);
                }
            }
        }
        this.compras.add(new Compra(usuario, libros, unidades, bodegas));
    }
    
    public void addLibro(Libro libro) {
        this.libros.add(libro);
    }
    
    public void addUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }
    
    public Bodega getBodega(int index) {
        return this.bodegas.get(index);
    }
    
    public Libro getLibro(int libroId) {
        for (Libro libro : this.libros) {
            if (libro.getId() == libroId) {
                return libro;
            }
        }
        return null;
    }
    
    public Usuario getUsuario(int usuarioId) {
        for (Usuario usuario : this.usuarios) {
            if (usuario.getId() == usuarioId) {
                return usuario;
            } 
        }
        return null;
    }
    
    public void showLibroMayorPromedioEstrellasEvaluacion() {
        
    }
    
    public void showUsuarioMaxCompra() {
        
    }
    
    public void showUsuarioMaxLikes() {
        int maxLikes = 0;
        Usuario maxUsuario = null;
        for (Usuario usuario: this.usuarios) {
            if (usuario.getTotalLikes() > maxLikes) {
                maxLikes = usuario.getTotalLikes();
                maxUsuario = usuario;
            }
        }
        System.out.println("Max Likes");
    }
    
    public void showUsuarioMaxDislikes() {
        int maxDislikes = 0;
        Usuario maxUsuario = null;
        for (Usuario usuario: this.usuarios) {
            if (usuario.getTotalDislikes() > maxDislikes) {
                maxDislikes = usuario.getTotalDislikes();
                maxUsuario = usuario;
            }
        }
        System.out.println("Max Dislikes");
    }
    
}
