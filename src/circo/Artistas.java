
package circo;

/** @author zunni*/

public class Artistas extends Personal {
    public String tipoShow;
    public String vestuario;
    public String seguridad;
    
    
    public Artistas(String nombre, int horasTrabajo, int numeroEmpleado, String tipoShow, String vestuario, String seguridad) {
        super(nombre, horasTrabajo, numeroEmpleado);
        this.tipoShow = tipoShow;
        this.vestuario = vestuario;
        this.seguridad = seguridad;
        }
    
 
    public String Datos(){
        
        return "\nNumero de empleado: "+numeroEmpleado+
               "\nNombre: "+nombre+
               "\nHoras de trabajo: "+horasTrabajo+
               "\nTipo de show: "+tipoShow+
               "\nMedidas de seguridad: "+seguridad+
               "\nDescripcion de vestuario: "+vestuario;
    }
}