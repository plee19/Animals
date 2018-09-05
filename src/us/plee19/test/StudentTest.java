package us.plee19.test;

import org.junit.*;
import us.plee19.Student;

public class StudentTest extends junit.framework.TestCase {
    Student student1;

    // Need unit testing for getName()

    @Before
    public void setUp() throws Exception {
        student1 = new Student(23, "Sarah");
    }

    @Test
    public void testGetAge() {
        assertTrue(student1.getAge() == 23);
        assertFalse(student1.getAge() == 22);
    }

    @Test
    public void testSetAge() {
        student1.setAge(25);
        assertTrue(student1.getAge() == 25);
        assertFalse(student1.getAge() == 22);
    }

    @Test
    public void testTalk() {
        assertEquals("Student does not say expected response.", "Can we talk about my grade.", student1.talk());
    }
}