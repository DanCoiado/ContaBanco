class Conta
{
   private double saldo;

   public Conta(){
   }
   
   public Conta(double saldo) {
      this.saldo = saldo;
   }

   public void saldo () {
      System.out.printf("O saldo é de %.2f", saldo);
   }
   
   public void saque (double saque) {
      if (saque < saldo){
         saldo -= saque;
      }else {
         System.out.println("Saldo insulficiente");
      }
   }
   
   public void deposito (double deposito) {
      saldo += deposito;
   }
}