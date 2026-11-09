package taller4;
public class Estudiante {
 private String nombre; private int edad; private double notaPromedio;
 public Estudiante(String n,int e,double p){setNombre(n);setEdad(e);setNotaPromedio(p);}
 public String getNombre(){return nombre;}
 public void setNombre(String n){if(n!=null&&!n.trim().isEmpty())nombre=n;}
 public int getEdad(){return edad;}
 public void setEdad(int e){if(e>=0)edad=e;}
 public double getNotaPromedio(){return notaPromedio;}
 public void setNotaPromedio(double p){if(p>=0&&p<=5)notaPromedio=p;}
}