package taller4;
public class PruebaCoche {
 public static void main(String[] args){
  Coche c=new Coche("Toyota","Corolla",180); c.acelerar(20);
  System.out.println(c.getMarca()+" "+c.getModelo()+" - "+c.getVelocidadMaxima());
  // System.out.println(c.marca); // Error: marca es private.
 }
}