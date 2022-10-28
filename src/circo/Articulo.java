
package circo;

/**
 *
 * @author zunni
 */
public class Articulo {
    public int id;
    String tipo,
           nombre;
    double precio;
    boolean condicion;
    
    public Articulo(int id, String tipo, String nombre, double precio, boolean condicion){
        this.id = id;
        this.tipo = tipo;
        this.nombre = nombre;
        this.precio = precio;
        this.condicion = condicion;
    }

}
   
