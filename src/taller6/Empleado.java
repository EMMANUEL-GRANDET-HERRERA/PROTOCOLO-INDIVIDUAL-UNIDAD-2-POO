package taller6;
public class Empleado {
 protected String nombre; protected double salario;
 public Empleado(String n,double s){nombre=n;salario=s;}
 protected void mostrarInformacion(){System.out.println("Nombre: "+nombre+" | Salario: "+salario);}
}