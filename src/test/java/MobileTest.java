import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MobileTest extends MobileBasicTest{

    @Test
    public void shouldMobileHaveNameColorAndBrand() {
        assertTrue(mobile instanceof Mobile);
    }

    @Test
    public void shouldMobileCallWithMessage() {
        mobile.call("Hello, Mobile");

        assertTrue(systemOut().equals("Message : Hello, Mobile\n"));
    }

    @Override
    public Mobile getSpecificMobile() {
        return new Mobile("name1", "red", "NOKIA");
    }
}
