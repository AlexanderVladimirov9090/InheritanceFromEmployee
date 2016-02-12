/**
 * Created by putkanka on 11-Feb-16.
 */
public abstract class Employee {
    private String firtsName;
    private String lastName;
    private String socialSecurityNumber;

    public Employee(String first, String last, String ssn) {
        this.firtsName = first;
        this.lastName = last;
        this.socialSecurityNumber = ssn;
    }

    public String firstName() {
        return firtsName;
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
