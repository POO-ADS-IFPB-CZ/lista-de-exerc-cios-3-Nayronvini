import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fibonacci fibonacci = new Fibonacci();

        System.out.print("Digite quantos números da sequência de Fibonacci deseja ver: ");
        int n = scanner.nextInt();

        ArrayList<Integer> resultado = fibonacci.gerarSequencia(n);

        System.out.println("Sequência de Fibonacci com " + n + " números:");
        System.out.println(resultado);

        scanner.close();
    }
}
