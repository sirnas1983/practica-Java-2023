package trabajoPracticoPOO.Padawan;

import java.time.LocalDate;

public class Calificacion {

    Double calificacion;
    LocalDate fechaCalificacion;

    public Calificacion(Double calificacion, String fecha){
        this.fechaCalificacion = LocalDate.parse(fecha);
        if(calificacion <= 10f && calificacion >= 0f){
            this.calificacion = calificacion;
        } else {
            System.out.println("La calificacion debe estar entre 0 y 10, no fue asignada la calificacion a esta instancia.");
        }
    }

}
