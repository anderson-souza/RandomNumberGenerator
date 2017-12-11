package randomnumbergenerator;

import com.andersonsouza.randomnumbergenerator.RandomNumberGenerator;
import org.junit.Test;

public class RandomNumberGeneratorTest {

    RandomNumberGenerator random;

    public RandomNumberGeneratorTest() {
        random = new RandomNumberGenerator();
    }

    @Test(expected = Exception.class)
    public void exception_when_finalNumber_less_or_equal_firstNumber() {
        random.Generate(10, 1, 0);
    }

    @Test(expected = Exception.class)
    public void exception_when_quantityOfNumbers_greaterThen_numbersRange() {
        random.Generate(1, 2, 6);
    }

    @Test(expected = Exception.class)
    public void exception_when_negativeNumbers() {
        random.Generate(-1, 0, 0);
        random.Generate(0, -1, 0);
        random.Generate(0, 0, -1);
    }
}
