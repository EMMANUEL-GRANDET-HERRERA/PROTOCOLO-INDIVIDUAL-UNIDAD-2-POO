package taller6;
public class PruebaBanco {
 public static void main(String[] args){
  Banco b=new Banco(500000);b.depositar(100000);b.retirar(50000);
  System.out.println("Saldo: "+b.consultarSaldo());
 }
}