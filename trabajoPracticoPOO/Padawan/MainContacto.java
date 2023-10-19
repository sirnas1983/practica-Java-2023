package trabajoPracticoPOO.Padawan;
/*Agenda de Contactos. Implementar una clase Contacto con atributos como
nombre, número de teléfono y correo electrónico. Utiliza una LinkedList para
almacenar los contactos. La aplicación debe permitir agregar, eliminar, buscar y
mostrar la lista de contactos. */

public class MainContacto {public static void main(String[] args) {

        Contacto juan = new Contacto("Juan", "3773-444444", "Juan@email.com");
        Contacto.agregarContacto(juan);
        Contacto marcos = new Contacto("Marcos", "3763-442244", "marcos@email.com");
        Contacto.agregarContacto(marcos);
        Contacto pedro = new Contacto("pedro", "3644-442244", "pedro@email.com");
        Contacto.agregarContacto(pedro);
        Contacto.buscarContacto();
        Contacto.getContactos();
    }
}
