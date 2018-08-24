package us.plee19;

/**
 * Creates a Dog class, extending from the Pet parent class and implementing the Talkable interface.
 * @author mgreen14
 * @version 1
 */
public class Dog extends Pet implements Talkable {
    private boolean friendly;

    /**
     * Dog constructor creates new instance of Dog with parameters of boolean friendly and string name.
     * @param friendly Boolean value of whether Dog is friendly
     * @param name String value of Dog instance's name
     */
        public Dog(boolean friendly, String name) {
        super(name);
        this.friendly = friendly;
    }

    /**
     * Returns the boolean value of whether the Dog instance is friendly.
     * @return friendly Whether the dog is friendly
     */
    public boolean isFriendly() {
        return friendly;
    }

    /**
     * Overrides the talk() method from the Talkable interface with specific Bark sound for the Dog class.
     * @return String of Dog sound "Bark"
     */
    @Override
    public String talk() {
        return "Bark";
    }

    /**
     * Overrides the toString() method from the Object class with a returned string of concatenated strings, a name value and a friendly value.
     * @return String of concatenated strings, Dog instance's name and friendly values
     */
    @Override
    public String toString() {
        return "Dog: " + "name=" + name + " friendly=" + friendly;
    }


}