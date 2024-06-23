import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        Double mesada = 50.0;

        while (mesada > 0) {
            Double valorDoce = ValorAleatorio();

            if (valorDoce > mesada) 
                mesada = valorDoce;
                System.out.printf(String.format("Valor do doce: %.2f", valorDoce, " Adicionado ao carrinho"));
                System.out.println();
                mesada -= valorDoce;
            } 
        System.out.println("Mesada: " + mesada); 
        System.out.println("Joãozinho gastou todo a sua mesada em doces");
    }

    private static double ValorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2,15);
    }
}
