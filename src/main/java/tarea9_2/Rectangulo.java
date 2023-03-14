package tarea9_2;

/**
 * Class Rectangulo
 */
public class Rectangulo extends Cuadrilatero {

  //
  // Fields
  //

  private float base;
  private float altura;
  
  //
  // Constructors
  //
  public Rectangulo () { };
  
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

  //
  // Other methods
  //

}
