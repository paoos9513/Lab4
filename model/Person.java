package model;

/**
 * The type Person.
 */
public class Person {

    private String name;
    private String lastName;
    private String id;

    /**
     * this is the constructor method that allows me to give value to attributes
     *
     * @param name     the name
     * @param lastName the last name
     * @param id       the id
     * @author Paola Osorio
     */
    public Person(String name, String lastName, String id) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
    }

    /**
     * this method gives me the name of the customer or the seller
     *
     * @return String name
     * @author Paola Osorio
     */
    public String getName(){
        return name;
    }

    /**
     * this method gives me the last name of the customer or the seller
     *
     * @return String lastName
     * @author Paola Osorio
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * this method gives me the id of the customer or the seller
     *
     * @return String id
     * @author Paola Osorio
     */
    public String getId() {
        return id;
    }

    /**
     * this method allows me to modify the name of the customer or the seller
     *
     * @param name this is a type parameter String. name != null
     * @author Paola Osorio
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * this method allows me to modify the last name of the customer or the seller
     *
     * @param lastName this is a type parameter String. lastName != null
     * @author Paola Osorio
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * this method allows me to modify the id of a client or seller
     *
     * @param id this is a type parameter String. id != null
     * @author Paola Osorio
     */
    public void setId(String id) {
        this.id = id;
    }
}




