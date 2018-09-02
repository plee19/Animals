package us.plee19.test;

import org.junit.*;
import us.plee19.FileInput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest extends junit.framework.TestCase {
    FileInput testFileInput = new FileInput("TestFile1.txt");
    //FileInput emptyTestFile = new FileInput("EmptyTestFile.txt");

    @Before
    public void setUp() throws Exception {

    }


    @Test
    public void testFileRead() {
        testFileInput.fileRead();
        assertNull(testFileInput.fileReadLine());
    }

    @Test
    public void testFileReadLine() {
        assertEquals("This is a test file.", testFileInput.fileReadLine());
        assertEquals("Read these three lines.", testFileInput.fileReadLine());
    }

    @Test(expected = IOException.class)
    public void testFileClose() {
        testFileInput.fileClose();
        assertNull(testFileInput.fileReadLine());
    }

    @After
    public void tearDown() throws Exception {

    }
}