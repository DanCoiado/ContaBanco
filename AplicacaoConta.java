import java.util.Scanner;

class AplicacaoConta{
   public static void main(String args[]){
      Conta d123 = new Conta();
      Scanner dado = new Scanner(System.in);
      double deposito, saque;
      int opcao;
      
      d123.saldo();
      
      System.out.println("\n Menu Conta:\n1 - Saque\n2 - Deposito\n3 - Saldo\n0 - Sair");
      opcao = dado.nextInt();
      
      while(opcao != 0) {
         switch (opcao) {
            case 0:
               break;
            case 1: 
               System.out.print("Digite o valor de Saque: ");
               saque = dado.nextDouble();
               d123.saque(saque);
               break;
            case 2:
               System.out.print("Digite o valor de deposito: ");
               deposito = dado.nextDouble();
               d123.deposito(deposito);
               break;
            case 3:
               d123.saldo();
               break;
            default:
               System.out.print("Opcao invalida.");
               break;
         }
         System.out.println("\n Menu Conta:\n1 - Saque\n2 - Deposito\n3 - Saldo\n0 - Sair");
         opcao = dado.nextInt();
      }
      System.out.print("Obrigado por acessar a conta");
   }
}