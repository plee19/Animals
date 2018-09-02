package us.plee19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

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
    public static void main(String[] args) throws IOException {

        ArrayList<Talkable> zoo = new ArrayList<>();

        //Lines to Replace
        zoo.add(addDog());
        zoo.add(addCat());
        zoo.add(addStudent());
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
     * @return void
     */
    public static void printOut(Talkable p)  {
        System.out.println(p.getName() + " says=" + p.talk());
        outFile.fileWrite(p.getName() + "|" + p.talk());
    }


    /**
     * Requests two user inputs (buffered and scanner) and returns a new instance of a Cat object for use in the add() method.
     * @return Cat new instance of Cat
     * @throws InputMismatchException if types do not match required types for new Cat instance
     * @throws IOException for unspecified IOExceptions
     */
    public static Cat addCat() throws InputMismatchException, IOException {
        String name = "";
        int miceKilled = 0;
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        Scanner kScan = new Scanner(System.in);
        System.out.println("Enter the name of a new Cat: ");
        try {
            name = keyboard.readLine();
        } catch (InputMismatchException e) {
            System.out.println("Name must be a string value.");
        }
        System.out.println("How many mice has " + name + " killed? ");
        try {
            miceKilled = kScan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Number of mice killed must be an integer.");
        }
        if (name != "" && miceKilled >= 0) {
            return new Cat(miceKilled, name);
        }
        return null;
    }

    /**
     * Requests two user inputs (buffered and scanner) and returns a new instance of a Dog object for use in the add() method.
     * @return Dog new instance of Dog
     * @throws InputMismatchException if types do not match required types for new Dog instance
     * @throws IOException for unspecified IOExceptions
     */
    public static Dog addDog() throws InputMismatchException, IOException {
        String name = "";
        Boolean isFriendly = null;
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        Scanner kScan = new Scanner(System.in);
        System.out.println("Enter the name of a new Dog: ");
        try {
            name = keyboard.readLine();
        } catch (InputMismatchException e) {
            System.out.println("Name must be a string value.");
        }
        System.out.println("Is " + name + " friendly? true/false ");
        try {
            isFriendly = kScan.nextBoolean();
        } catch (InputMismatchException e) {
            System.out.println("Friendly must be a boolean value true/false.");
        }
        if (name != "" && isFriendly != null) {
            return new Dog(isFriendly, name);
        }
        return null;
    }

    /**
     * Requests two user inputs (buffered and scanner) and returns a new instance of a Student object for use in the add() method.
     * @return Student new instance of Student
     * @throws InputMismatchException if types do not match required types for new Student instance
     * @throws IOException for unspecified IOExceptions
     */
    public static Student addStudent() throws InputMismatchException, IOException {
        String name = "";
        int age = 0;
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        Scanner kScan = new Scanner(System.in);
        System.out.println("Enter the name of a new Student: ");
        try {
            name = keyboard.readLine();
        } catch (InputMismatchException e) {
            System.out.println("Name must be a string value.");
        }
        System.out.println("How old is " + name + "? ");
        try {
            age = kScan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Age must be an integer.");
        }
        if (name != "" && age != 0) {
            return new Student(age, name);
        }
        return null;
    }
}