package trabajoPracticoPOO.Caballero;

import java.util.ArrayList;
import java.util.Scanner;


public class Libro {
    
    String titulo;
    ArrayList<Autor> autores;
    String genero;
    Boolean isDisponible;
    Scanner scan = new Scanner(System.in);

    public Libro(String titulo, String genero, Boolean isDisponible){
        this.titulo = titulo;
        this.genero = genero;
        this.isDisponible = isDisponible;
        this.autores = this.agregarAutores();
    }

    public ArrayList<Autor> agregarAutores(){
        ArrayList<Autor> autores = new ArrayList<>();
        System.out.println("Debe ingresar al menos un autor");
        String x = "";
        do {
            autores.add(AutorRepository.asignarAutor());
            System.out.println("Desea agregar otro autor?");
            x = scan.nextLine();
        } while(x == "");
        return autores;
    }

    public void alquilarLibro(){
        this.isDisponible = false;
    }

    public void devolverLibro(){
        this.isDisponible = true;
    }







}
