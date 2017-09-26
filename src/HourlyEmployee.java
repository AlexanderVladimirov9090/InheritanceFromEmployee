/**
 * @author Alexander Vladimirov
 *         <alexandervladimirov1902@gmail.com>
 *         Hourly Employee derived From Employee class.
 */
public class HourlyEmployee extends Employee {
    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String ssn, double wage, double hours) {
        super(firstName, lastName, ssn);
        this.wage = wage;
        this.hours = hours;
    }

    public double wage() {
        return wage;
    }

    public double hours() {
        return hours;
    }

    @Override
    public double earnings() {
        if (hours() <= 40) {
            return wage() * hours();
        } else
            return 40 * wage() * (hours() - 40) * wage() * 1.5;
    }

    @Override
    public String toString() {
        return String.format("%s %s\nSocial Security Number: %s\nWage: $%,.2f\nHours: $%,.2f", firstName(), lastName(), socialSecurityNumber(), wage(), hours());
    }
}

