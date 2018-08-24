package us.plee19;

/**
 * Creates a Cat class, extending from the Pet parent class and implementing the Talkable interface.
 * @author mgreen14
 * @version 1
 */
public class Cat extends Pet implements Talkable {
    private int mousesKilled;

    /**
     * Cat constructor creates new instance of Cat with parameters of integer mice killed and string name.
     * @param mousesKilled Integer value of mice killed
     * @param name String value of Cat instance's name
     */
    public Cat(int mousesKilled, String name) {
        super(name);
        this.mousesKilled = mousesKilled;
    }

    /**
     * Returns the number of mice killed by the Cat instance.
     * @return mousesKilled number of mice killed
     */
    public int getMousesKilled() {
        return mousesKilled;
    }

    /**
     * Increments the number of mice killed by the Cat instance.
     */
    public void addMouse() {
        mousesKilled++;
    }

    /**
     * Overrides the talk() method from the Talkable interface with specific Meow sound for the Cat class.
     * @return String of Cat sound "Meow"
     */
    @Override
    public String talk() {
        return "Meow";
    }

    /**
     * Overrides the toString() method from the Object class with a returned string of concatenated strings, a name value and a mousesKilled value.
     * @return String of concatenated strings, Cat instance's name and mousesKilled values
     */
    @Override
    public String toString() {
        return "Cat: " + "name=" + name + " mousesKilled=" + mousesKilled;
    }
}