import java.util.ArrayList;
import java.util.Collections;

public class MegaSena {
    private ArrayList<Integer> numeros;

    public MegaSena() {
        this.numeros = new ArrayList<>();
    }

    public boolean adicionarNumero(int numero) {
        if (numero < 1 || numero > 60) {
            System.out.println("Número inválido! Digite um número entre 1 e 60.");
            return false;
        }
        if (numeros.contains(numero)) {
            System.out.println("Número já inserido! Digite um número diferente.");
            return false;
        }
        numeros.add(numero);
        return true;
    }

    public ArrayList<Integer> getNumerosOrdenados() {
        ArrayList<Integer> ordenados = new ArrayList<>(numeros);
        Collections.sort(ordenados);
        return ordenados;
    }
}

