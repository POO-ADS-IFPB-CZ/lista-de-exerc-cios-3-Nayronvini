import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MegaSena megaSena = new MegaSena();

        System.out.println("Digite 6 números da Mega-Sena (de 1 a 60, sem repetir):");

        while (megaSena.getNumerosOrdenados().size() < 6) {
            System.out.print("Número " + (megaSena.getNumerosOrdenados().size() + 1) + ": ");
            int numero = scanner.nextInt();
            megaSena.adicionarNumero(numero);
        }

        System.out.println("\nNúmeros sorteados (em ordem crescente):");
        for (int num : megaSena.getNumerosOrdenados()) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
