package randomnumbergenerator;

import org.junit.Test;

public class RandomNumberGeneratorTest {

    RandomNumberGenerator random;

    public RandomNumberGeneratorTest() {
        random = new RandomNumberGenerator();
    }

    @Test(expected = Exception.class)
    public void exception_quando_numerofinal_menorouigual_numeroinicial() {
        random.Aleatorizar(10, 1, 0);
    }

    @Test(expected = Exception.class)
    public void exception_quando_quantidadenumeros_maior_intervalo_de_numeros() {
        random.Aleatorizar(1, 2, 6);
    }

    @Test(expected = Exception.class)
    public void exception_quando_numeros_negativos() {
        random.Aleatorizar(-1, 0, 0);
        random.Aleatorizar(0, -1, 0);
        random.Aleatorizar(0, 0, -1);
    }
}
