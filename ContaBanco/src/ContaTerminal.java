import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite o número da agência: ");
        String agencia = entrada.nextLine();

        System.out.print("Digite o seu número: ");
        int numero = entrada.nextInt();

        System.out.print("Informe seu saldo atual: ");
        double saldo = entrada.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque");

        entrada.close();
        
    } 

}

