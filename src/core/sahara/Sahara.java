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
        double maxPromedio = -1;
        Libro maxLibro = null;
        for (Libro libro : this.libros) {
            if (libro.getPromedioEstrellas() > maxPromedio) {
                maxPromedio = libro.getPromedioEstrellas();
                maxLibro = libro;
            }
        }
        System.out.println("La informacion del libro que tiene el mayor promedio en estrellas de sus evaluaciones es:");
        System.out.println("- ID: " + maxLibro.getId());
        System.out.println("- Titulo: " + maxLibro.getTitulo());
        System.out.println("- Autores: " + maxLibro.getAutores());
        System.out.println("- Editorial: " + maxLibro.getEditorial());
        System.out.println("- Ediciones: " + maxLibro.getEdiciones());
        System.out.println("- ISBN: " + maxLibro.getIsbn());
        System.out.println("- Caracteristicas: " + maxLibro.getCaracteristicas());
        System.out.println("- Genero: " + maxLibro.getGenero());
        System.out.println("- Precio: $" + maxLibro.getPrecio());
        System.out.println("- Numero de Bodegas: " + maxLibro.getBodegas().size());
        System.out.println("- Total de Existencias: " + maxLibro.getTotalExistencias());
        System.out.println("- Numero de Evaluaciones: " + maxLibro.getNumeroEvaluaciones());
        System.out.println("- Estrellas Promedio: " + String.format("%.2f", maxPromedio).replace(",", ".") + "\n");
    }
    
    public void showUsuarioMaxCompra() {
        double maxTotal = 0;
        Usuario maxUsuario = null;
        for (Usuario usuario : this.usuarios) {
            if (usuario.getMaxCompra() != null && usuario.getMaxCompra().getTotal() > maxTotal) {
                maxTotal = usuario.getMaxCompra().getTotal();
                maxUsuario = usuario;
            }
        }
        System.out.println("La informacion del usuario que registro la mayor compra es:");
        System.out.println("- ID: " + maxUsuario.getId());
        System.out.println("- Nombre: " + maxUsuario.getNombre());
        System.out.println("- Telefono: " + maxUsuario.getTelefono());
        System.out.println("- Direccion: " + maxUsuario.getDireccion());
        System.out.println("- Numero de Compras: " + maxUsuario.getCantidadCompras());
        System.out.println("- Numero de Evaluaciones: " + maxUsuario.getNumeroEvaluaciones());
        System.out.println("- Mayor Compra: $" + String.format("%.2f", maxTotal).replace(",", ".") + "\n");
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
        System.out.println("La informacion del usuario que tiene el mayor numero de likes en todas sus evaluaciones es:");
        System.out.println("- ID: " + maxUsuario.getId());
        System.out.println("- Nombre: " + maxUsuario.getNombre());
        System.out.println("- Telefono: " + maxUsuario.getTelefono());
        System.out.println("- Direccion: " + maxUsuario.getDireccion());
        System.out.println("- Numero de Compras: " + maxUsuario.getCantidadCompras());
        System.out.println("- Numero de Evaluaciones: " + maxUsuario.getNumeroEvaluaciones());
        System.out.println("- Numero de Likes: " + maxLikes + "\n");
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
        System.out.println("La informacion del usuario que tiene el mayor numero de dislikes en todas sus evaluaciones es:");
        System.out.println("- ID: " + maxUsuario.getId());
        System.out.println("- Nombre: " + maxUsuario.getNombre());
        System.out.println("- Telefono: " + maxUsuario.getTelefono());
        System.out.println("- Direccion: " + maxUsuario.getDireccion());
        System.out.println("- Numero de Compras: " + maxUsuario.getCantidadCompras());
        System.out.println("- Numero de Evaluaciones: " + maxUsuario.getNumeroEvaluaciones());
        System.out.println("- Numero de Dislikes: " + maxDislikes);
    }
    
}
