import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ReduceTest {

    @Test(timeout = 500)
    public void testMain() {
        assertEquals("Reduce.main(100) is incorrect", 9, Reduce.main(100));
    }

    @Test(timeout = 500)
    public void testMainTwoHundred() {
        assertEquals("Reduce.main(200) is incorrect", 10, Reduce.main(200));
    }

    @Test(timeout = 500)
    public void testMainFortyTwo() {
        assertEquals("Reduce.main(42) is incorrect",8, Reduce.main(42));
    }

    @Test(timeout = 500)
    public void testOne() {
        assertEquals("Reduce.main(1) is incorrect", 1, Reduce.main(1));
    }

    @Test(timeout = 500)
    public void testTwo() {
        assertEquals("Reduce.main(2) is incorrect", 2, Reduce.main(2));
    }
}