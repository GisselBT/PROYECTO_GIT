
package proyectogs;



public class ProyectoGS {

    
    public static void main(String[] args) 
    {
      Estudiante est1 = new Estudiante();
      est1.setNombre("camaron");
      est1.setDocumento("12345");
      est1.setEdad(12);
      est1.setCarrera("Veterinaria");
      
      PROFESOR profesor1 = new PROFESOR();
       profesor1.setNombre("Molly");
      profesor1.setDocumento("098345");
      profesor1.setEdad(46);
      profesor1.setMateria("Marketing Digital");
      profesor1.setSalario(24.000);
      
    }
    
}
