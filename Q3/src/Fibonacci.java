import java.util.ArrayList;

public class Fibonacci {
    public ArrayList<Integer> gerarSequencia(int n) {
        ArrayList<Integer> sequencia = new ArrayList<>();

        if (n <= 0) {
            return sequencia; // Retorna lista vazia se n <= 0
        }

        sequencia.add(0);
        if (n == 1) return sequencia;

        sequencia.add(1);

        for (int i = 2; i < n; i++) {
            int proximo = sequencia.get(i - 1) + sequencia.get(i - 2);
            sequencia.add(proximo);
        }

        return sequencia;
    }
}
