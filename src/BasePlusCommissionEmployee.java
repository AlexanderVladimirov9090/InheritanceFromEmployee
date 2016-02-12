/**
 * Created by putkanka on 11-Feb-16.
 */
public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String first, String last, String ssn, double sales, double rate, double salary) {
        super(first, last, ssn, sales, rate);
        this.baseSalary = salary;
    }

    public void setBaseSalary(double salary) {
        if (salary >= 0.0)
            baseSalary = salary;
        else
            throw new IllegalArgumentException(
                    "Base salary must be >= 0.0");
    }

    public double baseSalary() {
        return baseSalary;
    }


    @Override
    public double earnings() {
        return baseSalary() + super.earnings();
    }

    @Override
    public String toString() {
        return String.format("%s %s; %s: $%,.2f", "based-salaried", super.toString(), "base salary", baseSalary());
    }
}
