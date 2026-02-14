package lambdaIntro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	record Person(String firstName,String lastName)
	{

		@Override
		public String toString() {
			return "Person [firstName=" + firstName + ", lastName=" + lastName + "]";
		}
		
	}

	public static void main(String[] args) {
		List<Person> person=new ArrayList<>(Arrays.asList(
				new Person("mithun","kumar"),
				new Person("kshitiz","kumar"),
				new Person("sarfaraj","Ansari"),
				new Person("Prem","ranjan")
				)
				);
				
//			person.sort(new Comparator<Person>()
//			{
//
//				@Override
//				public int compare(Person o1, Person o2) {
//					// TODO Auto-generated method stub
//					return o1.firstName().compareToIgnoreCase(o2.firstName());
//				}
//		
//			});
		person.sort((p1,p2)->p1.lastName().compareToIgnoreCase(p2.lastName()));
			System.out.println(person);
	
		
	}
	
}
