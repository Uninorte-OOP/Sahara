/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import core.person.Autor;
import core.person.Usuario;
import core.sahara.Sahara;
import core.sahara.book.Genero;
import core.sahara.book.Libro;
import core.sahara.system.Bodega;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author edangulo
 */
public class MainParcial2249 {
    
    public static void main(String[] args) {
        ArrayList<Autor> autoresLibro;
        ArrayList<Integer> ediciones;

        ArrayList<Libro> librosCompra;
        ArrayList<Integer> unidadesCompra;

        Sahara sahara = new Sahara();

        ArrayList<Autor> autores = new ArrayList<>();
        autores.add(new Autor(3015913, "Patrick Rothfuss", 685387492, "5678 Oak St, Springfield, IL"));
        autores.add(new Autor(2163651, "N.K. Jemisin", 647227888, "9101 Pine St, Springfield, IL"));
        autores.add(new Autor(8597121, "Ursula K. Le Guin", 630362086, "1213 Maple St, Springfield, IL"));
        autores.add(new Autor(4493062, "Neil Gaiman", 659496435, "1415 Birch St, Springfield, IL"));
        autores.add(new Autor(9939658, "Brandon Mull", 692349365, "1617 Cedar St, Springfield, IL"));
        autores.add(new Autor(4775145, "Terry Brooks", 691255836, "1819 Spruce St, Springfield, IL"));
        autores.add(new Autor(6590092, "Robert Jordan", 689334034, "2021 Fir St, Springfield, IL"));
        autores.add(new Autor(2408007, "George R.R. Martin", 699290633, "2223 Willow St, Springfield, IL"));
        autores.add(new Autor(3598554, "J.K. Rowling", 678931130, "2425 Cherry St, Springfield, IL"));
        autores.add(new Autor(2332865, "C.S. Lewis", 650338125, "2627 Ash St, Springfield, IL"));
        autores.add(new Autor(8672949, "J.R.R. Tolkien", 614593412, "2829 Walnut St, Springfield, IL"));
        autores.add(new Autor(5507922, "Philip Pullman", 600149133, "3031 Chestnut St, Springfield, IL"));
        autores.add(new Autor(7047543, "Raymond E. Feist", 607054678, "3233 Poplar St, Springfield, IL"));
        autores.add(new Autor(2885183, "Brandon Sanderson", 688806077, "3435 Sycamore St, Springfield, IL"));
        autores.add(new Autor(6760623, "Anne McCaffrey", 663308833, "3637 Dogwood St, Springfield, IL"));
        autores.add(new Autor(2627847, "David Eddings", 678284833, "3839 Magnolia St, Springfield, IL"));

        sahara.addUsuario(new Usuario(9355492, "Alice Johnson", 654885380, "1234 Elm St, Springfield, IL"));
        sahara.addUsuario(new Usuario(8368563, "Bob Smith", 663564091, "2345 Oak St, Springfield, IL"));
        sahara.addUsuario(new Usuario(5043746, "Charlie Brown", 674214179, "3456 Pine St, Springfield, IL"));
        sahara.addUsuario(new Usuario(9454204, "Diana Prince", 681929285, "4567 Maple St, Springfield, IL"));
        sahara.addUsuario(new Usuario(3303221, "Ethan Hunt", 664283922, "5678 Birch St, Springfield, IL"));
        sahara.addUsuario(new Usuario(2660035, "Fiona Apple", 665463464, "6789 Cedar St, Springfield, IL"));
        sahara.addUsuario(new Usuario(9023433, "George Clooney", 645864322, "7890 Spruce St, Springfield, IL"));
        sahara.addUsuario(new Usuario(6247882, "Hannah Montana", 623462930, "8901 Fir St, Springfield, IL"));
        sahara.addUsuario(new Usuario(8702375, "Ian Malcolm", 696121932, "9012 Willow St, Springfield, IL"));
        sahara.addUsuario(new Usuario(2132853, "Julia Roberts", 626342404, "1234 Cherry St, Springfield, IL"));
        sahara.addUsuario(new Usuario(1266437, "Kevin Spacey", 619187656, "2345 Ash St, Springfield, IL"));
        sahara.addUsuario(new Usuario(5996833, "Laura Croft", 694103218, "3456 Walnut St, Springfield, IL"));
        sahara.addUsuario(new Usuario(1442753, "Michael Jordan", 693456492, "4567 Chestnut St, Springfield, IL"));
        sahara.addUsuario(new Usuario(5629235, "Natalie Portman", 642570811, "5678 Poplar St, Springfield, IL"));
        sahara.addUsuario(new Usuario(5910741, "Oscar Isaac", 6298541, "6789 Sycamore St, Springfield, IL"));
        sahara.addUsuario(new Usuario(7775507, "Peter Parker", 6590178, "7890 Dogwood St, Springfield, IL"));
        sahara.addUsuario(new Usuario(1430715, "Quentin Tarantino", 6631952, "8901 Magnolia St, Springfield, IL"));
        sahara.addUsuario(new Usuario(4202746, "Rachel Green", 6122556, "9012 Elm St, Springfield, IL"));
        sahara.addUsuario(new Usuario(2442689, "Steve Jobs", 6026103, "1234 Oak St, Springfield, IL"));
        sahara.addUsuario(new Usuario(6945232, "Tina Fey", 6793024, "2345 Pine St, Springfield, IL"));

        autoresLibro = new ArrayList<>();
        ediciones = new ArrayList<>();
        autoresLibro.add(autores.get(8));
        autoresLibro.add(autores.get(4));
        autoresLibro.add(autores.get(10));
        ediciones.add(0);
        ediciones.add(1);
        sahara.addLibro(new Libro(1938624, "El Nombre del Viento", autores, "Editorial Fantasia", ediciones, "978-3-16-148410-0", "Pasta dura, 500 paginas", Genero.AVENTURA, 101660.26));

        autoresLibro = new ArrayList<>();
        ediciones = new ArrayList<>();
        autoresLibro.add(autores.get(7));
        autoresLibro.add(autores.get(5));
        ediciones.add(0);
        ediciones.add(1);
        ediciones.add(2);
        ediciones.add(3);
        ediciones.add(4);
        ediciones.add(5);
        ediciones.add(6);
        sahara.addLibro(new Libro(4777103, "La Quinta Temporada", autores, "Editorial Ciencia Ficcion", ediciones, "978-3-16-148410-1", "Pasta blanda, 400 paginas", Genero.HISTORICO, 109626.57));

        autoresLibro = new ArrayList<>();
        ediciones = new ArrayList<>();
        autoresLibro.add(autores.get(6));
        autoresLibro.add(autores.get(15));
        ediciones.add(0);
        ediciones.add(1);
        ediciones.add(2);
        ediciones.add(3);
        ediciones.add(4);
        ediciones.add(5);
        sahara.addLibro(new Libro(7971638, "Los Desposeidos", autores, "Editorial Clasicos", ediciones, "978-3-16-148410-2", "Tapa dura, 600 paginas", Genero.AVENTURA, 182742.57));

        autoresLibro = new ArrayList<>();
        ediciones = new ArrayList<>();
        autoresLibro.add(autores.get(10));
        autoresLibro.add(autores.get(2));
        autoresLibro.add(autores.get(9));
        ediciones.add(0);
        sahara.addLibro(new Libro(1536468, "El Hobbit", autores, "Editorial Aventura", ediciones, "978-2-34-30-8", "Pasta blanda, 443 paginas", Genero.THRILLER, 124534.85));

        autoresLibro = new ArrayList<>();
        ediciones = new ArrayList<>();
        autoresLibro.add(autores.get(2));
        autoresLibro.add(autores.get(7));
        ediciones.add(0);
        ediciones.add(1);
        ediciones.add(2);
        ediciones.add(3);
        sahara.addLibro(new Libro(6815327, "Juego de Tronos", autores, "Editorial Fantasia", ediciones, "978-5-82-74-4", "Pasta dura, 496 paginas", Genero.HISTORICO, 21770.01));

        autoresLibro = new ArrayList<>();
        ediciones = new ArrayList<>();
        autoresLibro.add(autores.get(3));
        autoresLibro.add(autores.get(6));
        ediciones.add(0);
        ediciones.add(1);
        sahara.addLibro(new Libro(4206245, "El Alquimista", autores, "Editorial Filosofica", ediciones, "978-1-71-63-2", "Pasta blanda, 540 paginas", Genero.ROMANCE, 172770.12));

        autoresLibro = new ArrayList<>();
        ediciones = new ArrayList<>();
        autoresLibro.add(autores.get(11));
        autoresLibro.add(autores.get(3));
        autoresLibro.add(autores.get(7));
        ediciones.add(0);
        ediciones.add(1);
        ediciones.add(2);
        ediciones.add(3);
        sahara.addLibro(new Libro(1278477, "1984", autores, "Editorial Clasicos", ediciones, "978-4-3-22-8", "Pasta dura, 668 paginas", Genero.ROMANCE, 188447.71));       

        autoresLibro = new ArrayList<>();
        ediciones = new ArrayList<>();
        autoresLibro.add(autores.get(2));
        autoresLibro.add(autores.get(10));
        ediciones.add(0);
        ediciones.add(1);
        ediciones.add(2);
        ediciones.add(3);
        ediciones.add(4);
        ediciones.add(5);
        ediciones.add(6);
        sahara.addLibro(new Libro(8819883, "El Principito", autores, "Editorial Infantil", ediciones, "978-5-85-91-9", "Pasta blanda, 508 paginas", Genero.ROMANCE, 70142.57));

        autoresLibro = new ArrayList<>();
        ediciones = new ArrayList<>();
        autoresLibro.add(autores.get(4));
        autoresLibro.add(autores.get(3));
        ediciones.add(0);
        ediciones.add(1);
        sahara.addLibro(new Libro(5219426, "Cien Años de Soledad", autores, "Editorial Realismo Magico", ediciones, "978-5-5-97-6", "Pasta dura, 700 paginas", Genero.FANTASIA, 37153.25));

        autoresLibro = new ArrayList<>();
        ediciones = new ArrayList<>();
        autoresLibro.add(autores.get(12));
        ediciones.add(0);
        ediciones.add(1);
        ediciones.add(2);
        ediciones.add(3);
        sahara.addLibro(new Libro(2219628, "Cronica de una muerte anunciada", autores, "Editorial Novela", ediciones, "978-1-32-42-6", "Pasta blanda, 623 paginas", Genero.HISTORICO, 19517.49));

        autoresLibro = new ArrayList<>();
        ediciones = new ArrayList<>();
        autoresLibro.add(autores.get(4));
        autoresLibro.add(autores.get(5));
        ediciones.add(0);
        ediciones.add(1);
        sahara.addLibro(new Libro(5460105, "Rayuela", autores, "Editorial Novela", ediciones, "978-5-10-71-2", "Pasta dura, 535 paginas", Genero.FANTASIA, 171594.05));    

        autoresLibro = new ArrayList<>();
        ediciones = new ArrayList<>();
        autoresLibro.add(autores.get(7));
        autoresLibro.add(autores.get(5));
        ediciones.add(0);
        ediciones.add(1);
        ediciones.add(2);
        ediciones.add(3);
        ediciones.add(4);
        sahara.addLibro(new Libro(1033431, "El tunel 1", autores, "Editorial Novela", ediciones, "978-3-81-99-9", "Pasta blanda, 529 paginas", Genero.ROMANCE, 180196.04));

        autoresLibro = new ArrayList<>();
        ediciones = new ArrayList<>();
        autoresLibro.add(autores.get(15));
        autoresLibro.add(autores.get(0));
        autoresLibro.add(autores.get(3));
        ediciones.add(0);
        ediciones.add(1);
        ediciones.add(2);
        sahara.addLibro(new Libro(9621305, "El Aleph", autores, "Editorial Fantasia", ediciones, "978-3-92-82-4", "Pasta dura, 620 paginas", Genero.AVENTURA, 178786.94)); 

        autoresLibro = new ArrayList<>();
        ediciones = new ArrayList<>();
        autoresLibro.add(autores.get(5));
        ediciones.add(0);
        ediciones.add(1);
        ediciones.add(2);
        ediciones.add(3);
        ediciones.add(4);
        sahara.addLibro(new Libro(7504514, "El tunel 2", autores, "Editorial Novela", ediciones, "978-5-57-38-3", "Pasta blanda, 504 paginas", Genero.AVENTURA, 141296.64));

        autoresLibro = new ArrayList<>();
        ediciones = new ArrayList<>();
        autoresLibro.add(autores.get(5));
        autoresLibro.add(autores.get(13));
        autoresLibro.add(autores.get(9));
        ediciones.add(0);
        sahara.addLibro(new Libro(5797583, "El Proceso", autores, "Editorial Novela", ediciones, "978-3-38-69-4", "Pasta dura, 338 paginas", Genero.AVENTURA, 149000.52)); 

        autoresLibro = new ArrayList<>();
        ediciones = new ArrayList<>();
        autoresLibro.add(autores.get(13));
        autoresLibro.add(autores.get(10));
        ediciones.add(0);
        ediciones.add(1);
        ediciones.add(2);
        ediciones.add(3);
        ediciones.add(4);
        ediciones.add(5);
        ediciones.add(6);
        sahara.addLibro(new Libro(1134128, "El extranjero", autores, "Editorial Novela", ediciones, "978-4-67-34-8", "Pasta blanda, 612 paginas", Genero.AVENTURA, 10494.05));

        autoresLibro = new ArrayList<>();
        ediciones = new ArrayList<>();
        autoresLibro.add(autores.get(7));
        autoresLibro.add(autores.get(1));
        ediciones.add(0);
        ediciones.add(1);
        ediciones.add(2);
        ediciones.add(3);
        ediciones.add(4);
        sahara.addLibro(new Libro(3541989, "El tunel 3", autores, "Editorial Novela", ediciones, "978-4-9-70-5", "Pasta dura, 489 paginas", Genero.ROMANCE, 76353.15));    

        autoresLibro = new ArrayList<>();
        ediciones = new ArrayList<>();
        autoresLibro.add(autores.get(9));
        autoresLibro.add(autores.get(3));
        autoresLibro.add(autores.get(15));
        ediciones.add(0);
        ediciones.add(1);
        ediciones.add(2);
        ediciones.add(3);
        ediciones.add(4);
        ediciones.add(5);
        ediciones.add(6);
        ediciones.add(7);
        sahara.addLibro(new Libro(1159171, "El tunel 4", autores, "Editorial Novela", ediciones, "978-5-42-18-9", "Pasta blanda, 384 paginas", Genero.THRILLER, 118646.77));

        autoresLibro = new ArrayList<>();
        ediciones = new ArrayList<>();
        autoresLibro.add(autores.get(3));
        autoresLibro.add(autores.get(2));
        ediciones.add(0);
        ediciones.add(1);
        ediciones.add(2);
        ediciones.add(3);
        sahara.addLibro(new Libro(1046770, "El tunel 5", autores, "Editorial Novela", ediciones, "978-4-54-32-2", "Pasta dura, 444 paginas", Genero.FANTASIA, 100156.38)); 

        autoresLibro = new ArrayList<>();
        ediciones = new ArrayList<>();
        autoresLibro.add(autores.get(1));
        ediciones.add(0);
        ediciones.add(1);
        ediciones.add(2);
        ediciones.add(3);
        ediciones.add(4);
        ediciones.add(5);
        ediciones.add(6);
        sahara.addLibro(new Libro(5598169, "Sin noticias de Gurb", autores, "Editorial Novela", ediciones, "978-1-54-60-2", "Pasta blanda, 437 paginas", Genero.THRILLER, 150308.71));

        sahara.addBodega(new Bodega(2.79, -72.27));
        sahara.getBodega(0).addExistencias(sahara.getLibro(1033431), 53);
        sahara.getBodega(0).addExistencias(sahara.getLibro(6815327), 97);
        sahara.getBodega(0).addExistencias(sahara.getLibro(4777103), 52);
        sahara.getBodega(0).addExistencias(sahara.getLibro(1278477), 69);

        sahara.addBodega(new Bodega(2.01, -69.12));
        sahara.getBodega(1).addExistencias(sahara.getLibro(5219426), 94);
        sahara.getBodega(1).addExistencias(sahara.getLibro(7971638), 90);
        sahara.getBodega(1).addExistencias(sahara.getLibro(3541989), 72);
        sahara.getBodega(1).addExistencias(sahara.getLibro(1134128), 53);
        sahara.getBodega(1).addExistencias(sahara.getLibro(1033431), 80);
        sahara.getBodega(1).addExistencias(sahara.getLibro(6815327), 85);
        sahara.getBodega(1).addExistencias(sahara.getLibro(1134128), 68);

        sahara.addBodega(new Bodega(1.54, -74.75));
        sahara.getBodega(2).addExistencias(sahara.getLibro(1033431), 63);
        sahara.getBodega(2).addExistencias(sahara.getLibro(1046770), 98);
        sahara.getBodega(2).addExistencias(sahara.getLibro(7971638), 63);
        sahara.getBodega(2).addExistencias(sahara.getLibro(7971638), 73);
        sahara.getBodega(2).addExistencias(sahara.getLibro(7971638), 75);
        sahara.getBodega(2).addExistencias(sahara.getLibro(1938624), 58);

        sahara.addBodega(new Bodega(2.98, -71.63));
        sahara.getBodega(3).addExistencias(sahara.getLibro(1046770), 69);
        sahara.getBodega(3).addExistencias(sahara.getLibro(3541989), 95);
        sahara.getBodega(3).addExistencias(sahara.getLibro(5797583), 80);
        sahara.getBodega(3).addExistencias(sahara.getLibro(8819883), 74);
        sahara.getBodega(3).addExistencias(sahara.getLibro(1536468), 70);
        sahara.getBodega(3).addExistencias(sahara.getLibro(1033431), 80);
        sahara.getBodega(3).addExistencias(sahara.getLibro(1278477), 76);

        sahara.addBodega(new Bodega(1.33, -70.90));
        sahara.getBodega(4).addExistencias(sahara.getLibro(1278477), 99);
        sahara.getBodega(4).addExistencias(sahara.getLibro(9621305), 65);
        sahara.getBodega(4).addExistencias(sahara.getLibro(1938624), 56);
        sahara.getBodega(4).addExistencias(sahara.getLibro(1134128), 96);
        sahara.getBodega(4).addExistencias(sahara.getLibro(3541989), 90);
        sahara.getBodega(4).addExistencias(sahara.getLibro(9621305), 51);

        sahara.addBodega(new Bodega(3.70, -71.96));
        sahara.getBodega(5).addExistencias(sahara.getLibro(1278477), 77);
        sahara.getBodega(5).addExistencias(sahara.getLibro(1134128), 66);
        sahara.getBodega(5).addExistencias(sahara.getLibro(5219426), 91);
        sahara.getBodega(5).addExistencias(sahara.getLibro(1536468), 81);
        sahara.getBodega(5).addExistencias(sahara.getLibro(3541989), 63);
        sahara.getBodega(5).addExistencias(sahara.getLibro(5219426), 50);
        sahara.getBodega(5).addExistencias(sahara.getLibro(3541989), 54);

        sahara.addBodega(new Bodega(1.03, -75.32));
        sahara.getBodega(6).addExistencias(sahara.getLibro(7971638), 74);
        sahara.getBodega(6).addExistencias(sahara.getLibro(5797583), 63);
        sahara.getBodega(6).addExistencias(sahara.getLibro(3541989), 60);
        sahara.getBodega(6).addExistencias(sahara.getLibro(1033431), 75);
        sahara.getBodega(6).addExistencias(sahara.getLibro(1938624), 64);
        sahara.getBodega(6).addExistencias(sahara.getLibro(1278477), 57);
        sahara.getBodega(6).addExistencias(sahara.getLibro(1278477), 78);

        sahara.addBodega(new Bodega(7.51, -67.69));
        sahara.getBodega(7).addExistencias(sahara.getLibro(4206245), 67);
        sahara.getBodega(7).addExistencias(sahara.getLibro(3541989), 79);
        sahara.getBodega(7).addExistencias(sahara.getLibro(7504514), 59);
        sahara.getBodega(7).addExistencias(sahara.getLibro(1046770), 99);
        sahara.getBodega(7).addExistencias(sahara.getLibro(5797583), 65);

        sahara.addBodega(new Bodega(7.07, -72.46));
        sahara.getBodega(8).addExistencias(sahara.getLibro(7504514), 97);
        sahara.getBodega(8).addExistencias(sahara.getLibro(5598169), 95);
        sahara.getBodega(8).addExistencias(sahara.getLibro(6815327), 74);
        sahara.getBodega(8).addExistencias(sahara.getLibro(8819883), 56);
        sahara.getBodega(8).addExistencias(sahara.getLibro(1046770), 69);

        sahara.addBodega(new Bodega(-2.80, -74.58));
        sahara.getBodega(9).addExistencias(sahara.getLibro(6815327), 97);
        sahara.getBodega(9).addExistencias(sahara.getLibro(1033431), 61);
        sahara.getBodega(9).addExistencias(sahara.getLibro(4777103), 79);
        sahara.getBodega(9).addExistencias(sahara.getLibro(5460105), 57);

        librosCompra = new ArrayList<>();
        unidadesCompra = new ArrayList<>();
        librosCompra.add(sahara.getLibro(1159171));
        unidadesCompra.add(4);
        librosCompra.add(sahara.getLibro(2219628));
        unidadesCompra.add(3);
        sahara.addCompra(sahara.getUsuario(2132853), librosCompra, unidadesCompra);

        librosCompra = new ArrayList<>();
        unidadesCompra = new ArrayList<>();
        librosCompra.add(sahara.getLibro(2219628));
        unidadesCompra.add(3);
        librosCompra.add(sahara.getLibro(4777103));
        unidadesCompra.add(1);
        sahara.addCompra(sahara.getUsuario(8702375), librosCompra, unidadesCompra);

        librosCompra = new ArrayList<>();
        unidadesCompra = new ArrayList<>();
        librosCompra.add(sahara.getLibro(9621305));
        unidadesCompra.add(3);
        librosCompra.add(sahara.getLibro(5598169));
        unidadesCompra.add(2);
        librosCompra.add(sahara.getLibro(1033431));
        unidadesCompra.add(4);
        librosCompra.add(sahara.getLibro(1278477));
        unidadesCompra.add(4);
        sahara.addCompra(sahara.getUsuario(6247882), librosCompra, unidadesCompra);

        librosCompra = new ArrayList<>();
        unidadesCompra = new ArrayList<>();
        librosCompra.add(sahara.getLibro(6815327));
        unidadesCompra.add(3);
        librosCompra.add(sahara.getLibro(4206245));
        unidadesCompra.add(3);
        sahara.addCompra(sahara.getUsuario(7775507), librosCompra, unidadesCompra);

        librosCompra = new ArrayList<>();
        unidadesCompra = new ArrayList<>();
        librosCompra.add(sahara.getLibro(5219426));
        unidadesCompra.add(3);
        librosCompra.add(sahara.getLibro(1159171));
        unidadesCompra.add(1);
        sahara.addCompra(sahara.getUsuario(2132853), librosCompra, unidadesCompra);

        librosCompra = new ArrayList<>();
        unidadesCompra = new ArrayList<>();
        librosCompra.add(sahara.getLibro(6815327));
        unidadesCompra.add(4);
        librosCompra.add(sahara.getLibro(5219426));
        unidadesCompra.add(1);
        sahara.addCompra(sahara.getUsuario(1266437), librosCompra, unidadesCompra);

        librosCompra = new ArrayList<>();
        unidadesCompra = new ArrayList<>();
        librosCompra.add(sahara.getLibro(1046770));
        unidadesCompra.add(4);
        sahara.addCompra(sahara.getUsuario(5996833), librosCompra, unidadesCompra);

        librosCompra = new ArrayList<>();
        unidadesCompra = new ArrayList<>();
        librosCompra.add(sahara.getLibro(1536468));
        unidadesCompra.add(3);
        sahara.addCompra(sahara.getUsuario(5043746), librosCompra, unidadesCompra);

        librosCompra = new ArrayList<>();
        unidadesCompra = new ArrayList<>();
        librosCompra.add(sahara.getLibro(1033431));
        unidadesCompra.add(1);
        librosCompra.add(sahara.getLibro(5598169));
        unidadesCompra.add(1);
        librosCompra.add(sahara.getLibro(7504514));
        unidadesCompra.add(4);
        sahara.addCompra(sahara.getUsuario(4202746), librosCompra, unidadesCompra);

        librosCompra = new ArrayList<>();
        unidadesCompra = new ArrayList<>();
        librosCompra.add(sahara.getLibro(7971638));
        unidadesCompra.add(1);
        sahara.addCompra(sahara.getUsuario(2442689), librosCompra, unidadesCompra);

        librosCompra = new ArrayList<>();
        unidadesCompra = new ArrayList<>();
        librosCompra.add(sahara.getLibro(5598169));
        unidadesCompra.add(3);
        librosCompra.add(sahara.getLibro(1033431));
        unidadesCompra.add(3);
        sahara.addCompra(sahara.getUsuario(5629235), librosCompra, unidadesCompra);

        librosCompra = new ArrayList<>();
        unidadesCompra = new ArrayList<>();
        librosCompra.add(sahara.getLibro(7971638));
        unidadesCompra.add(4);
        librosCompra.add(sahara.getLibro(8819883));
        unidadesCompra.add(2);
        librosCompra.add(sahara.getLibro(1278477));
        unidadesCompra.add(2);
        sahara.addCompra(sahara.getUsuario(5629235), librosCompra, unidadesCompra);

        librosCompra = new ArrayList<>();
        unidadesCompra = new ArrayList<>();
        librosCompra.add(sahara.getLibro(3541989));
        unidadesCompra.add(2);
        sahara.addCompra(sahara.getUsuario(4202746), librosCompra, unidadesCompra);

        librosCompra = new ArrayList<>();
        unidadesCompra = new ArrayList<>();
        librosCompra.add(sahara.getLibro(5460105));
        unidadesCompra.add(4);
        sahara.addCompra(sahara.getUsuario(6247882), librosCompra, unidadesCompra);

        librosCompra = new ArrayList<>();
        unidadesCompra = new ArrayList<>();
        librosCompra.add(sahara.getLibro(5797583));
        unidadesCompra.add(3);
        librosCompra.add(sahara.getLibro(1046770));
        unidadesCompra.add(1);
        librosCompra.add(sahara.getLibro(6815327));
        unidadesCompra.add(2);
        sahara.addCompra(sahara.getUsuario(1430715), librosCompra, unidadesCompra);

        librosCompra = new ArrayList<>();
        unidadesCompra = new ArrayList<>();
        librosCompra.add(sahara.getLibro(5219426));
        unidadesCompra.add(1);
        sahara.addCompra(sahara.getUsuario(1430715), librosCompra, unidadesCompra);

        librosCompra = new ArrayList<>();
        unidadesCompra = new ArrayList<>();
        librosCompra.add(sahara.getLibro(2219628));
        unidadesCompra.add(1);
        librosCompra.add(sahara.getLibro(4777103));
        unidadesCompra.add(2);
        sahara.addCompra(sahara.getUsuario(2442689), librosCompra, unidadesCompra);

        librosCompra = new ArrayList<>();
        unidadesCompra = new ArrayList<>();
        librosCompra.add(sahara.getLibro(4777103));
        unidadesCompra.add(3);
        librosCompra.add(sahara.getLibro(1033431));
        unidadesCompra.add(2);
        librosCompra.add(sahara.getLibro(5797583));
        unidadesCompra.add(3);
        sahara.addCompra(sahara.getUsuario(2660035), librosCompra, unidadesCompra);

        librosCompra = new ArrayList<>();
        unidadesCompra = new ArrayList<>();
        librosCompra.add(sahara.getLibro(2219628));
        unidadesCompra.add(3);
        librosCompra.add(sahara.getLibro(6815327));
        unidadesCompra.add(3);
        librosCompra.add(sahara.getLibro(8819883));
        unidadesCompra.add(3);
        sahara.addCompra(sahara.getUsuario(3303221), librosCompra, unidadesCompra);

        librosCompra = new ArrayList<>();
        unidadesCompra = new ArrayList<>();
        librosCompra.add(sahara.getLibro(1033431));
        unidadesCompra.add(2);
        sahara.addCompra(sahara.getUsuario(6247882), librosCompra, unidadesCompra);

        librosCompra = new ArrayList<>();
        unidadesCompra = new ArrayList<>();
        librosCompra.add(sahara.getLibro(7504514));
        unidadesCompra.add(3);
        librosCompra.add(sahara.getLibro(1938624));
        unidadesCompra.add(3);
        librosCompra.add(sahara.getLibro(1278477));
        unidadesCompra.add(3);
        librosCompra.add(sahara.getLibro(5219426));
        unidadesCompra.add(4);
        sahara.addCompra(sahara.getUsuario(8368563), librosCompra, unidadesCompra);

        librosCompra = new ArrayList<>();
        unidadesCompra = new ArrayList<>();
        librosCompra.add(sahara.getLibro(8819883));
        unidadesCompra.add(3);
        librosCompra.add(sahara.getLibro(5598169));
        unidadesCompra.add(4);
        librosCompra.add(sahara.getLibro(1033431));
        unidadesCompra.add(3);
        sahara.addCompra(sahara.getUsuario(6247882), librosCompra, unidadesCompra);

        librosCompra = new ArrayList<>();
        unidadesCompra = new ArrayList<>();
        librosCompra.add(sahara.getLibro(5460105));
        unidadesCompra.add(3);
        sahara.addCompra(sahara.getUsuario(3303221), librosCompra, unidadesCompra);

        librosCompra = new ArrayList<>();
        unidadesCompra = new ArrayList<>();
        librosCompra.add(sahara.getLibro(1938624));
        unidadesCompra.add(3);
        librosCompra.add(sahara.getLibro(1046770));
        unidadesCompra.add(1);
        sahara.addCompra(sahara.getUsuario(2660035), librosCompra, unidadesCompra);

        librosCompra = new ArrayList<>();
        unidadesCompra = new ArrayList<>();
        librosCompra.add(sahara.getLibro(2219628));
        unidadesCompra.add(3);
        librosCompra.add(sahara.getLibro(2219628));
        unidadesCompra.add(3);
        sahara.addCompra(sahara.getUsuario(2660035), librosCompra, unidadesCompra);

        librosCompra = new ArrayList<>();
        unidadesCompra = new ArrayList<>();
        librosCompra.add(sahara.getLibro(3541989));
        unidadesCompra.add(4);
        librosCompra.add(sahara.getLibro(4206245));
        unidadesCompra.add(1);
        librosCompra.add(sahara.getLibro(5219426));
        unidadesCompra.add(4);
        librosCompra.add(sahara.getLibro(5219426));
        unidadesCompra.add(4);
        sahara.addCompra(sahara.getUsuario(2660035), librosCompra, unidadesCompra);

        librosCompra = new ArrayList<>();
        unidadesCompra = new ArrayList<>();
        librosCompra.add(sahara.getLibro(4777103));
        unidadesCompra.add(4);
        librosCompra.add(sahara.getLibro(5219426));
        unidadesCompra.add(2);
        librosCompra.add(sahara.getLibro(1046770));
        unidadesCompra.add(3);
        sahara.addCompra(sahara.getUsuario(9023433), librosCompra, unidadesCompra);

        librosCompra = new ArrayList<>();
        unidadesCompra = new ArrayList<>();
        librosCompra.add(sahara.getLibro(1134128));
        unidadesCompra.add(3);
        librosCompra.add(sahara.getLibro(2219628));
        unidadesCompra.add(4);
        librosCompra.add(sahara.getLibro(9621305));
        unidadesCompra.add(2);
        sahara.addCompra(sahara.getUsuario(5996833), librosCompra, unidadesCompra);

        librosCompra = new ArrayList<>();
        unidadesCompra = new ArrayList<>();
        librosCompra.add(sahara.getLibro(1033431));
        unidadesCompra.add(3);
        librosCompra.add(sahara.getLibro(9621305));
        unidadesCompra.add(1);
        librosCompra.add(sahara.getLibro(5219426));
        unidadesCompra.add(3);
        sahara.addCompra(sahara.getUsuario(1430715), librosCompra, unidadesCompra);

        librosCompra = new ArrayList<>();
        unidadesCompra = new ArrayList<>();
        librosCompra.add(sahara.getLibro(1033431));
        unidadesCompra.add(4);
        sahara.addCompra(sahara.getUsuario(5996833), librosCompra, unidadesCompra);

        sahara.getUsuario(9355492).makeEvaluacion(sahara.getLibro(1536468), LocalDateTime.of(2024, 3, 2, 10, 41, 2), 3, "No lo recomiendo");
        sahara.getUsuario(5996833).like(sahara.getUsuario(9355492).getEvaluacion(0));
        sahara.getUsuario(5629235).like(sahara.getUsuario(9355492).getEvaluacion(0));
        sahara.getUsuario(6945232).dislike(sahara.getUsuario(9355492).getEvaluacion(0));
        sahara.getUsuario(1266437).dislike(sahara.getUsuario(9355492).getEvaluacion(0));

        sahara.getUsuario(9355492).makeEvaluacion(sahara.getLibro(5797583), LocalDateTime.of(2024, 12, 1, 11, 22, 40), 1, "No es mi estilo");
        sahara.getUsuario(8368563).like(sahara.getUsuario(9355492).getEvaluacion(1));
        sahara.getUsuario(6247882).like(sahara.getUsuario(9355492).getEvaluacion(1));
        sahara.getUsuario(5629235).like(sahara.getUsuario(9355492).getEvaluacion(1));
        sahara.getUsuario(5629235).like(sahara.getUsuario(9355492).getEvaluacion(1));
        sahara.getUsuario(1442753).dislike(sahara.getUsuario(9355492).getEvaluacion(1));
        sahara.getUsuario(7775507).dislike(sahara.getUsuario(9355492).getEvaluacion(1));
        sahara.getUsuario(5910741).dislike(sahara.getUsuario(9355492).getEvaluacion(1));
        sahara.getUsuario(6247882).dislike(sahara.getUsuario(9355492).getEvaluacion(1));

        sahara.getUsuario(8368563).makeEvaluacion(sahara.getLibro(1134128), LocalDateTime.of(2024, 12, 10, 18, 24, 24), 3, "Me hizo llorar");
        sahara.getUsuario(9454204).like(sahara.getUsuario(8368563).getEvaluacion(0));
        sahara.getUsuario(5996833).like(sahara.getUsuario(8368563).getEvaluacion(0));
        sahara.getUsuario(9355492).like(sahara.getUsuario(8368563).getEvaluacion(0));
        sahara.getUsuario(1442753).dislike(sahara.getUsuario(8368563).getEvaluacion(0));
        sahara.getUsuario(6247882).dislike(sahara.getUsuario(8368563).getEvaluacion(0));

        sahara.getUsuario(8368563).makeEvaluacion(sahara.getLibro(1033431), LocalDateTime.of(2024, 10, 5, 2, 6, 48), 2, "Regular");
        sahara.getUsuario(8368563).like(sahara.getUsuario(8368563).getEvaluacion(1));
        sahara.getUsuario(9355492).like(sahara.getUsuario(8368563).getEvaluacion(1));
        sahara.getUsuario(3303221).dislike(sahara.getUsuario(8368563).getEvaluacion(1));
        sahara.getUsuario(5910741).dislike(sahara.getUsuario(8368563).getEvaluacion(1));
        sahara.getUsuario(1430715).dislike(sahara.getUsuario(8368563).getEvaluacion(1));

        sahara.getUsuario(8368563).makeEvaluacion(sahara.getLibro(3541989), LocalDateTime.of(2024, 6, 16, 4, 14, 18), 1, "Me aburri");
        sahara.getUsuario(6247882).like(sahara.getUsuario(8368563).getEvaluacion(2));
        sahara.getUsuario(7775507).like(sahara.getUsuario(8368563).getEvaluacion(2));
        sahara.getUsuario(8702375).dislike(sahara.getUsuario(8368563).getEvaluacion(2));
        sahara.getUsuario(5629235).dislike(sahara.getUsuario(8368563).getEvaluacion(2));

        sahara.getUsuario(8368563).makeEvaluacion(sahara.getLibro(3541989), LocalDateTime.of(2024, 6, 21, 22, 26, 33), 3, "Regular");
        sahara.getUsuario(5629235).like(sahara.getUsuario(8368563).getEvaluacion(3));
        sahara.getUsuario(9023433).like(sahara.getUsuario(8368563).getEvaluacion(3));
        sahara.getUsuario(5910741).like(sahara.getUsuario(8368563).getEvaluacion(3));
        sahara.getUsuario(5629235).dislike(sahara.getUsuario(8368563).getEvaluacion(3));
        sahara.getUsuario(4202746).dislike(sahara.getUsuario(8368563).getEvaluacion(3));

        sahara.getUsuario(5043746).makeEvaluacion(sahara.getLibro(1033431), LocalDateTime.of(2024, 12, 17, 2, 1, 31), 3, "No me gusto");
        sahara.getUsuario(8702375).like(sahara.getUsuario(5043746).getEvaluacion(0));
        sahara.getUsuario(4202746).like(sahara.getUsuario(5043746).getEvaluacion(0));
        sahara.getUsuario(4202746).like(sahara.getUsuario(5043746).getEvaluacion(0));
        sahara.getUsuario(3303221).dislike(sahara.getUsuario(5043746).getEvaluacion(0));
        sahara.getUsuario(2442689).dislike(sahara.getUsuario(5043746).getEvaluacion(0));
        sahara.getUsuario(7775507).dislike(sahara.getUsuario(5043746).getEvaluacion(0));
        sahara.getUsuario(8702375).dislike(sahara.getUsuario(5043746).getEvaluacion(0));
        sahara.getUsuario(5629235).dislike(sahara.getUsuario(5043746).getEvaluacion(0));

        sahara.getUsuario(9454204).makeEvaluacion(sahara.getLibro(3541989), LocalDateTime.of(2024, 12, 10, 16, 25, 52), 3, "Buen libro");
        sahara.getUsuario(4202746).like(sahara.getUsuario(9454204).getEvaluacion(0));
        sahara.getUsuario(5910741).like(sahara.getUsuario(9454204).getEvaluacion(0));
        sahara.getUsuario(2660035).like(sahara.getUsuario(9454204).getEvaluacion(0));
        sahara.getUsuario(9023433).dislike(sahara.getUsuario(9454204).getEvaluacion(0));
        sahara.getUsuario(6945232).dislike(sahara.getUsuario(9454204).getEvaluacion(0));

        sahara.getUsuario(9454204).makeEvaluacion(sahara.getLibro(1536468), LocalDateTime.of(2024, 1, 22, 19, 8, 41), 3, "Lo mejor que he leido");
        sahara.getUsuario(2442689).like(sahara.getUsuario(9454204).getEvaluacion(1));
        sahara.getUsuario(8368563).like(sahara.getUsuario(9454204).getEvaluacion(1));
        sahara.getUsuario(6247882).like(sahara.getUsuario(9454204).getEvaluacion(1));
        sahara.getUsuario(9355492).like(sahara.getUsuario(9454204).getEvaluacion(1));
        sahara.getUsuario(6247882).like(sahara.getUsuario(9454204).getEvaluacion(1));
        sahara.getUsuario(1266437).dislike(sahara.getUsuario(9454204).getEvaluacion(1));

        sahara.getUsuario(9454204).makeEvaluacion(sahara.getLibro(1536468), LocalDateTime.of(2024, 6, 2, 6, 52, 16), 1, "No me gusto");
        sahara.getUsuario(7775507).like(sahara.getUsuario(9454204).getEvaluacion(2));
        sahara.getUsuario(5629235).like(sahara.getUsuario(9454204).getEvaluacion(2));
        sahara.getUsuario(1266437).like(sahara.getUsuario(9454204).getEvaluacion(2));
        sahara.getUsuario(2442689).dislike(sahara.getUsuario(9454204).getEvaluacion(2));

        sahara.getUsuario(3303221).makeEvaluacion(sahara.getLibro(1938624), LocalDateTime.of(2024, 7, 4, 15, 1, 38), 1, "Lo mejor que he leido");
        sahara.getUsuario(8702375).like(sahara.getUsuario(3303221).getEvaluacion(0));
        sahara.getUsuario(6247882).like(sahara.getUsuario(3303221).getEvaluacion(0));
        sahara.getUsuario(9454204).like(sahara.getUsuario(3303221).getEvaluacion(0));
        sahara.getUsuario(7775507).dislike(sahara.getUsuario(3303221).getEvaluacion(0));
        sahara.getUsuario(1442753).dislike(sahara.getUsuario(3303221).getEvaluacion(0));
        sahara.getUsuario(9355492).dislike(sahara.getUsuario(3303221).getEvaluacion(0));

        sahara.getUsuario(2660035).makeEvaluacion(sahara.getLibro(5598169), LocalDateTime.of(2024, 8, 9, 13, 37, 17), 2, "Me encanto");
        sahara.getUsuario(5910741).like(sahara.getUsuario(2660035).getEvaluacion(0));
        sahara.getUsuario(3303221).like(sahara.getUsuario(2660035).getEvaluacion(0));
        sahara.getUsuario(8702375).like(sahara.getUsuario(2660035).getEvaluacion(0));
        sahara.getUsuario(5996833).dislike(sahara.getUsuario(2660035).getEvaluacion(0));
        sahara.getUsuario(8702375).dislike(sahara.getUsuario(2660035).getEvaluacion(0));

        sahara.getUsuario(2660035).makeEvaluacion(sahara.getLibro(6815327), LocalDateTime.of(2024, 1, 25, 10, 37, 33), 1, "Buen libro");
        sahara.getUsuario(9023433).like(sahara.getUsuario(2660035).getEvaluacion(1));
        sahara.getUsuario(5043746).like(sahara.getUsuario(2660035).getEvaluacion(1));
        sahara.getUsuario(9023433).like(sahara.getUsuario(2660035).getEvaluacion(1));
        sahara.getUsuario(1430715).like(sahara.getUsuario(2660035).getEvaluacion(1));
        sahara.getUsuario(5043746).like(sahara.getUsuario(2660035).getEvaluacion(1));
        sahara.getUsuario(5910741).dislike(sahara.getUsuario(2660035).getEvaluacion(1));
        sahara.getUsuario(2132853).dislike(sahara.getUsuario(2660035).getEvaluacion(1));
        sahara.getUsuario(1442753).dislike(sahara.getUsuario(2660035).getEvaluacion(1));
        sahara.getUsuario(4202746).dislike(sahara.getUsuario(2660035).getEvaluacion(1));

        sahara.getUsuario(2660035).makeEvaluacion(sahara.getLibro(1536468), LocalDateTime.of(2024, 9, 8, 14, 18, 18), 4, "Regular");
        sahara.getUsuario(5910741).like(sahara.getUsuario(2660035).getEvaluacion(2));
        sahara.getUsuario(2442689).like(sahara.getUsuario(2660035).getEvaluacion(2));
        sahara.getUsuario(1266437).like(sahara.getUsuario(2660035).getEvaluacion(2));
        sahara.getUsuario(5996833).dislike(sahara.getUsuario(2660035).getEvaluacion(2));

        sahara.getUsuario(2660035).makeEvaluacion(sahara.getLibro(5598169), LocalDateTime.of(2024, 3, 13, 16, 18, 0), 4, "Buen libro");
        sahara.getUsuario(1430715).like(sahara.getUsuario(2660035).getEvaluacion(3));
        sahara.getUsuario(8702375).like(sahara.getUsuario(2660035).getEvaluacion(3));
        sahara.getUsuario(2660035).dislike(sahara.getUsuario(2660035).getEvaluacion(3));
        sahara.getUsuario(9023433).dislike(sahara.getUsuario(2660035).getEvaluacion(3));
        sahara.getUsuario(9454204).dislike(sahara.getUsuario(2660035).getEvaluacion(3));

        sahara.getUsuario(9023433).makeEvaluacion(sahara.getLibro(6815327), LocalDateTime.of(2024, 3, 8, 21, 1, 0), 4, "No es mi estilo");
        sahara.getUsuario(5629235).like(sahara.getUsuario(9023433).getEvaluacion(0));
        sahara.getUsuario(3303221).like(sahara.getUsuario(9023433).getEvaluacion(0));
        sahara.getUsuario(8368563).like(sahara.getUsuario(9023433).getEvaluacion(0));
        sahara.getUsuario(8368563).like(sahara.getUsuario(9023433).getEvaluacion(0));
        sahara.getUsuario(3303221).like(sahara.getUsuario(9023433).getEvaluacion(0));
        sahara.getUsuario(8702375).dislike(sahara.getUsuario(9023433).getEvaluacion(0));

        sahara.getUsuario(9023433).makeEvaluacion(sahara.getLibro(1938624), LocalDateTime.of(2024, 1, 2, 23, 42, 19), 3, "Me aburri");
        sahara.getUsuario(2132853).like(sahara.getUsuario(9023433).getEvaluacion(1));
        sahara.getUsuario(2442689).like(sahara.getUsuario(9023433).getEvaluacion(1));
        sahara.getUsuario(1430715).like(sahara.getUsuario(9023433).getEvaluacion(1));
        sahara.getUsuario(1442753).dislike(sahara.getUsuario(9023433).getEvaluacion(1));
        sahara.getUsuario(2442689).dislike(sahara.getUsuario(9023433).getEvaluacion(1));
        sahara.getUsuario(5629235).dislike(sahara.getUsuario(9023433).getEvaluacion(1));

        sahara.getUsuario(6247882).makeEvaluacion(sahara.getLibro(1536468), LocalDateTime.of(2024, 8, 16, 5, 31, 11), 3, "Interesante");
        sahara.getUsuario(4202746).like(sahara.getUsuario(6247882).getEvaluacion(0));
        sahara.getUsuario(9355492).like(sahara.getUsuario(6247882).getEvaluacion(0));
        sahara.getUsuario(5996833).dislike(sahara.getUsuario(6247882).getEvaluacion(0));

        sahara.getUsuario(6247882).makeEvaluacion(sahara.getLibro(1938624), LocalDateTime.of(2024, 6, 25, 1, 41, 17), 4, "Me aburri");
        sahara.getUsuario(9023433).like(sahara.getUsuario(6247882).getEvaluacion(1));
        sahara.getUsuario(2132853).like(sahara.getUsuario(6247882).getEvaluacion(1));
        sahara.getUsuario(6945232).like(sahara.getUsuario(6247882).getEvaluacion(1));
        sahara.getUsuario(6945232).like(sahara.getUsuario(6247882).getEvaluacion(1));
        sahara.getUsuario(5043746).dislike(sahara.getUsuario(6247882).getEvaluacion(1));

        sahara.getUsuario(6247882).makeEvaluacion(sahara.getLibro(7504514), LocalDateTime.of(2024, 2, 15, 15, 37, 4), 4, "No lo recomiendo");
        sahara.getUsuario(6945232).like(sahara.getUsuario(6247882).getEvaluacion(2));
        sahara.getUsuario(8368563).dislike(sahara.getUsuario(6247882).getEvaluacion(2));
        sahara.getUsuario(7775507).dislike(sahara.getUsuario(6247882).getEvaluacion(2));
        sahara.getUsuario(1442753).dislike(sahara.getUsuario(6247882).getEvaluacion(2));

        sahara.getUsuario(6247882).makeEvaluacion(sahara.getLibro(1046770), LocalDateTime.of(2024, 4, 12, 7, 23, 59), 2, "Me encanto");
        sahara.getUsuario(6247882).like(sahara.getUsuario(6247882).getEvaluacion(3));
        sahara.getUsuario(4202746).like(sahara.getUsuario(6247882).getEvaluacion(3));
        sahara.getUsuario(9454204).dislike(sahara.getUsuario(6247882).getEvaluacion(3));
        sahara.getUsuario(1442753).dislike(sahara.getUsuario(6247882).getEvaluacion(3));

        sahara.getUsuario(8702375).makeEvaluacion(sahara.getLibro(1938624), LocalDateTime.of(2024, 4, 17, 15, 26, 38), 5, "No es mi estilo");
        sahara.getUsuario(1266437).like(sahara.getUsuario(8702375).getEvaluacion(0));
        sahara.getUsuario(4202746).like(sahara.getUsuario(8702375).getEvaluacion(0));
        sahara.getUsuario(8702375).like(sahara.getUsuario(8702375).getEvaluacion(0));
        sahara.getUsuario(2660035).like(sahara.getUsuario(8702375).getEvaluacion(0));
        sahara.getUsuario(6247882).like(sahara.getUsuario(8702375).getEvaluacion(0));
        sahara.getUsuario(1442753).dislike(sahara.getUsuario(8702375).getEvaluacion(0));
        sahara.getUsuario(3303221).dislike(sahara.getUsuario(8702375).getEvaluacion(0));
        sahara.getUsuario(8368563).dislike(sahara.getUsuario(8702375).getEvaluacion(0));
        sahara.getUsuario(5910741).dislike(sahara.getUsuario(8702375).getEvaluacion(0));

        sahara.getUsuario(8702375).makeEvaluacion(sahara.getLibro(3541989), LocalDateTime.of(2024, 3, 19, 16, 3, 10), 3, "Buen libro");
        sahara.getUsuario(1442753).like(sahara.getUsuario(8702375).getEvaluacion(1));
        sahara.getUsuario(7775507).dislike(sahara.getUsuario(8702375).getEvaluacion(1));
        sahara.getUsuario(1442753).dislike(sahara.getUsuario(8702375).getEvaluacion(1));

        sahara.getUsuario(8702375).makeEvaluacion(sahara.getLibro(3541989), LocalDateTime.of(2024, 5, 3, 15, 26, 55), 5, "Lo mejor que he leido");
        sahara.getUsuario(5043746).like(sahara.getUsuario(8702375).getEvaluacion(2));
        sahara.getUsuario(5910741).dislike(sahara.getUsuario(8702375).getEvaluacion(2));
        sahara.getUsuario(4202746).dislike(sahara.getUsuario(8702375).getEvaluacion(2));
        sahara.getUsuario(9023433).dislike(sahara.getUsuario(8702375).getEvaluacion(2));
        sahara.getUsuario(9355492).dislike(sahara.getUsuario(8702375).getEvaluacion(2));

        sahara.getUsuario(2132853).makeEvaluacion(sahara.getLibro(8819883), LocalDateTime.of(2024, 1, 25, 3, 8, 32), 1, "No es mi estilo");
        sahara.getUsuario(2660035).like(sahara.getUsuario(2132853).getEvaluacion(0));
        sahara.getUsuario(2132853).like(sahara.getUsuario(2132853).getEvaluacion(0));
        sahara.getUsuario(9023433).like(sahara.getUsuario(2132853).getEvaluacion(0));
        sahara.getUsuario(3303221).like(sahara.getUsuario(2132853).getEvaluacion(0));
        sahara.getUsuario(5629235).like(sahara.getUsuario(2132853).getEvaluacion(0));
        sahara.getUsuario(5996833).dislike(sahara.getUsuario(2132853).getEvaluacion(0));
        sahara.getUsuario(7775507).dislike(sahara.getUsuario(2132853).getEvaluacion(0));
        sahara.getUsuario(8702375).dislike(sahara.getUsuario(2132853).getEvaluacion(0));
        sahara.getUsuario(6945232).dislike(sahara.getUsuario(2132853).getEvaluacion(0));
        sahara.getUsuario(1266437).dislike(sahara.getUsuario(2132853).getEvaluacion(0));

        sahara.getUsuario(2132853).makeEvaluacion(sahara.getLibro(2219628), LocalDateTime.of(2024, 4, 21, 22, 31, 58), 3, "Buen libro");
        sahara.getUsuario(4202746).like(sahara.getUsuario(2132853).getEvaluacion(1));
        sahara.getUsuario(9454204).like(sahara.getUsuario(2132853).getEvaluacion(1));
        sahara.getUsuario(1442753).like(sahara.getUsuario(2132853).getEvaluacion(1));
        sahara.getUsuario(2660035).like(sahara.getUsuario(2132853).getEvaluacion(1));
        sahara.getUsuario(6945232).like(sahara.getUsuario(2132853).getEvaluacion(1));
        sahara.getUsuario(9023433).dislike(sahara.getUsuario(2132853).getEvaluacion(1));

        sahara.getUsuario(2132853).makeEvaluacion(sahara.getLibro(3541989), LocalDateTime.of(2024, 9, 27, 15, 58, 21), 1, "Buen libro");
        sahara.getUsuario(2132853).like(sahara.getUsuario(2132853).getEvaluacion(2));
        sahara.getUsuario(6945232).dislike(sahara.getUsuario(2132853).getEvaluacion(2));
        sahara.getUsuario(1266437).dislike(sahara.getUsuario(2132853).getEvaluacion(2));

        sahara.getUsuario(2132853).makeEvaluacion(sahara.getLibro(6815327), LocalDateTime.of(2024, 10, 19, 15, 40, 31), 2, "No es mi estilo");
        sahara.getUsuario(5043746).like(sahara.getUsuario(2132853).getEvaluacion(3));
        sahara.getUsuario(7775507).like(sahara.getUsuario(2132853).getEvaluacion(3));
        sahara.getUsuario(2442689).like(sahara.getUsuario(2132853).getEvaluacion(3));
        sahara.getUsuario(5629235).like(sahara.getUsuario(2132853).getEvaluacion(3));
        sahara.getUsuario(6247882).dislike(sahara.getUsuario(2132853).getEvaluacion(3));
        sahara.getUsuario(5043746).dislike(sahara.getUsuario(2132853).getEvaluacion(3));
        sahara.getUsuario(9355492).dislike(sahara.getUsuario(2132853).getEvaluacion(3));
        sahara.getUsuario(7775507).dislike(sahara.getUsuario(2132853).getEvaluacion(3));
        sahara.getUsuario(3303221).dislike(sahara.getUsuario(2132853).getEvaluacion(3));

        sahara.getUsuario(1266437).makeEvaluacion(sahara.getLibro(6815327), LocalDateTime.of(2024, 9, 26, 9, 23, 37), 4, "Lo mejor que he leido");
        sahara.getUsuario(7775507).like(sahara.getUsuario(1266437).getEvaluacion(0));
        sahara.getUsuario(8368563).like(sahara.getUsuario(1266437).getEvaluacion(0));
        sahara.getUsuario(3303221).dislike(sahara.getUsuario(1266437).getEvaluacion(0));
        sahara.getUsuario(4202746).dislike(sahara.getUsuario(1266437).getEvaluacion(0));
        sahara.getUsuario(1442753).dislike(sahara.getUsuario(1266437).getEvaluacion(0));
        sahara.getUsuario(5629235).dislike(sahara.getUsuario(1266437).getEvaluacion(0));
        sahara.getUsuario(3303221).dislike(sahara.getUsuario(1266437).getEvaluacion(0));

        sahara.getUsuario(1266437).makeEvaluacion(sahara.getLibro(5219426), LocalDateTime.of(2024, 6, 6, 21, 54, 54), 5, "Regular");
        sahara.getUsuario(1430715).like(sahara.getUsuario(1266437).getEvaluacion(1));
        sahara.getUsuario(1430715).like(sahara.getUsuario(1266437).getEvaluacion(1));
        sahara.getUsuario(5996833).like(sahara.getUsuario(1266437).getEvaluacion(1));
        sahara.getUsuario(2132853).dislike(sahara.getUsuario(1266437).getEvaluacion(1));
        sahara.getUsuario(2132853).dislike(sahara.getUsuario(1266437).getEvaluacion(1));
        sahara.getUsuario(2442689).dislike(sahara.getUsuario(1266437).getEvaluacion(1));
        sahara.getUsuario(1266437).dislike(sahara.getUsuario(1266437).getEvaluacion(1));
        sahara.getUsuario(2132853).dislike(sahara.getUsuario(1266437).getEvaluacion(1));

        sahara.getUsuario(1266437).makeEvaluacion(sahara.getLibro(5219426), LocalDateTime.of(2024, 12, 15, 17, 22, 56), 1, "Me aburri");
        sahara.getUsuario(7775507).like(sahara.getUsuario(1266437).getEvaluacion(2));
        sahara.getUsuario(2660035).like(sahara.getUsuario(1266437).getEvaluacion(2));
        sahara.getUsuario(5996833).like(sahara.getUsuario(1266437).getEvaluacion(2));
        sahara.getUsuario(5629235).like(sahara.getUsuario(1266437).getEvaluacion(2));
        sahara.getUsuario(2442689).dislike(sahara.getUsuario(1266437).getEvaluacion(2));

        sahara.getUsuario(1266437).makeEvaluacion(sahara.getLibro(5460105), LocalDateTime.of(2024, 11, 3, 0, 45, 37), 1, "Interesante");
        sahara.getUsuario(5996833).like(sahara.getUsuario(1266437).getEvaluacion(3));
        sahara.getUsuario(9023433).like(sahara.getUsuario(1266437).getEvaluacion(3));
        sahara.getUsuario(1442753).like(sahara.getUsuario(1266437).getEvaluacion(3));
        sahara.getUsuario(6247882).like(sahara.getUsuario(1266437).getEvaluacion(3));
        sahara.getUsuario(1442753).like(sahara.getUsuario(1266437).getEvaluacion(3));
        sahara.getUsuario(5910741).dislike(sahara.getUsuario(1266437).getEvaluacion(3));
        sahara.getUsuario(6945232).dislike(sahara.getUsuario(1266437).getEvaluacion(3));
        sahara.getUsuario(9023433).dislike(sahara.getUsuario(1266437).getEvaluacion(3));

        sahara.getUsuario(5996833).makeEvaluacion(sahara.getLibro(1938624), LocalDateTime.of(2024, 6, 4, 19, 23, 41), 5, "Me encanto");
        sahara.getUsuario(1430715).like(sahara.getUsuario(5996833).getEvaluacion(0));
        sahara.getUsuario(2442689).like(sahara.getUsuario(5996833).getEvaluacion(0));
        sahara.getUsuario(1430715).like(sahara.getUsuario(5996833).getEvaluacion(0));
        sahara.getUsuario(2660035).like(sahara.getUsuario(5996833).getEvaluacion(0));
        sahara.getUsuario(1266437).like(sahara.getUsuario(5996833).getEvaluacion(0));
        sahara.getUsuario(9454204).dislike(sahara.getUsuario(5996833).getEvaluacion(0));
        sahara.getUsuario(6247882).dislike(sahara.getUsuario(5996833).getEvaluacion(0));
        sahara.getUsuario(2442689).dislike(sahara.getUsuario(5996833).getEvaluacion(0));

        sahara.getUsuario(1442753).makeEvaluacion(sahara.getLibro(5797583), LocalDateTime.of(2024, 2, 2, 12, 29, 25), 2, "Interesante");
        sahara.getUsuario(5910741).like(sahara.getUsuario(1442753).getEvaluacion(0));
        sahara.getUsuario(5910741).like(sahara.getUsuario(1442753).getEvaluacion(0));
        sahara.getUsuario(4202746).dislike(sahara.getUsuario(1442753).getEvaluacion(0));
        sahara.getUsuario(9454204).dislike(sahara.getUsuario(1442753).getEvaluacion(0));
        sahara.getUsuario(5043746).dislike(sahara.getUsuario(1442753).getEvaluacion(0));
        sahara.getUsuario(2442689).dislike(sahara.getUsuario(1442753).getEvaluacion(0));

        sahara.getUsuario(1442753).makeEvaluacion(sahara.getLibro(5598169), LocalDateTime.of(2024, 5, 2, 14, 11, 4), 2, "Me hizo llorar");
        sahara.getUsuario(6945232).like(sahara.getUsuario(1442753).getEvaluacion(1));
        sahara.getUsuario(2442689).like(sahara.getUsuario(1442753).getEvaluacion(1));
        sahara.getUsuario(5910741).like(sahara.getUsuario(1442753).getEvaluacion(1));
        sahara.getUsuario(2660035).like(sahara.getUsuario(1442753).getEvaluacion(1));
        sahara.getUsuario(8368563).like(sahara.getUsuario(1442753).getEvaluacion(1));
        sahara.getUsuario(5996833).dislike(sahara.getUsuario(1442753).getEvaluacion(1));
        sahara.getUsuario(5043746).dislike(sahara.getUsuario(1442753).getEvaluacion(1));
        sahara.getUsuario(6945232).dislike(sahara.getUsuario(1442753).getEvaluacion(1));

        sahara.getUsuario(1442753).makeEvaluacion(sahara.getLibro(7504514), LocalDateTime.of(2024, 11, 14, 7, 40, 29), 1, "Buen libro");
        sahara.getUsuario(4202746).like(sahara.getUsuario(1442753).getEvaluacion(2));
        sahara.getUsuario(8702375).like(sahara.getUsuario(1442753).getEvaluacion(2));
        sahara.getUsuario(9023433).like(sahara.getUsuario(1442753).getEvaluacion(2));
        sahara.getUsuario(1430715).like(sahara.getUsuario(1442753).getEvaluacion(2));
        sahara.getUsuario(5996833).dislike(sahara.getUsuario(1442753).getEvaluacion(2));
        sahara.getUsuario(5629235).dislike(sahara.getUsuario(1442753).getEvaluacion(2));
        sahara.getUsuario(5629235).dislike(sahara.getUsuario(1442753).getEvaluacion(2));
        sahara.getUsuario(2442689).dislike(sahara.getUsuario(1442753).getEvaluacion(2));

        sahara.getUsuario(5629235).makeEvaluacion(sahara.getLibro(1536468), LocalDateTime.of(2024, 7, 18, 9, 36, 24), 1, "Me encanto");
        sahara.getUsuario(1442753).like(sahara.getUsuario(5629235).getEvaluacion(0));
        sahara.getUsuario(6247882).dislike(sahara.getUsuario(5629235).getEvaluacion(0));
        sahara.getUsuario(9023433).dislike(sahara.getUsuario(5629235).getEvaluacion(0));
        sahara.getUsuario(2660035).dislike(sahara.getUsuario(5629235).getEvaluacion(0));

        sahara.getUsuario(5629235).makeEvaluacion(sahara.getLibro(5797583), LocalDateTime.of(2024, 4, 11, 0, 26, 8), 1, "No me gusto");
        sahara.getUsuario(2442689).like(sahara.getUsuario(5629235).getEvaluacion(1));
        sahara.getUsuario(5629235).like(sahara.getUsuario(5629235).getEvaluacion(1));
        sahara.getUsuario(1430715).like(sahara.getUsuario(5629235).getEvaluacion(1));
        sahara.getUsuario(2660035).like(sahara.getUsuario(5629235).getEvaluacion(1));
        sahara.getUsuario(5629235).like(sahara.getUsuario(5629235).getEvaluacion(1));
        sahara.getUsuario(2442689).dislike(sahara.getUsuario(5629235).getEvaluacion(1));

        sahara.getUsuario(5629235).makeEvaluacion(sahara.getLibro(5598169), LocalDateTime.of(2024, 6, 21, 0, 47, 21), 5, "Me aburri");
        sahara.getUsuario(1430715).like(sahara.getUsuario(5629235).getEvaluacion(2));
        sahara.getUsuario(5629235).like(sahara.getUsuario(5629235).getEvaluacion(2));
        sahara.getUsuario(3303221).like(sahara.getUsuario(5629235).getEvaluacion(2));
        sahara.getUsuario(3303221).dislike(sahara.getUsuario(5629235).getEvaluacion(2));
        sahara.getUsuario(7775507).dislike(sahara.getUsuario(5629235).getEvaluacion(2));
        sahara.getUsuario(7775507).dislike(sahara.getUsuario(5629235).getEvaluacion(2));
        sahara.getUsuario(1430715).dislike(sahara.getUsuario(5629235).getEvaluacion(2));
        sahara.getUsuario(9454204).dislike(sahara.getUsuario(5629235).getEvaluacion(2));

        sahara.getUsuario(5629235).makeEvaluacion(sahara.getLibro(4206245), LocalDateTime.of(2024, 9, 11, 4, 3, 13), 2, "Me hizo llorar");
        sahara.getUsuario(6945232).like(sahara.getUsuario(5629235).getEvaluacion(3));
        sahara.getUsuario(9023433).like(sahara.getUsuario(5629235).getEvaluacion(3));
        sahara.getUsuario(1266437).dislike(sahara.getUsuario(5629235).getEvaluacion(3));
        sahara.getUsuario(5043746).dislike(sahara.getUsuario(5629235).getEvaluacion(3));

        sahara.getUsuario(5910741).makeEvaluacion(sahara.getLibro(6815327), LocalDateTime.of(2024, 4, 10, 20, 8, 57), 1, "Buen libro");
        sahara.getUsuario(6945232).like(sahara.getUsuario(5910741).getEvaluacion(0));
        sahara.getUsuario(5910741).like(sahara.getUsuario(5910741).getEvaluacion(0));
        sahara.getUsuario(9454204).like(sahara.getUsuario(5910741).getEvaluacion(0));
        sahara.getUsuario(3303221).dislike(sahara.getUsuario(5910741).getEvaluacion(0));
        sahara.getUsuario(2442689).dislike(sahara.getUsuario(5910741).getEvaluacion(0));
        sahara.getUsuario(6945232).dislike(sahara.getUsuario(5910741).getEvaluacion(0));
        sahara.getUsuario(2660035).dislike(sahara.getUsuario(5910741).getEvaluacion(0));
        sahara.getUsuario(5910741).dislike(sahara.getUsuario(5910741).getEvaluacion(0));

        sahara.getUsuario(5910741).makeEvaluacion(sahara.getLibro(1938624), LocalDateTime.of(2024, 11, 23, 8, 55, 52), 4, "No es mi estilo");
        sahara.getUsuario(1442753).like(sahara.getUsuario(5910741).getEvaluacion(1));
        sahara.getUsuario(6945232).like(sahara.getUsuario(5910741).getEvaluacion(1));
        sahara.getUsuario(3303221).dislike(sahara.getUsuario(5910741).getEvaluacion(1));
        sahara.getUsuario(9023433).dislike(sahara.getUsuario(5910741).getEvaluacion(1));
        sahara.getUsuario(9454204).dislike(sahara.getUsuario(5910741).getEvaluacion(1));
        sahara.getUsuario(8368563).dislike(sahara.getUsuario(5910741).getEvaluacion(1));
        sahara.getUsuario(8702375).dislike(sahara.getUsuario(5910741).getEvaluacion(1));

        sahara.getUsuario(7775507).makeEvaluacion(sahara.getLibro(1536468), LocalDateTime.of(2024, 4, 3, 7, 48, 25), 3, "Me encanto");
        sahara.getUsuario(9023433).like(sahara.getUsuario(7775507).getEvaluacion(0));
        sahara.getUsuario(9023433).like(sahara.getUsuario(7775507).getEvaluacion(0));
        sahara.getUsuario(5043746).like(sahara.getUsuario(7775507).getEvaluacion(0));
        sahara.getUsuario(5629235).like(sahara.getUsuario(7775507).getEvaluacion(0));
        sahara.getUsuario(8702375).like(sahara.getUsuario(7775507).getEvaluacion(0));
        sahara.getUsuario(8368563).dislike(sahara.getUsuario(7775507).getEvaluacion(0));
        sahara.getUsuario(3303221).dislike(sahara.getUsuario(7775507).getEvaluacion(0));
        sahara.getUsuario(9023433).dislike(sahara.getUsuario(7775507).getEvaluacion(0));
        sahara.getUsuario(5629235).dislike(sahara.getUsuario(7775507).getEvaluacion(0));

        sahara.getUsuario(1430715).makeEvaluacion(sahara.getLibro(4206245), LocalDateTime.of(2024, 12, 27, 23, 2, 34), 1, "Regular");
        sahara.getUsuario(5043746).like(sahara.getUsuario(1430715).getEvaluacion(0));
        sahara.getUsuario(5043746).like(sahara.getUsuario(1430715).getEvaluacion(0));
        sahara.getUsuario(2132853).like(sahara.getUsuario(1430715).getEvaluacion(0));
        sahara.getUsuario(8368563).like(sahara.getUsuario(1430715).getEvaluacion(0));
        sahara.getUsuario(6945232).dislike(sahara.getUsuario(1430715).getEvaluacion(0));
        sahara.getUsuario(8702375).dislike(sahara.getUsuario(1430715).getEvaluacion(0));

        sahara.getUsuario(4202746).makeEvaluacion(sahara.getLibro(4777103), LocalDateTime.of(2024, 11, 10, 3, 48, 51), 4, "Me aburri");
        sahara.getUsuario(5910741).like(sahara.getUsuario(4202746).getEvaluacion(0));
        sahara.getUsuario(2660035).like(sahara.getUsuario(4202746).getEvaluacion(0));
        sahara.getUsuario(2442689).like(sahara.getUsuario(4202746).getEvaluacion(0));
        sahara.getUsuario(6945232).like(sahara.getUsuario(4202746).getEvaluacion(0));
        sahara.getUsuario(8368563).like(sahara.getUsuario(4202746).getEvaluacion(0));
        sahara.getUsuario(5910741).dislike(sahara.getUsuario(4202746).getEvaluacion(0));

        sahara.getUsuario(2442689).makeEvaluacion(sahara.getLibro(8819883), LocalDateTime.of(2024, 1, 22, 17, 12, 35), 4, "No es mi estilo");
        sahara.getUsuario(5043746).like(sahara.getUsuario(2442689).getEvaluacion(0));
        sahara.getUsuario(5910741).dislike(sahara.getUsuario(2442689).getEvaluacion(0));
        sahara.getUsuario(2660035).dislike(sahara.getUsuario(2442689).getEvaluacion(0));
        sahara.getUsuario(5629235).dislike(sahara.getUsuario(2442689).getEvaluacion(0));
        sahara.getUsuario(2132853).dislike(sahara.getUsuario(2442689).getEvaluacion(0));

        sahara.getUsuario(2442689).makeEvaluacion(sahara.getLibro(6815327), LocalDateTime.of(2024, 7, 19, 19, 17, 19), 1, "Me hizo llorar");
        sahara.getUsuario(2660035).like(sahara.getUsuario(2442689).getEvaluacion(1));
        sahara.getUsuario(2442689).like(sahara.getUsuario(2442689).getEvaluacion(1));
        sahara.getUsuario(1430715).like(sahara.getUsuario(2442689).getEvaluacion(1));
        sahara.getUsuario(6945232).dislike(sahara.getUsuario(2442689).getEvaluacion(1));

        sahara.getUsuario(2442689).makeEvaluacion(sahara.getLibro(1536468), LocalDateTime.of(2024, 12, 18, 17, 9, 41), 1, "Buen libro");
        sahara.getUsuario(8368563).like(sahara.getUsuario(2442689).getEvaluacion(2));
        sahara.getUsuario(2442689).like(sahara.getUsuario(2442689).getEvaluacion(2));
        sahara.getUsuario(2660035).like(sahara.getUsuario(2442689).getEvaluacion(2));
        sahara.getUsuario(6247882).like(sahara.getUsuario(2442689).getEvaluacion(2));
        sahara.getUsuario(8702375).like(sahara.getUsuario(2442689).getEvaluacion(2));
        sahara.getUsuario(6247882).dislike(sahara.getUsuario(2442689).getEvaluacion(2));

        sahara.getUsuario(6945232).makeEvaluacion(sahara.getLibro(6815327), LocalDateTime.of(2024, 3, 12, 5, 42, 29), 1, "Buen libro");
        sahara.getUsuario(6945232).like(sahara.getUsuario(6945232).getEvaluacion(0));
        sahara.getUsuario(6247882).like(sahara.getUsuario(6945232).getEvaluacion(0));
        sahara.getUsuario(5910741).like(sahara.getUsuario(6945232).getEvaluacion(0));
        sahara.getUsuario(5996833).like(sahara.getUsuario(6945232).getEvaluacion(0));
        sahara.getUsuario(5043746).dislike(sahara.getUsuario(6945232).getEvaluacion(0));
        sahara.getUsuario(5910741).dislike(sahara.getUsuario(6945232).getEvaluacion(0));
    }
    
}
