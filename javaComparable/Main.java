package javaComparable;

import java.util.Arrays;

public class Main {

	public  static void main(String[] args)
	{
		Integer five=5;
		Integer[] newNumbers= {1,4,5,3,2,6,7};
		for(Integer i: newNumbers)
		{
		int value=five.compareTo(i);
		System.out.println(value);
		}
		Student s=new Student("sarfaraj");
		Student[] students= {new Student("abc"),new Student("def"),new Student("heheheh"),new Student("sarfaraj")};
		Arrays.sort(students);
		System.out.println(Arrays.toString(students));
	}

}
class Student implements Comparable<Student> {
	private String name ;
	 
	
	public Student(String name)
	{
		this.name=name;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
	public int compareTo(Student o)
	{
		return 0;
	}
	
	
}