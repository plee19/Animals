package us.plee19.test;

import org.junit.*;
import us.plee19.Dog;

public class AddDogTest extends junit.framework.TestCase {
    String name = "Fido";
    Boolean isFriendly = true;

    // Utilize ByteArrayInputStream to do a full test of AddX()
    @Test
    public void testAddDog() throws Exception {
    assertTrue(new Dog(isFriendly, name) instanceof Dog);
    }
}
