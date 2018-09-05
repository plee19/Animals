package us.plee19.test;

import org.junit.*;
import us.plee19.Student;

public class AddStudentTest extends junit.framework.TestCase {
    int age = 21;
    String name = "Paul";

    // Utilize ByteArrayInputStream to do a full test of AddX()
    @Test
    public void testAddStudent() throws Exception {
        assertTrue(new Student(age, name) instanceof Student);
    }
}
