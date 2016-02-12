/**
 * Created by putkanka on 11-Feb-16.
 */
public class CommissionEmployee extends Employee {
    private double grossSale;
    private double commissionRate;

    public CommissionEmployee(String first, String last, String ssn, double sales, double rate) {
        super(first, last, ssn);
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
