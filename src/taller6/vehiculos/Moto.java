package taller6.vehiculos;
public class Moto extends Vehiculo {
 private int cilindrada;
 public Moto(String t,String m,int c){super(t,m);cilindrada=c;}
 public void mostrarDatos(){System.out.println(tipo+" | "+marca+" | "+cilindrada+" cc");}
 public static void main(String[] args){new Moto("Deportiva","Yamaha",300).mostrarDatos();}
}