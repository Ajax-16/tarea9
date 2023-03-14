package tarea9_ej8;

import java.util.*;


/**
 * Class Punto
 */
public class Punto {

  //
  // Fields
  //

  private int coordenadaX;
  private int coordenadaY;
  
  //
  // Constructors
  //

  public Punto(int coordenadaX, int coordenadaY) {
    this.coordenadaX = coordenadaX;
    this.coordenadaY = coordenadaY;
  }

  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of coordenadaX
   * @param newVar the new value of coordenadaX
   */
  public void setCoordenadaX (int newVar) {
    coordenadaX = newVar;
  }

  /**
   * Get the value of coordenadaX
   * @return the value of coordenadaX
   */
  public int getCoordenadaX () {
    return coordenadaX;
  }

  /**
   * Set the value of coordenadaY
   * @param newVar the new value of coordenadaY
   */
  public void setCoordenadaY (int newVar) {
    coordenadaY = newVar;
  }

  /**
   * Get the value of coordenadaY
   * @return the value of coordenadaY
   */
  public int getCoordenadaY () {
    return coordenadaY;
  }

  //
  // Other methods
  //

}
