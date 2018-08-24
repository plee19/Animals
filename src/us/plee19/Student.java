package us.plee19;

/**
 * Creates a Student class, extending from the Person abstract class and implementing the Talkable interface.
 * @author mgreen14
 * @version 1
 */
public class Student extends Person implements Talkable {
    private int age;

    /**
     * Student constructor creates new instance of Student with parameters of integer age and string name.
     * @param age Integer age of Student instance
     * @param name String name of Student instance
     */
    public Student(int age, String name) {
        super(name);
        this.age = age;
    }

    /**
     * Returns an integer age value for the Student instance
     * @return age Integer age value for the Student instance
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the integer age value for the Student instance
     * @param age Integer age value for the Student instance
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Overrides the talk() method from the Talkable interface with specific string value for the Student class.
     * @return String of Student sound "Can we talk about my grade."
     */
    @Override
    public String talk() {
        return "Can we talk about my grade.";
    }
}