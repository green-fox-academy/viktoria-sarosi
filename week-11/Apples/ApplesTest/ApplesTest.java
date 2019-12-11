import org.junit.Test;

import static org.junit.Assert.*;

public class ApplesTest {

    @Test
    public void getApples() {
        Apples golden = new Apples();
        assertEquals("apple", golden.getApples());
    }
}