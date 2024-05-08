public class MinhaClasse {
    public static void main(String[] args) {
        
        String primeiroNome = "Kyle";
        String segundoNome = "Crane";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

    }
    
    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do primeiro método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
