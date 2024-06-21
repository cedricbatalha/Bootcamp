public class FormatadorCepExemplo{
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("2376564");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            //throw new RuntimeException(e);
            //e.printStackTrace();
            System.out.println("O CEP não corresponde com as regras de negócio");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() !=8)
            throw new CepInvalidoException();

        return "23.765-064";
    }
}
