
package circo;

/**
 *
 * @author zunni
 */
public class Articulo {
    String tipo,
           nombre;
    double precio;
    boolean condicion;
    
    public Articulo(String tipo, String nombre, double precio, boolean condicion){
        this.tipo = tipo;
        this.nombre=nombre;
        this.precio=precio;
        this.condicion = condicion;
    }

}
   
