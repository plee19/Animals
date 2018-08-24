package us.plee19;

/**
 * Creates a Pet abstract class.
 * @author mgreen14
 * @version 1
 */
public abstract class Pet {
    protected String name;

    /**
     * Pet constructor creates new instance of Pet with a name parameter.
     * @param name String name value of the Pet instance
     */
    public Pet(String name) {
        this.name = name;
    }

    /**
     * Returns the string name value of the Pet instance.
     * @return name String name value of the Pet instance.
     */
    public String getName() {
        return name;
    }


}