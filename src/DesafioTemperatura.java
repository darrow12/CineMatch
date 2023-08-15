public class DesafioTemperatura {
    public static void main(String[] args) {
        /* Escreva um programa que converta uma temperatura em graus Celsius para Fahrenheit

        Utilize variáveis para representar os valores das temperaturas e imprima no console o valor convertido de Celsius para Fahrenheit.

        Dica: A fórmula para converter temperaturas de graus Celsius para Fahrenheit é: (temperatura * 1.8) + 32.

        Depois de finalizar, testar e conferir que seu programa foi executado com sucesso, crie uma variável inteira para exibir a temperatura em Fahrenheit sem casas decimais. Lembre-se que provavelmente você precisará fazer um casting de valores.
        */

        double Celsius = 17.4;
        double Fahrenheit = (Celsius * 1.8) + 32;
        System.out.println("A temperatura em Fahrenheit é: " + (int) Fahrenheit);

        /* Correção:

        String temperatura = String.format("A temperatura de %f Celsius é equivalente a %f Fahrenheit", Celsius, Fahrenheit);
        System.out.println(temperatura);
        int temperaturaEmFahrenheitInteira = (int) Fahrenheit;
        System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaEmFahrenheitInteira);
         */
    }
}
