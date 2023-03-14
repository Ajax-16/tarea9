package tarea9_3;

import java.time.LocalDate;

public class Main3 {

    public static void main(String[] args) {

        Persona trabajador1 = new Persona("Paco", "González", "Peralta",
                LocalDate.of(1972, 5, 8), "Masculino", 1);

        Persona trabajador2 = new Persona("Francisco José", "Rivera", "Pantoja",
                LocalDate.of(1984, 2, 9), "Masculino", 2);

        PuestoDeTrabajo programadorJS = new PuestoDeTrabajo(trabajador2, trabajador1, "programador JS",
                LocalDate.of(2022, 1, 1), LocalDate.of(2022, 6, 1), 2300f,
                "Sevilla");

        PuestoDeTrabajo programadorReact = new PuestoDeTrabajo(trabajador2, trabajador1, "programador React",
                LocalDate.of(2022, 6, 2), LocalDate.of(2023, 3, 7), 2800f,
                "Sevilla");

    }

}