package com.andersonsouza.randomnumbergenerator;

import java.util.HashSet;
import java.util.Random;

public class RandomNumberGenerator {

    HashSet<Integer> numbers;
    Random random;

    public RandomNumberGenerator() {
        this.numbers = new HashSet<>();
        random = new Random();
    }

    public void Generate(int firstNumber, int finalNumber, int quantityOfNumbers) throws IllegalArgumentException {
        if (finalNumber <= firstNumber) {
            throw new IllegalArgumentException("Número final não pode ser menor ou igual número inicial");
        } else if ((finalNumber - firstNumber) < quantityOfNumbers) {
            throw new IllegalArgumentException("Quantidade de números não pode ser menor que intervalo de números");
        } else if (firstNumber < 0 || finalNumber < 0 || quantityOfNumbers < 0) {
            throw new IllegalArgumentException("Não é possível utilizar números negativos");
        }
        finalNumber++;//Necessário pois o método Random exclui o último número informado
        for (int i = 0; i < quantityOfNumbers; i++) {
            int generatedNumber = 0;
            do {
                generatedNumber = random.nextInt(finalNumber);
            } while ((generatedNumber < firstNumber) || (numbers.contains(generatedNumber)));
            numbers.add(generatedNumber);

            if ((finalNumber - 1) == generatedNumber) { //
                finalNumber--;
            }
            System.out.println(generatedNumber);
        }
    }
}
