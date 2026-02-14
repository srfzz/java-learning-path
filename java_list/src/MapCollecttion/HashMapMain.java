package MapCollecttion;
import java.util.*;
record Employee(String name,int id)
{
	
}
public class HashMapMain {
	public static void main(String[] args)
	{
		Map<Integer,Employee> emp=new TreeMap<>(Collections.reverseOrder());
	
			for(int i=100;i<10000;i++)
			{
				emp.put(i, new Employee("catbaba"+i,i));
			}
		
		System.out.println(emp);
		System.out.println(emp.get(103));
		System.out.println(emp.containsKey(104));
		System.out.println(emp.getOrDefault(1, new Employee("guest",5222)));
	}

}
