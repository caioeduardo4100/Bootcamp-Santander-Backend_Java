public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("2376506");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.err.println("Há erros de digitação no CEP: " + e);
            e.printStackTrace();
        }
    }

    // Verifica se há erros nos digitos do CEP
    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8) {
            throw new CepInvalidoException();
        }
        return cep;
    }
}
