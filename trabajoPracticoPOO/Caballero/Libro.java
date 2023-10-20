package trabajoPracticoPOO.Caballero;

import java.util.ArrayList;
import java.util.Scanner;


public class Libro {
    
    String titulo;
    String genero;
    ArrayList<Autor> autores;
    Boolean isDisponible;
    Scanner scan = new Scanner(System.in);

    public Libro(String titulo, String genero, Boolean isDisponible){
        this.titulo = titulo;
        this.genero = genero;
        this.isDisponible = isDisponible;
        this.agregarAutores();
    }

    public void agregarAutores(){
        System.out.println("Debe ingresar al menos un autor");
        String x = "";
        do {
            autores.add(Autor.asignarAutor());
            System.out.println("Desea agregar otro autor?");
            x = scan.nextLine();
        } while(x == "");
    }

    public void alquilarLibro(){
        this.isDisponible = false;
    }

    public void devolverLibro(){
        this.isDisponible = true;
    }







}
