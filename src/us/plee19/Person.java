package us.plee19;

/**
 * Creates a Person abstract class.
 * @author mgreen14
 * @version 1
 */
public abstract class Person {
    private String name;

    /**
     * Person constructor creates new instance of Person with a name parameter.
     * @param name String name value of the Person instance
     */
    public Person(String name) {
        this.name = name;
    }

    /**
     * Returns the string name value of the Person instance.
     * @return name String name value of the Person instance
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the string name value of the Person instance.
     * @param name String name value of the Person instance
     */
    public void setName(String name) {
        this.name = name;
    }


}