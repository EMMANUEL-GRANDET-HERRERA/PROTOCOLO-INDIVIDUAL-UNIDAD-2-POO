package taller4;
public class PruebaEstudiante {
 public static void main(String[] args){
  Estudiante e=new Estudiante("Laura",19,4.5);
  System.out.println(e.getNombre()+" - "+e.getEdad()+" - "+e.getNotaPromedio());
  e.setEdad(20); e.setNotaPromedio(4.7);
  System.out.println("Nuevo promedio: "+e.getNotaPromedio());
 }
}