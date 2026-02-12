package java_linked_list;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		long startTime=System.nanoTime();
		List<String> placesToVisit=new LinkedList<>();
		placesToVisit.add("delhi");
		placesToVisit.add("chennai");
		placesToVisit.add("mumbai");
		placesToVisit.add("kolkata");
		
		for(int i=1;i<=500000;i++)
		{
			placesToVisit.add(i+"L");
		}
		//System.out.println(placesToVisit);
		String middleItem=placesToVisit.get(25000);
		long endTime=System.nanoTime();
		System.out.println(endTime-startTime+"sec"+"middle item is :"+middleItem);
		String firstPlace=placesToVisit.getFirst();
		String lastPlace=placesToVisit.getLast();
		//ListIterator<String> iterator= placesToVist.listIterator(i);
		ListIterator<String> it=placesToVisit.listIterator();
		while(it.hasNext())
		{
			var nextPlace=it.next();
			System.out.println("moving from"+firstPlace+"to"+nextPlace);
			firstPlace=nextPlace;
			
		}
		System.out.println(lastPlace);
		

	}

}
