/**
 * Names class
 * This class contains tasks related to the use of the Strings class.
 *
 * @author Dr Suzy Atfield-Cutts adapted from Melanie Coles
 * @since 2020
 */

public class Names {

    /**
     * UpperCaseName()
     * takes a name and returns it in uppercase
     *
     * @param name takes a name as a string
     * @return the name using the toUpperCase() method
     */
    public String upperCaseName(String name) {
        return name.toUpperCase();
    }

    /**
     * fullName()
     * takes two names, firstname and last name and returns them
     * concatenated into one string with a space between them
     *
     * @param firstName the first name it takes
     * @param lastName the second name it takes
     * @return the names in one string
     */
    public String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    /**
     * letterCount()
     * takes a name as an input and returns how many
     * letters are in that name
     *
     * @param name the name inputted
     * @return returns the name while passing it through the length() method
     */
    public int letterCount(String name) {
        return name.length();
    }

    /**
     * theSameName()
     * takes in two names and compares them to see if they are the same
     *
     * @param name1 the first name inputted
     * @param name2 the second name inputted
     * @return the names while putting them through the equalsIgnoreCase() method
     */
    public Boolean theSameName(String name1, String name2) {
        return name1.equalsIgnoreCase(name2);
    }

    /**
     * properCaseName()
     * takes a name and changes the capitalisation of the name to
     * start with the first letter being uppercase and the rest of
     * the name being lower
     *
     * @param name the name that gets inputted
     * sets the name to lowercase
     * substrings the name to have the first letter of the name be
     * upper case and adds the rest of the name to the end
     * @return the name
     */
    public String properCaseName(String name) {
        name = name.toLowerCase();
        name = name.substring(0,1).toUpperCase() + name.substring(1);
        //substrings the name and changes the case
        return name;
    }
}
