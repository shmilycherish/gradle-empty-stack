import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertTrue;

public class PersonTest {

    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldPersonCouldCallWithMessage() {
        String name = "Roy";
        Mobile mobile = new IPhone("iPhone 6", "red", "iPhone");
        Person person = new Person(name, mobile);

        person.call("hello, mobile");

        assertTrue(systemOut().contains("hello, mobile\n"));
        assertTrue(systemOut().contains("iPhone"));
    }

    @Test
    public void shouldPersonChangeMobile() {
        String name = "Roy";
        Mobile mobile = new IPhone("iPhone 6", "red", "iPhone");
        Person person = new Person(name, mobile);
        person.setMobile(new Android("OPPO 11", "red", "OPPO"));

        person.call("hello, mobile");

        assertTrue(systemOut().contains("hello, mobile\n"));
        assertTrue(systemOut().contains("Android"));
    }

    public String systemOut() {
        return outContent.toString();
    }
}
