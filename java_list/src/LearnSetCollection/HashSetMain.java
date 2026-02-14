package LearnSetCollection;
import java.util.*;

public class HashSetMain {
	record Employee(String name,int id) {}
	public static void main(String[] args)
	{
		Set<Employee> emp=new  TreeSet<>(Comparator.comparing(Employee::name));
		for(int i=0;i<=10;i++)
		{
			if(i%3==0)
			{
				emp.add(new Employee("sarfaraj"+i,100));
			}
			emp.add(new Employee("sarfaraj"+i,100));
				
		}
		
		System.out.println(emp);
		
	}

}
