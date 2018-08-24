package us.plee19;

import java.util.ArrayList;

/**
 * Main class creates a program to demonstrate classes and methods of the Animals project.
 * @author mgreen14
 * @version 1
 */
public class Main {

    private final static FileOutput outFile = new FileOutput("animals.txt");
    private final static FileInput inFile = new FileInput("animals.txt");

    /**
     * The main method is the program's starting point.
     * @param args Arguments given in each line of the main method's code
     */
    public static void main(String[] args) {

        ArrayList<Talkable> zoo = new ArrayList<>();

        //Lines to Replace
        zoo.add(new Dog(true, "Pete"));
        zoo.add(new Cat(9, "Anne Belly"));
        zoo.add(new Student(19, "Joe John Johnson"));
        //End Lines to Replace

        for (Talkable thing: zoo) {
            printOut(thing);
        }
        outFile.fileClose();
        inFile.fileRead();
        inFile.fileClose();
        FileInput indata = new FileInput("animals.txt");
        String line;
        while ((line = indata.fileReadLine()) != null) {
            System.out.println(line);
        }
    }

    /**
     * Prints a line to the console and writes a line to the given output file using the Talkable interface.
     * @param p Talkable interface
     */
    public static void printOut(Talkable p)  {
        System.out.println(p.getName() + " says=" + p.talk());
        outFile.fileWrite(p.getName() + "|" + p.talk());
    }
}