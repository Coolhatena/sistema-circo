
package circo;


/** @author zunni*/

public class Insumo extends Articulo {
    public String proveedor, marca;
    
    public Insumo(int id, String tipo, String nombre, double precio, String proveedor, String marca, boolean manejo) {
        super(id, tipo, nombre, precio, manejo);
        this.proveedor = proveedor;
        this.marca = marca;
    }
    
 
    public String Datos(){
        String manejoTexto = (condicion)? "Si" : "No";
        
        return "\nId del producto: "+id+
               "\nTipo de Insumo: "+tipo+
               "\nNombre: "+nombre+
               "\nPrecio: "+precio+
               "\nProveedor: "+proveedor+
               "\nMarca: "+marca+
               "\nNecesita manejo especial?: "+manejoTexto+"\n";
    }
}