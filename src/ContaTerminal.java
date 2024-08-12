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
        
        System.out.println("Por favor, digite o numero da conta: ");
        numero = sc.nextInt();
        
        System.out.print("Por favor, digite o numero da agência: ");
        agencia = sc.next();

        System.out.print("Por favor, digite o seu nome: ");
        nomeCliente = sc.next();
        
        saldo = 237.48;

        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    
       sc.close();
    
    
    
    }
}
