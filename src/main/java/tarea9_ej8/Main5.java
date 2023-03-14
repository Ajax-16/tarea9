package tarea9_ej8;

public class Main5 {

    public static void main(String[] args) {

        // Declaramos los 4 puntos que componen el polígono

        Punto pt1 = new Punto(-10, 10);
        Punto pt2 = new Punto(-10, 10);
        Punto pt3 = new Punto(-10, -10);
        Punto pt4 = new Punto(10, -10);

        // Declaramos el polígono

        Poligono pol1 = new Poligono();

        // Accedemos a la lista de puntos del polígono y añadimos todos los puntos creados

        pol1.getListaPuntos().add(pt1);
        pol1.getListaPuntos().add(pt2);
        pol1.getListaPuntos().add(pt3);
        pol1.getListaPuntos().add(pt4);

        // Declaramos los 3 puntos que componen el triángulo

        Punto ptT1 = new Punto(0, 0);
        Punto ptT2 = new Punto(20, 10);
        Punto ptT3 = new Punto(20, 0);

        // Declaramos el triángulo

        Poligono triangulo = new Poligono();

        // Accedemos a la lista de puntos del triángulo para añadir los 3 puntos creados

        triangulo.getListaPuntos().add(ptT1);
        triangulo.getListaPuntos().add(ptT2);
        triangulo.getListaPuntos().add(ptT3);

    }

}
