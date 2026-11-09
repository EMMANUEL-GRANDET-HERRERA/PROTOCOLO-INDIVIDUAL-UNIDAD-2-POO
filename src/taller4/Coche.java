package taller4;
public class Coche {
 private String marca, modelo; private double velocidadMaxima;
 public Coche(String m,String mo,double v){marca=m;modelo=mo;velocidadMaxima=Math.max(0,v);}
 public String getMarca(){return marca;} public String getModelo(){return modelo;}
 public double getVelocidadMaxima(){return velocidadMaxima;}
 public void acelerar(double incremento){if(incremento>0)velocidadMaxima+=incremento;}
}