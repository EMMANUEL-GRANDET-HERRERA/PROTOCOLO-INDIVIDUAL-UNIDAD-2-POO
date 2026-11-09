package taller6;
public class Gerente extends Empleado {
 private String departamento;
 public Gerente(String n,double s,String d){super(n,s);departamento=d;}
 @Override protected void mostrarInformacion(){super.mostrarInformacion();System.out.println("Departamento: "+departamento);}
 public static void main(String[] args){new Gerente("Sofia",4500000,"Tecnologia").mostrarInformacion();}
}