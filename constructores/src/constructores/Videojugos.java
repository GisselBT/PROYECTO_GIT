/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructores;

/**
 *
 * @author admin
 */
public class Videojugos 
{
     private String nombre = "";
    private int dificultad = 0;
    private double precio =0.0;
    

    public Videojugos(String nombre)
    {
    this.nombre = nombre;
    }
    public Videojugos(int dificultad)
    {
    this.dificultad = dificultad;
    }
    public Videojugos(double precio)
    {
    this.precio=precio;
    }
    public Videojugos(String nombre, int dificultad)
    {
    this.nombre = nombre;
    this.dificultad =dificultad;
    }
    public Videojugos(String nombre, double precio)
    {
    this.nombre = nombre;
    this.precio = precio;
    }
    public Videojugos(int dificultad, double precio)
    {
    this.dificultad = dificultad;
    this.precio = precio;
    }
    public Videojugos(String nombre,int dificultad,double precio )
    {
    this.nombre =nombre;
    this.dificultad = dificultad;
    this.precio = precio;
    }    
}
