/**
 * @author Alexander Vladimirov
 *         <alexandervladimirov1902@gmail.com>
 *         Commission Employee derived From Employee class.
 */
public class CommissionEmployee extends Employee {
    private double grossSale;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String ssn, double sales, double rate) {
        super(firstName, lastName, ssn);
        this.grossSale = sales;
        this.commissionRate = rate;
    }

    public double grossSale() {
        return grossSale;
    }

    public double commissionRate() {
        return commissionRate;
    }

    @Override
    public double earnings() {
        return commissionRate() * grossSale();
    }

    @Override
    public String toString() {
        return String.format("%s %s\nSocial Security Number: %s\nGross Sale: $%,.2f\nCommission Rate: $%,.2f ", firstName(), lastName(), socialSecurityNumber(), grossSale(), commissionRate());
    }

}
