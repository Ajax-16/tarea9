package tarea9_3;

import java.time.LocalDate;
import java.util.*;


/**
 * Class Persona
 */
public class Persona {

  //
  // Fields
  //

  private String nombre;
  private String apellido1;
  private String apellido2;
  private LocalDate fechaDeNacimiento;
  private String sexo;
  private int identificador;
  
  //
  // Constructors
  //
  public Persona (String nombre, String apellido1, String apellido2, LocalDate fechaDeNacimiento, String sexo, int identificador) {

    this.nombre =  nombre;
    this.apellido1 = apellido1;
    this.apellido2 = apellido2;
    this.fechaDeNacimiento = fechaDeNacimiento;
    this.sexo = sexo;
    this.identificador = identificador;

  };
  
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
   * Set the value of apellido1
   * @param newVar the new value of apellido1
   */
  public void setApellido1 (String newVar) {
    apellido1 = newVar;
  }

  /**
   * Get the value of apellido1
   * @return the value of apellido1
   */
  public String getApellido1 () {
    return apellido1;
  }

  /**
   * Set the value of apellido2
   * @param newVar the new value of apellido2
   */
  public void setApellido2 (String newVar) {
    apellido2 = newVar;
  }

  /**
   * Get the value of apellido2
   * @return the value of apellido2
   */
  public String getApellido2 () {
    return apellido2;
  }

  /**
   * Set the value of fechaDeNacimiento
   * @param newVar the new value of fechaDeNacimiento
   */
  public void setFechaDeNacimiento (LocalDate newVar) {
    fechaDeNacimiento = newVar;
  }

  /**
   * Get the value of fechaDeNacimiento
   * @return the value of fechaDeNacimiento
   */
  public LocalDate getFechaDeNacimiento () {
    return fechaDeNacimiento;
  }

  /**
   * Set the value of sexo
   * @param newVar the new value of sexo
   */
  public void setSexo (String newVar) {
    sexo = newVar;
  }

  /**
   * Get the value of sexo
   * @return the value of sexo
   */
  public String getSexo () {
    return sexo;
  }

  /**
   * Set the value of identificador
   * @param newVar the new value of identificador
   */
  public void setIdentificador (int newVar) {
    identificador = newVar;
  }

  /**
   * Get the value of identificador
   * @return the value of identificador
   */
  public int getIdentificador () {
    return identificador;
  }

  //
  // Other methods
  //

}
