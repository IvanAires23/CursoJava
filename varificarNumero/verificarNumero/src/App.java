import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira um número
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        // Verificar se o número é par ou ímpar
        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }

        // Verificar se o número é positivo, negativo ou zero
        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }

        // Fechar o Scanner para evitar vazamento de recursos
        scanner.close();
    }
}
