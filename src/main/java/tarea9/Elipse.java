package tarea9;

/**
 * Class Elipse
 */
public class Elipse {

  //
  // Fields
  //

  private String color;
  private float ejeMayor;
  private float ejeMenor;
  
  //
  // Constructors
  //
  public Elipse (String color, float ejeMayor, float ejeMenor) {

    this.color = color;

    this.ejeMayor = ejeMayor;

    this.ejeMenor = ejeMenor;

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
   * Set the value of ejeMayor
   * @param newVar the new value of ejeMayor
   */
  public void setEjeMayor (float newVar) {
    ejeMayor = newVar;
  }

  /**
   * Get the value of ejeMayor
   * @return the value of ejeMayor
   */
  public float getEjeMayor () {
    return ejeMayor;
  }

  /**
   * Set the value of ejeMenor
   * @param newVar the new value of ejeMenor
   */
  public void setEjeMenor (float newVar) {
    ejeMenor = newVar;
  }

  /**
   * Get the value of ejeMenor
   * @return the value of ejeMenor
   */
  public float getEjeMenor () {
    return ejeMenor;
  }

  //
  // Other methods
  //

}
