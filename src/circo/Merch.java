
package circo;

/** @author zunni*/

public class Merch extends Articulo {
    public String color, material;
    
    public Merch(int id, String tipo, String nombre, double precio, String color, String material, boolean empacado) {
        super(id, tipo, nombre, precio, empacado);
        this.color = color;
        this.material = material;
    }
    
    public String Datos(){
        String empacadoTexto = (condicion)? "Si" : "No";
        
        return "\nId del producto: "+id+
               "\nTipo de Merch: "+tipo+
               "\nNombre: "+nombre+
               "\nPrecio: "+precio+
               "\nColor: "+color+
               "\nMaterial: "+material+
               "\nNecesita empacado?: "+empacadoTexto+"\n";
    }
}