package us.plee19.test;

import org.junit.*;
import us.plee19.Dog;

public class DogTest extends junit.framework.TestCase {
    Dog dog1;

    @Before
    public void setUp() throws Exception {
        dog1 = new Dog(true, "Fido");
    }

    @Test
    public void testIsFriendly() {
        assertTrue("Dog should be friendly.", dog1.isFriendly());
    }

    @Test
    public void testTalk() {
        assertEquals("Dogs should bark.", "Bark", "Bark");
    }

    @Test
    public void testToString() {
        assertEquals("Dog's name and friendliness are incorrect.", "Dog: name=Fido friendly=true", dog1.toString());
    }
}