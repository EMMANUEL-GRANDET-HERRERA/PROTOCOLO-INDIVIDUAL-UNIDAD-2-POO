package taller4;
public class PruebaProducto {
 public static void main(String[] args){
  Producto p=new Producto(25000); p.actualizarPrecio(-500);
  System.out.println("Precio: "+p.getPrecio());
 }
}