import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);

        System.out.print("Digite o valor do parâmetro 1: ");
        int parametroUM = terminal.nextInt();
    
        System.out.print("Digite o valor do parâmetro 2: ");
        int parametroDois = terminal.nextInt();

        try {

            contar(parametroUM, parametroDois);

        } catch (ParametrosInvalidosException exception) {
            System.err.println("O segundo parâmetro deve ser maior que o primeiro: " + exception);
        }

        terminal.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Verifica se o parâmetro 1 é maior que o parâmetro 2
        if (parametroUm > parametroDois) {
            //Lança a exceção
            throw new ParametrosInvalidosException();
            // Parte OPCIONAL: Valida caso o usuário digite 2 valores iguais nos parâmetros 
        } else if (parametroUm == parametroDois) {
            System.out.println("Vocẽ não poderá obter um resultado se o valor dos parãmetros forem iguais");
        } else {
            // Realiza o FOR caso contrário
            int contagem = parametroDois - parametroUm;
            
            // Imprime os números na horizontal
            for (int i = 0; i < contagem; i++) {
                System.out.print((i+1) + " ");
            }
            System.out.println();
        }
    }
}