public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o CineMatch");
        System.out.println("Filme: Top Gun: Maverick");

        int ano;
        ano = 2022;
        System.out.println("O ano de lançamento do Filme foi em " + ano);
        boolean incluidoNoPlano = false;
        double notaFinalDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) / 3; // Expressões matemáticas no Java seguem a precedência de operadores
        System.out.println(media);

        String sinopse; // TODO Por que String é uma classe?
        sinopse = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                Muito bom!
                Ano de lançamento
                """ + ano;
        System.out.println(sinopse); // Text Blocking acontecendo
        /* Olha só, um comentário de várias linhas! */

        int classificacao = (int) (media /2); // casting explicito - explicacao escrita: eu sei que eu to fazendo, vai lá
        System.out.println(classificacao);
    }
}