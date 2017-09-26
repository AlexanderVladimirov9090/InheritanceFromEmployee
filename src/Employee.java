/**
 * @author Alexander Vladimirov
 *         <alexandervladimirov1902@gmail.com>
 *         Base class of Inheritance.
 */
public abstract class Employee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    public Employee(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = ssn;
    }

    public String firstName() {
        return firstName;
    }

    public String lastName() {
        return lastName;
    }

    public String socialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public String toString() {
        return String.format("%s %s\n Social Security Number: %s", firstName(), lastName, socialSecurityNumber());
    }

    public abstract double earnings();
}
