public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        
        String meuNome = "Nome";
        
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        // Declaração de variável constante (O valor da variável não pode ser alterado após ser declarado)
        
        final int numero = 5;
        
        System.out.println(meuNome);
        System.out.println(numeroCurto2);
        System.out.println(numero);
        
    }
}
