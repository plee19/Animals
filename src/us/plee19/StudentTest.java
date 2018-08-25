package us.plee19;

import org.junit.*;

public class StudentTest extends junit.framework.TestCase {
    Student student1;

    @Before
    public void setUp() throws Exception {
        student1 = new Student(23, "Sarah");
    }

    @Test
    public void testGetAge() {
        assertTrue(student1.getAge() == 23);
    }

    @Test
    public void testSetAge() {
        student1.setAge(25);
        assertTrue(student1.getAge() == 25);
    }

    @Test
    public void testTalk() {
        assertEquals("Student does not say expected response.", "Can we talk about my grade.", student1.talk());
    }
}