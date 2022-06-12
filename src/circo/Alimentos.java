
package circo;

/** @author zunni*/

public class Alimentos extends Articulo {
    public String proveedor, tipoPreparacion;
    
    public Alimentos(String tipo, String nombre, double precio, String proveedor, String tipoPreparacion, boolean refrigeracion) {
        super(tipo, nombre, precio, refrigeracion);
        this.proveedor = proveedor;
        this.tipoPreparacion = tipoPreparacion;
    }
    
 
    public String Datos(){
        String refrigeracionTexto = (condicion)? "Si" : "No";
        
        return "\nTipo de alimento: "+tipo+
               "\nNombre: "+nombre+
               "\nPrecio: "+precio+
               "\nProveedor: "+proveedor+
               "\nTipo de preparacion: "+tipoPreparacion+
               "\nNecesita refrigeracion?: "+refrigeracionTexto+"\n";
    }
}
