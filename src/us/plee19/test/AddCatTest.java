package us.plee19.test;
import org.junit.*;
import us.plee19.Cat;

public class AddCatTest extends junit.framework.TestCase {
    String name = "Kitty";
    int miceKilled = 10;

    @Test
    public void testAddCat() throws Exception {
        assertTrue(new Cat(miceKilled, name) instanceof Cat);
    }
}
