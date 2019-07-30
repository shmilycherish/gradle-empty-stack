import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AndroidTest extends MobileBasicTest{

    @Test
    public void shouldMobileHaveNameColorAndBrand() {
        assertTrue(mobile instanceof Android);
    }

    @Test
    public void shouldMobileCallWithMessage() {
        mobile.call("Hello, iPhone");

        assertTrue(systemOut().equals("<Android>Message : Hello, iPhone\n"));
    }

    @Override
    public Mobile getSpecificMobile() {
        return new Android("name1", "red", "OPPO");
    }
}
