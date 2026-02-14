package ArrayList;
import java.util.*;
record Employee(String name ,int id) {}
public class MainArrayList {

	public static void main(String[] args) {
		List<String> names =new ArrayList<>();
		List<Employee> employee=new ArrayList<>();
		for(int i=0;i<=10;i++)
		{
			names.add("hehe"+i);
			employee.add(new Employee("name"+i,i));
			
		}
		System.out.println(names);
		System.out.println(Arrays.toString(names.toArray()));
		System.out.println(employee);
		
		System.out.println(employee.contains(new Employee("name3",3)));
		employee.removeIf(e-> e.name().endsWith("4"));
		employee.add(4,new Employee("name4",4));
		//employee.removeIf(e->e.name().charAt(0)=='n');
		employee.forEach(e->System.out.println(e));
		List<Employee> extraStaf=new ArrayList<>();
		for(int i=100;i<=2000;i++)
		{
			extraStaf.add(new Employee("hehe"+i,i));
			
		}
		//System.out.println(extraStaf);
		employee.addAll(6,extraStaf);
		System.out.printf("%s %n",employee);
		Iterator<Employee> it=employee.iterator();
		Employee firstEmployee=employee.getFirst();
		while(it.hasNext())
		{
			Employee nextEmployee=it.next();
					System.out.println("moved from"+ firstEmployee+"to"+nextEmployee);
					firstEmployee=nextEmployee;
					
		}

	}

}
