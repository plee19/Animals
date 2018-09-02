package us.plee19.test;

import org.junit.*;
import us.plee19.Dog;

public class AddDogTest extends junit.framework.TestCase {
    String name = "Fido";
    Boolean isFriendly = true;

    @Test
    public void testAddDog() throws Exception {
    assertTrue(new Dog(isFriendly, name) instanceof Dog);
    }
}
