package src;

public class SalariedEmployee extends Employee{

    double annualSalary;
    boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    // we overrode collectPay, a method declared on worker.
    @Override
    public double collectPay () {
        double paycheck = annualSalary  / 26;
        double adjustedPay = (isRetired) ? 0.9 * paycheck : paycheck;
        return (int) adjustedPay;
    }
    public void retire () {
        // calling the terminate method from worker which is the grandparent of this class: SalariedEmployee -> Employee -> Worker.
        // We can use this because Employee did not override the terminate method and thus we cassn use it.
        terminate("12/12/2025");
        isRetired = true;
    }
}
