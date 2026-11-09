package taller5;
public class PruebaProducto {
 public static void main(String[] args){
  Producto p=new Producto("Teclado",80000,12); p.mostrarInfo();
  p.precio=75000; p.mostrarInfo();
 }
}