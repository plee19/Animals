package us.plee19.test;

import org.junit.*;
import us.plee19.FileOutput;

import java.io.FileNotFoundException;

public class FileOutputTest {
    FileOutput testFileOutput = new FileOutput("OutputFile1.txt");

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