import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       //TODO: Conhcer e importar a classe scanner
        Scanner sc = new Scanner(System.in);
        //Exibir as mensagens para o nosso usuário
        //obter pela scanner os valores digitados no terminal
        //exibir a mensagem conta criada
        System.out.println("Bem vindo ao banco, vamos criar a sua conta");

        System.out.println("Por favor, digite o seu nome: ");
        String nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o número da conta: ");
        int numeroConta = sc.nextInt();
        sc.nextLine();

        System.out.println("Por favor, digite o número da agência: ");
        String agencia = sc.nextLine();

        System.out.println("Por favor, digite o seu saldo inicial: ");
        double saldo = sc.nextDouble();
        sc.close();

        String mensagem = "Olá %s, obrigado por criar uma conta em nosso banco sua Agência é %sConta %d e seu saldo R$%.2f já está disponível para saque.";
        System.out.println(String.format(mensagem, nomeCliente, agencia, numeroConta, saldo));
        

    }
}
