package us.plee19.test;

import org.junit.*;
import us.plee19.FileInput;

public class FileInputTest extends junit.framework.TestCase {
    FileInput testFile;
    FileInput emptyTestFile;

    @Before
    public void setUp() throws Exception {
        FileInput testFile = new FileInput("testFile1");
        FileInput emptyTestFile = new FileInput("testFile2");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testFileRead() {
        //assertEquals("This is a test file.", testFile.fileRead());
    }

    @Test
    public void testFileReadLine() {
    }

    @Test
    public void testFileClose() {
    }
}