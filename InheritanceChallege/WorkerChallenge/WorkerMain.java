package InheritanceChallege.WorkerChallenge;

public class WorkerMain {
    public static void main(String[] args) {
        {
            Employee employee = new Employee("John Doe", "15/5/1990", "1/1/2020");
            System.out.println(employee);
            System.out.println("Age =" + employee.getAge());
            System.out.println("paying employee"+employee.collectPay());
            System.out.println("-----------------------------");
            Employee employee1 = new Employee("Jane Smith", "1992-08-20", "15/3/2021");
            System.out.println(employee1);
            System.out.println("Age =" + employee1.getAge());
            System.out.println("paying employee"+employee1.collectPay());
            SalariedEmployee salariedEmployee = new SalariedEmployee("Alice Johnson", "10/10/1985", "1/6/2015", 60000);
            System.out.println(salariedEmployee);
            System.out.println(salariedEmployee.collectPay());
             salariedEmployee.retire("30/6/2024");
            System.out.println(salariedEmployee.collectPay());


        }
    }

}
