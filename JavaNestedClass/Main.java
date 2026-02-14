package JavaNestedClass;
import java.util.*;

public class Main {
	public static void main(String[] args)
	{
		List<Employee> employee=new ArrayList<>(List.of(
				new Employee("sarfaraj",101,2024),
				new Employee("mithun",102,2025),
				new Employee("kshitiz",103,2026)
				
				));
//		var compartaor =new EmployeeComparator<>();
//		employee.sort(compartaor);
		employee.sort(new Employee.EmployeeComparator<Employee>());
//		employee.sort(Comparator.comparing(Employee::getYearStarted).reversed());
		for(Employee e :employee)
		{
			System.out.println(e);
		}
		
		
	}

}
