public class Contador {
    public static void main(String[] args) {
        System.out.println("Contador em laço while");
        int contador = 1;
        while(contador <= 10) {
            System.out.println(contador);
            contador++;
        }

        System.out.println("Contador em laço for");
        for(int counter = 1; counter <= 10; counter++) {
            System.out.println(counter);
        }
    }
}