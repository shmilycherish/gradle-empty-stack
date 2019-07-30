import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertTrue;

public class IPhoneTest {

    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldMobileHaveNameColorAndBrand() {
        IPhone mobile = new IPhone("name1", "red", "NOKIA");

        assertTrue(mobile instanceof IPhone);
    }

    @Test
    public void shouldMobileCallWithMessage() {
        IPhone mobile = new IPhone("name1", "red", "NOKIA");

        mobile.call("Hello, iPhone");

        assertTrue(systemOut().equals("<iPhone>Message : Hello, iPhone\n"));
    }

    private String systemOut() {
        return outContent.toString();
    }

}
