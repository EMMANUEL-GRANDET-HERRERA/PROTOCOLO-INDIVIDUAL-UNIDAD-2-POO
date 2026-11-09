package taller5;
public class PruebaPersona {
 public static void main(String[] args){
  Persona p=new Persona("Andres",21);
  System.out.println(p.getNombre()); System.out.println(p.edad);
  p.edad=22; p.setNombre("Andres Felipe");
 }
}