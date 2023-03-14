package tarea9;

/**
 * Class Circulo
 */
public class Circulo {

  //
  // Fields
  //

  private String color;
  private float radio;
  
  //
  // Constructors
  //
  public Circulo (String color, float radio) {

    this.color = color;

    this.radio = radio;

  };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

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

  /**
   * Set the value of radio
   * @param newVar the new value of radio
   */
  public void setRadio (float newVar) {
    radio = newVar;
  }

  /**
   * Get the value of radio
   * @return the value of radio
   */
  public float getRadio () {
    return radio;
  }

  //
  // Other methods
  //

}
