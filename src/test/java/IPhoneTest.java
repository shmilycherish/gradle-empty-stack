import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class IPhoneTest extends MobileBasicTest{

    @Test
    public void shouldMobileHaveNameColorAndBrand() {
        assertTrue(mobile instanceof IPhone);
    }

    @Test
    public void shouldMobileCallWithMessage() {
        mobile.call("Hello, iPhone");

        assertTrue(systemOut().equals("<iPhone>Message : Hello, iPhone\n"));
    }

    @Override
    public Mobile getSpecificMobile() {
        return new IPhone("name1", "red", "iPhone");
    }
}
