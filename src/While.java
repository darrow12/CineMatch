import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0; // armazena a soma das notas digitadas
        double nota = 0; // armazena cada nota digitada
        int totalDeNotas = 0; // conta o numero total de notas

        while (nota != -1) {
            System.out.println("Digite sua avaliação para o filme ou -1 para encerrar");
            nota = leitura.nextDouble();

            if (nota != -1) {
                mediaAvaliacao += nota;
                totalDeNotas++;
            }
        }

        System.out.println("Média de avaliações " + mediaAvaliacao/totalDeNotas);
    }
}
