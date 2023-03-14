package tarea9_ej7;

import java.time.LocalDate;

public class Main4 {

    public static void main(String[] args) {

        Lugar Almería = new Lugar(1, "Av. Santa Isabel 88", "Almería", "Almería");

        Proyecto proyectoJS = new Proyecto(LocalDate.of(2022, 1, 1),
                LocalDate.of(2022, 6, 6), "Proyecto de creación de una App JS"
                , Almería);

        Empleado e1 = new Empleado("Juan", "Lopera Sánchez", "Programador");
        Empleado e2 = new Empleado("Cristina", "Nechydiuk Alexandrov", "Diseñadora");
        Empleado e3 = new Empleado("Andrei", "Stefan Stefan", "Programador");

        proyectoJS.getListaEmpleado().add(e1);
        proyectoJS.getListaEmpleado().add(e2);

    }

}
