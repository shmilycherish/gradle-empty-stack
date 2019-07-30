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

    @Test
    public void shouldMobileCallWithErrorWhenMessageIsTooLong() {
        mobile.call("Hello, iPhone X");

        assertTrue(systemOut().equals("<iPhone> Message cannot be sent\n"));
    }

    @Test
    public void shouldMobileCallGetBasicInfo() {
        mobile.printBasicInfo();

        assertTrue(systemOut().equals("name: name1, color: red, brand: iPhone\n"));
    }

    @Override
    public Mobile getSpecificMobile() {
        return new IPhone("name1", "red", "iPhone");
    }
}
