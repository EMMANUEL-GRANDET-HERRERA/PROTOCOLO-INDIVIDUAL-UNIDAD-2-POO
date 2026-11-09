package taller4;
public class Producto {
 private double precio;
 public Producto(double p){actualizarPrecio(p);}
 public double getPrecio(){return precio;}
 public void actualizarPrecio(double p){
  if(p>=0)precio=p; else System.out.println("Precio no valido.");
 }
}