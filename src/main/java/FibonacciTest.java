import org.junit.Assert;
import org.junit.Test;


public class FibonacciTest {

    @Test
    public void TestingFibonacci_0() {
        Assert.assertTrue(Fibonacci.calculate(0).split(",").length == 1);
    }

    @Test
    public void TestingFibonacci_1() {
        Assert.assertTrue(Fibonacci.calculate(1).split(",").length == 2);
    }

    @Test
    public void TestingFibonacci_10() {

        Assert.assertTrue(Fibonacci.calculate(10).split(",").length == 11);
    }
}
