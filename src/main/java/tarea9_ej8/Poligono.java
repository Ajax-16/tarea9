package tarea9_ej8;

import java.util.*;


/**
 * Class Poligono
 */
public class Poligono {

  //
  // Fields
  //

  private ArrayList<Punto> listaPuntos;
  
  //
  // Constructors
  //
  public Poligono () {

    listaPuntos = new ArrayList<>();

  };
  
  //
  // Methods
  //

  //
  // Accessor methods
  //

  public ArrayList<Punto> getListaPuntos() {
    return listaPuntos;
  }

  public void setListaPuntos(ArrayList<Punto> listaPuntos) {
    this.listaPuntos = listaPuntos;
  }

  //
  // Other methods
  //

}
