package tarea9_ej7;

import java.util.*;


/**
 * Class Empleado
 */
public class Empleado {

  //
  // Fields
  //

  private String nombre;
  private String apellidos;
  private String rol_asociado;
  
  //
  // Constructors
  //

  public Empleado(String nombre, String apellidos, String rol_asociado) {
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.rol_asociado = rol_asociado;
  }


  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of nombre
   * @param newVar the new value of nombre
   */
  public void setNombre (String newVar) {
    nombre = newVar;
  }

  /**
   * Get the value of nombre
   * @return the value of nombre
   */
  public String getNombre () {
    return nombre;
  }

  /**
   * Set the value of apellidos
   * @param newVar the new value of apellidos
   */
  public void setApellidos (String newVar) {
    apellidos = newVar;
  }

  /**
   * Get the value of apellidos
   * @return the value of apellidos
   */
  public String getApellidos () {
    return apellidos;
  }

  /**
   * Set the value of rol_asociado
   * @param newVar the new value of rol_asociado
   */
  public void setRol_asociado (String newVar) {
    rol_asociado = newVar;
  }

  /**
   * Get the value of rol_asociado
   * @return the value of rol_asociado
   */
  public String getRol_asociado () {
    return rol_asociado;
  }

  //
  // Other methods
  //

}
