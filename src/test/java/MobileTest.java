import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertTrue;

public class MobileTest {

    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldMobileHaveNameColorAndBrand() {
        Mobile mobile = new Mobile("name1", "red", "NOKIA");

        assertTrue(mobile instanceof Mobile);
    }

    @Test
    public void shouldMobileCallWithMessage() {
        Mobile mobile = new Mobile("name1", "red", "NOKIA");

        mobile.call("Hello, Mobile");

        assertTrue(systemOut().equals("Message : Hello, Mobile\n"));
    }

    private String systemOut() {
        return outContent.toString();
    }
}
