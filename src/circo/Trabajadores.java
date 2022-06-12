/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circo;

import java.util.Scanner;

/** @author zunni*/

public class Trabajadores extends Personal {
    String area, equipo;
    boolean uniforme;
    
    
    public Trabajadores(String nombre, int horasTrabajo, int numeroEmpleado, String area, String equipo, Boolean uniforme) {
        super(nombre, horasTrabajo, numeroEmpleado);
        this.area = area;
        this.equipo = equipo;
        this.uniforme = uniforme;
        }
    
 
    public String Datos(){
        String uniformeTexto = (uniforme)? "Si" : "No";
        
        return "\nNumero de empleado: "+numeroEmpleado+
               "\nNombre: "+nombre+
               "\nHoras de trabajo: "+horasTrabajo+
               "\nArea: "+area+
               "\nEquipo que necesita: "+equipo+
               "\nNecesita uniforme?: "+uniformeTexto+"\n";
    }
}