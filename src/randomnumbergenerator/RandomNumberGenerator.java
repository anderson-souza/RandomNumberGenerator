package randomnumbergenerator;

import java.util.HashSet;
import java.util.Random;

public class RandomNumberGenerator {

    HashSet<Integer> numeros;
    Random random;

    public RandomNumberGenerator() {
        this.numeros = new HashSet<>();
        random = new Random();
    }

    public void Aleatorizar(int numInicial, int numFinal, int qtdNumeros) throws IllegalArgumentException {
        if (numFinal <= numInicial) {
            throw new IllegalArgumentException("Número final não pode ser menor ou igual número inicial");
        } else if ((numFinal - numInicial) < qtdNumeros) {
            throw new IllegalArgumentException("Quantidade de números não pode ser menor que intervalo de números");
        } else if (numInicial < 0 || numFinal < 0 || qtdNumeros < 0) {
            throw new IllegalArgumentException("Não é possível utilizar números negativos");
        }
        numFinal++;//Necessário pois o método Random exclui o último número informado
        for (int i = 0; i < qtdNumeros; i++) {
            int numeroGerado = 0;
            do {
                numeroGerado = random.nextInt(numFinal);
            } while ((numeroGerado < numInicial) || (numeros.contains(numeroGerado)));
            numeros.add(numeroGerado);

            if ((numFinal - 1) == numeroGerado) { //
                numFinal--;
            }
            System.out.println(numeroGerado);
        }
    }
}
