package tarea9;

/**
 * Class Rectangulo
 */
public class Rectangulo {

  //
  // Fields
  //

  private float base;
  private float altura;
  private String color;
  
  //
  // Constructors
  //
  public Rectangulo (String color, float base, float altura) {

    this.color = color;

    this.base = base;

    this.altura = altura;

  };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of base
   * @param newVar the new value of base
   */
  public void setBase (float newVar) {
    base = newVar;
  }

  /**
   * Get the value of base
   * @return the value of base
   */
  public float getBase () {
    return base;
  }

  /**
   * Set the value of altura
   * @param newVar the new value of altura
   */
  public void setAltura (float newVar) {
    altura = newVar;
  }

  /**
   * Get the value of altura
   * @return the value of altura
   */
  public float getAltura () {
    return altura;
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
