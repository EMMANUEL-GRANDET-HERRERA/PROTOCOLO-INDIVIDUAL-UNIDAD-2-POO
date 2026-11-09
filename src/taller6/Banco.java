package taller6;
public class Banco {
 private double saldo;
 public Banco(double s){saldo=Math.max(0,s);}
 public double consultarSaldo(){return saldo;}
 public void depositar(double c){if(c>0)saldo+=c;}
 public boolean retirar(double c){if(c>0&&c<=saldo){saldo-=c;return true;}return false;}
}