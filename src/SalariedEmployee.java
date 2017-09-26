/**
 * @author Alexander Vladimirov
 *         <alexandervladimirov1902@gmail.com>
 *             Salaried Employee derived From Employee class.
 */
public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String first, String last, String ssn, double salary) {
        super(first, last, ssn);
        this.weeklySalary = salary;
    }

    public double weeklySalary() {
        return weeklySalary;
    }

    @Override
    public double earnings() {
        return weeklySalary();
    }

    @Override
    public String toString() {
        return String.format("%s %s \nSocial Security Number: %s \nWeekly Salary: $%,.2f", firstName(), lastName(), socialSecurityNumber(), weeklySalary());
    }
}
