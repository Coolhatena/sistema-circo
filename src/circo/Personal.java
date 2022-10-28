/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circo;

/**
 *
 * @author zunni
 */
public class Personal {
    String nombre;
    public int horasTrabajo, numeroEmpleado;


public Personal(String nombre, int horasTrabajo, int genero){
    this.nombre=nombre;
    this.numeroEmpleado=genero;
    this.horasTrabajo=horasTrabajo;
    }
}