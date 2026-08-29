
package constructores;


public class Juguete 
{
     private String nombre = "";
    private int cantidad = 0;
    private double precio =0.0;

    public Juguete(String nombre)
    {
    this.nombre = nombre;
    }
    public Juguete(int cantidad)
    {
    this.cantidad = cantidad;
    }
    public Juguete(double precio)
    {
    this.precio=precio;
    }
    
}
