package Queue;
import java.util.*;

import java.util.Stack;

record Employee(String name,int id) {};
public class LinkedListMain {
	public static void main(String[] args)
	{
		Queue<Employee> emp=new LinkedList<>();
		for(int i=0;i<=100;i++)
		{
			emp.offer(new Employee("name"+i,i));
		}
		emp.poll();
		System.out.println(emp.peek());
		System.out.printf("%s%n%n", emp);
		
	}

}
