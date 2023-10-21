package trabajoPracticoPOO.Caballero.Bilbioteca;

import java.time.Year;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca("La nueva");
        
        Autor autor1 = new Autor("Neruda", Year.of(1937));
        Autor autor2 = new Autor("Garcia", Year.of(1953));
        Autor autor3 = new Autor("Marquez", Year.of(1935));
        Autor autor4 = new Autor("Tolkien", Year.of(1960));

        Libro libro1 = new Libro("libro1", List.of(autor3, autor2), true);
        Libro libro2 = new Libro("libro2", List.of(autor1, autor2), true);
        Libro libro3 = new Libro("libro3", List.of(autor3, autor4), true);

        biblioteca.registrarLibro(libro3);
        biblioteca.registrarLibro(libro2);
        biblioteca.registrarLibro(libro1);

        System.out.println(biblioteca.buscarPorAutor(autor2).toString());
        System.out.println(biblioteca.buscarPorTitulo("libr").toString());
        System.out.println(biblioteca.buscarPorTituloExacto("libro1").toString());
    }
}
