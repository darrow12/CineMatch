public class Test {
    public static void main(String[] args) {
        /* Em Java, é possível comparar duas Strings utilizando o operador ==. Porém, esse operador verifica apenas se as duas variáveis apontam para o mesmo objeto na memória, e não se o conteúdo das Strings é igual. Para comparar o conteúdo de duas Strings, é necessário utilizar o método equals(). Por exemplo: */
        String senha = "12345";
        if (senha.equals("12345")) {
            System.out.println("Acesso autorizado!");
        } else {
            System.out.println("Senha incorreta.");
        }

        /* TODO equalsIgnoreCase()
        É usado para que a comparação de Strings desconsidere as letras maiúsculas e minúsculas. Utilizando apenas o equals, as String “alura” e “Alura” seriam consideradas diferentes.
        */

        String nome = "Maria";
        int idade = 30;
        double valor = 55.9999;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));
        /*
        - %s indica que uma String será inserida no placeholder
        - %d indica um valor inteiro
        - %f indica um valor decimal.

        Os valores das variáveis nome, idade e valor são passados como parâmetros para o método String.format, substituindo os placeholders %s, %d e %.2f, respectivamente.
        Perceba também que o placeholder %.2f indica que o valor deve ser formatado com duas casas decimais.
        */

        String name = "Emerson";
        int aulas = 4;

        String mensagem = """
                  Olá, %s!
                  Boas vindas ao curso de Java.
                  Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                  """.formatted(name, aulas);

        System.out.println(mensagem);
    }
}
