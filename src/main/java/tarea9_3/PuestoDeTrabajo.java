package tarea9_3;

import java.time.LocalDate;
import java.util.*;


/**
 * Class PuestoDeTrabajo
 */
public class PuestoDeTrabajo {

  //
  // Fields
  //

  private String nombrePuesto;
  private LocalDate fechaInicio;
  private LocalDate fechaFin;
  private float salario;
  private Persona trabajador;
  private Persona jefe;
  private String lugarDepartamento;
  
  //
  // Constructors
  //
  public PuestoDeTrabajo (Persona trabajador, Persona jefe, String nombrePuesto, LocalDate fechaInicio, LocalDate fechaFin, float salario, String lugarDepartamento) {

    this.trabajador = trabajador;
    this.jefe = jefe;
    this.nombrePuesto = nombrePuesto;
    this.fechaInicio = fechaInicio;
    this.fechaFin = fechaFin;
    this.salario = salario;
    this.lugarDepartamento = lugarDepartamento;

  };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of nombrePuesto
   * @param newVar the new value of nombrePuesto
   */
  public void setNombrePuesto (String newVar) {
    nombrePuesto = newVar;
  }

  /**
   * Get the value of nombrePuesto
   * @return the value of nombrePuesto
   */
  public String getNombrePuesto () {
    return nombrePuesto;
  }

  /**
   * Set the value of fechaInicio
   * @param newVar the new value of fechaInicio
   */
  public void setFechaInicio (LocalDate newVar) {
    fechaInicio = newVar;
  }

  /**
   * Get the value of fechaInicio
   * @return the value of fechaInicio
   */
  public LocalDate getFechaInicio () {
    return fechaInicio;
  }

  /**
   * Set the value of fechaFin
   * @param newVar the new value of fechaFin
   */
  public void setFechaFin (LocalDate newVar) {
    fechaFin = newVar;
  }

  /**
   * Get the value of fechaFin
   * @return the value of fechaFin
   */
  public LocalDate getFechaFin () {
    return fechaFin;
  }

  /**
   * Set the value of salario
   * @param newVar the new value of salario
   */
  public void setSalario (float newVar) {
    salario = newVar;
  }

  /**
   * Get the value of salario
   * @return the value of salario
   */
  public float getSalario () {
    return salario;
  }

  /**
   * Set the value of trabajador
   * @param newVar the new value of trabajador
   */
  public void setTrabajador (Persona newVar) {
    trabajador = newVar;
  }

  /**
   * Get the value of trabajador
   * @return the value of trabajador
   */
  public Persona getTrabajador () {
    return trabajador;
  }

  /**
   * Set the value of jefe
   * @param newVar the new value of jefe
   */
  public void setJefe (Persona newVar) {
    jefe = newVar;
  }

  /**
   * Get the value of jefe
   * @return the value of jefe
   */
  public Persona getJefe () {
    return jefe;
  }

  /**
   * Set the value of lugarDepartamento
   * @param newVar the new value of lugarDepartamento
   */
  public void setLugarDepartamento (String newVar) {
    lugarDepartamento = newVar;
  }

  /**
   * Get the value of lugarDepartamento
   * @return the value of lugarDepartamento
   */
  public String getLugarDepartamento () {
    return lugarDepartamento;
  }

  //
  // Other methods
  //

}
