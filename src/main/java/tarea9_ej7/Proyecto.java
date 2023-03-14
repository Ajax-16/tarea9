package tarea9_ej7;

import java.time.LocalDate;
import java.util.*;


/**
 * Class Proyecto
 */
public class Proyecto {

  //
  // Fields
  //

  private LocalDate fecha_inicio;
  private LocalDate fecha_fin;
  private String descripcion;

  private ArrayList<Empleado> listaEmpleado;

  private Lugar lugar;

  //
  // Constructors
  //

  public Proyecto(LocalDate fecha_inicio, LocalDate fecha_fin, String descripcion, Lugar lugar) {
    this.fecha_inicio = fecha_inicio;
    this.fecha_fin = fecha_fin;
    this.descripcion = descripcion;
    this.listaEmpleado = new ArrayList<>();
    this.lugar = lugar;
  }

  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of fecha_inicio
   * @param newVar the new value of fecha_inicio
   */
  public void setFecha_inicio (LocalDate newVar) {
    fecha_inicio = newVar;
  }

  /**
   * Get the value of fecha_inicio
   * @return the value of fecha_inicio
   */
  public LocalDate getFecha_inicio () {
    return fecha_inicio;
  }

  /**
   * Set the value of fecha_fin
   * @param newVar the new value of fecha_fin
   */
  public void setFecha_fin (LocalDate newVar) {
    fecha_fin = newVar;
  }

  /**
   * Get the value of fecha_fin
   * @return the value of fecha_fin
   */
  public LocalDate getFecha_fin () {
    return fecha_fin;
  }

  /**
   * Set the value of descripcion
   * @param newVar the new value of descripcion
   */
  public void setDescripcion (String newVar) {
    descripcion = newVar;
  }

  /**
   * Get the value of descripcion
   * @return the value of descripcion
   */
  public String getDescripcion () {
    return descripcion;
  }

  //
  // Other methods
  //


  public ArrayList<Empleado> getListaEmpleado() {
    return listaEmpleado;
  }

  public void setListaEmpleado(ArrayList<Empleado> listaEmpleado) {
    this.listaEmpleado = listaEmpleado;
  }
}
