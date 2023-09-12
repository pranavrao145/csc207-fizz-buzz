

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MultiplesDefaultTest {

    @Test(timeout = 500)
    public void testDefault() {
        assertEquals("Multiples.main() is incorrect for default values", 466, Multiples.main());
    }

}