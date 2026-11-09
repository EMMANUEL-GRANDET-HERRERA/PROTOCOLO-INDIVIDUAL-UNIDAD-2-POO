package taller5;
class Producto {
 String nombre; double precio; int stock;
 Producto(String n,double p,int s){nombre=n;precio=p;stock=s;}
 void mostrarInfo(){System.out.println(nombre+" | $"+precio+" | stock: "+stock);}
}