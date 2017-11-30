package randomnumbergenerator;

import java.util.Random;

public class RandomNumberGenerator {

    public void gerarAleatorio(int numInicial, int numFinal, int qtdNumeros) throws IllegalArgumentException {
        if (numFinal <= numInicial) {
            throw new IllegalArgumentException("Número final não pode ser menor ou igual número inicial");
        } else if ((numFinal - numInicial) < qtdNumeros) {
            throw new IllegalArgumentException("Quantidade de números não pode ser menor que intervalo de números");
        } else if (numInicial < 0 || numFinal < 0 || qtdNumeros < 0) {
            throw new IllegalArgumentException("Não é possível utilizar números negativos");
        } else {
            Random random = new Random();
            for (int i = 0; i < qtdNumeros; i++) {
                int randomInt = random.nextInt(numFinal);
                System.out.println(randomInt);
            }
        }
    }

    public static void main(String[] args) {
        RandomNumber randomNumber = new RandomNumber();
        randomNumber.gerarAleatorio(1, 60, 6);
    }

}
