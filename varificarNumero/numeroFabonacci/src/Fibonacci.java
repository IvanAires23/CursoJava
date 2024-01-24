import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // Criar um Scanner para receber a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira o tamanho da sequência
        System.out.print("Digite o tamanho da sequência de Fibonacci: ");
        int tamanho = scanner.nextInt();

        // Gerar a sequência de Fibonacci e imprimir na tela
        System.out.println("Sequência de Fibonacci de tamanho " + tamanho + ":");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(calcularFibonacci(i) + " ");
        }

        // Fechar o Scanner para evitar vazamento de recursos
        scanner.close();
    }

    // Método para calcular o número de Fibonacci para uma posição específica
    public static int calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }
}
