package us.plee19.test;

import org.junit.*;
import us.plee19.FileOutput;

import java.io.FileNotFoundException;

public class FileOutputTest {
    FileOutput testFileOutput = new FileOutput("OutputFile1.txt");

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void fileWrite() {
    }

    // FileNotFoundException already caught within the class
    @Test
    public void fileClose() {
        testFileOutput.fileClose();
        testFileOutput.fileWrite("Test");
    }
}