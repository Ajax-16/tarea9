package tarea9;

/**
 * Class Cuadrado
 */
public class Cuadrado {

  //
  // Fields
  //

  private float lado;
  private String color;
  
  //
  // Constructors
  //
  public Cuadrado (String color, float lado) {

    this.color = color;

    this.lado = lado;

  };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of lado
   * @param newVar the new value of lado
   */
  public void setLado (float newVar) {
    lado = newVar;
  }

  /**
   * Get the value of lado
   * @return the value of lado
   */
  public float getLado () {
    return lado;
  }

  /**
   * Set the value of color
   * @param newVar the new value of color
   */
  public void setColor (String newVar) {
    color = newVar;
  }

  /**
   * Get the value of color
   * @return the value of color
   */
  public String getColor () {
    return color;
  }

  //
  // Other methods
  //

}