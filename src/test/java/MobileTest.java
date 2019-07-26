import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MobileTest {

    @Test
    public void shouldMobileHaveNameColorAndBrand() {
        Mobile mobile = new Mobile("name1", "red", "NOKIA");

        assertTrue(mobile instanceof Mobile);
    }
}
