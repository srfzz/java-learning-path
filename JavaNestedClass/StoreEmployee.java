package JavaNestedClass;
import java.util.*;

public class StoreEmployee extends Employee {
	private String store;
	
	
public StoreEmployee() {
		
	}



public StoreEmployee(String store) {
	super();
	this.store = store;
}



class StoreCompartor <T extends Employee> implements Comparator<StoreEmployee>{

	@Override
	public int compare(StoreEmployee o1, StoreEmployee o2) {
		// TODO Auto-generated method stub
	 int result = o1.store.compareTo(o2.store);
	 if(result ==0)
	 {
		 return new Employee.EmployeeComparator<Employee>()
	 }
	 return result;
	}
	
}

}
