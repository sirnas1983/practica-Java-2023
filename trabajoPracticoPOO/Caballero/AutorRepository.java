package trabajoPracticoPOO.Caballero;

import java.util.HashMap;

public class AutorRepository {
    
    static public HashMap<String, Autor> autores;

    public static void agregarAutor(Autor autor){
        autores.put(autor.nombre+autor.apellido, autor);
    }
    
}
