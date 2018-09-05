package us.plee19.test;

import org.junit.*;
import us.plee19.Cat;

public class CatTest extends junit.framework.TestCase {
    Cat cat1;
    Cat cat2;

    // Need unit testing for getName()

    @Before
    public void setUp() throws Exception {
        cat1 = new Cat(5, "Sam");
    }

    @Test
    public void testGetMousesKilled() {
        assertEquals("mousesKilled should be 5.", 5, cat1.getMousesKilled());
    }

    @Test
    public void testAddMouse() {
        cat1.addMouse();
        assertTrue(cat1.getMousesKilled() == 6);
        assertFalse(cat1.getMousesKilled() == 5);
        cat1.addMouse();
        assertTrue(cat1.getMousesKilled() == 7);
    }

    @Test
    public void testTalk() {
        assertEquals("Cats should meow.", "Meow", cat1.talk());
    }

    @Test
    public void testToString() {
        assertEquals("Cat's name and mouses killed are incorrect.", "Cat: name=Sam mousesKilled=5", cat1.toString());
    }
}