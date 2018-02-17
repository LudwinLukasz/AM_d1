import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by arabk on 17.02.2018.
 */
public class FirstClassTest {

    @Test
    public void testHello() {
        int value = 10;
        assertEquals(value,FirstClass.hello());
    }

}
