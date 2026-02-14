package StackCollection;

import java.util.Stack;

record Employee(String name,int id) {};
public class StackMain {
	public static void main(String[] args)
	{
		
		Stack<Employee> emp=new Stack<>();
		for(int i=0;i<=100;i++)
		{
			emp.push(new Employee("name"+i,i));
		}
		System.out.println(emp.peek());
		emp.forEach(e->System.out.println(e));
		System.out.printf("%s %n",emp);
	}

}
