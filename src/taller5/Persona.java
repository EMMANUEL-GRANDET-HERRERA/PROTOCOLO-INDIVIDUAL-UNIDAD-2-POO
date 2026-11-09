package taller5;
public class Persona {
 private String nombre; int edad;
 public Persona(String n,int e){nombre=n;edad=e;}
 public String getNombre(){return nombre;}
 public void setNombre(String n){if(n!=null&&!n.trim().isEmpty())nombre=n;}
}