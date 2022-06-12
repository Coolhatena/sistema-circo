
package circo;

/** @author zunni*/

public class Merch extends Articulo {
    public String color, material;
    
    public Merch(String tipo, String nombre, double precio, String color, String material, boolean empacado) {
        super(tipo, nombre, precio, empacado);
        this.color = color;
        this.material = material;
    }
    
    public String Datos(){
        String empacadoTexto = (condicion)? "Si" : "No";
        
        return "\nTipo de Merch: "+tipo+
               "\nNombre: "+nombre+
               "\nPrecio: "+precio+
               "\nColor: "+color+
               "\nMaterial: "+material+
               "\nNecesita empacado?: "+empacadoTexto+"\n";
    }
}