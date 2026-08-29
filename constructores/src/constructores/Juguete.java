
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
     public Juguete(String nombre, int cantidad)
    {
    this.nombre = this.nombre;
    this.cantidad = cantidad;
    }
    public Juguete(String nombre, double precio)
    {
    this.nombre = nombre;
    this.precio = precio;
    }
    public Juguete(int cantidad, double precio)
    {
    this.cantidad = cantidad;
    this.precio = precio;
    }
    
}
