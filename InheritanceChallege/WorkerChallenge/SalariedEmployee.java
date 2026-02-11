package InheritanceChallege.WorkerChallenge;

public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean  isRetired;
    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }
    
    public void retire(String endDate) {
        this.isRetired = true;
        terminate(endDate);
    }
    @Override
    public double collectPay() {
        if (isRetired) {
            return 0;
        }
        return annualSalary / 12; // Monthly pay
    }
    

}
