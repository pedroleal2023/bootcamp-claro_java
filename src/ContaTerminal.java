import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    /* - Conhecer e importar a classe scanner
     - Exibir as mensagens para o usuário
     - Obter pelo scanner os valoers digitados no terminal
     - Exibir a mensagem conta criada com sucesso!

    */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
          
        int numero;
        String agencia;
        String nomeCliente;
        double saldo; 
        double deposito;

        System.out.print("Por favor, digite o numero da conta: ");
        numero = sc.nextInt();
        System.out.println();
        System.out.print("Por favor, digite o numero da agência: ");
        agencia = sc.next();
        System.out.println();  
        System.out.print("Por favor, digite o seu nome: ");
        nomeCliente = sc.next();
        System.out.println();
        System.out.print("Valor para deposito: ");
        deposito = sc.nextDouble();

        double soma = 0;
        saldo = 237.48;

          soma = saldo + deposito;

        if (soma < 300.0){
            System.out.println("SALDO INSUFICIENTE PARA SAQUE.");
        } else {
            System.out.println("SEU SALDO É: " + soma);
        }

        System.out.println("Caro Senhor(a) " + nomeCliente +", esses são os dados de sua conta em nosso banco. Sua agência é: " + agencia +", conta: " + numero + " seu saldo: " + saldo);
       sc.close();    
    }
}
