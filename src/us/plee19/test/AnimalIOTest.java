package us.plee19.test;

import org.junit.*;
import us.plee19.Cat;
import us.plee19.Dog;
import us.plee19.Student;

// Needs follow-up to make tests better, spoof stream for input

public class AnimalIOTest extends junit.framework.TestCase {
    String name = "Kitty";
    int miceKilled = 10;
    String name2 = "Fido";
    Boolean isFriendly = true;
    int age = 21;
    String name3 = "Paul";

    @Test
    public void testAddCat() throws Exception {
        assertTrue(new Cat(miceKilled, name) instanceof Cat);
    }

    @Test
    public void testAddDog() throws Exception {
        assertTrue(new Dog(isFriendly, name2) instanceof Dog);
    }

    @Test
    public void testAddStudent() throws Exception {
        assertTrue(new Student(age, name3) instanceof Student);
    }
}
