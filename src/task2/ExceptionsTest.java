package task2;

import org.junit.Test;

public class ExceptionsTest {
    @Test(expected = NegativeNumberException.class)
    public void testNegativeNumber() throws NegativeNumberException {
        Exceptions exceptions = new Exceptions();
        exceptions.checkNumber(-5);
    }

    @Test(expected = LargeNumberException.class)
    public void testLargeNumber() {
        Exceptions exceptions = new Exceptions();
        try {
            exceptions.checkNumber(105);
        } catch (NegativeNumberException e) {
            throw new RuntimeException(e);
        }
    }
}