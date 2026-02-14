package collectionOverview;

import java.util.Arrays;
import java.util.Collection;
import java.util.TreeSet;

public class CollectionOverviewMain {
	public static void main(String[] args)
	{
		Collection<String> list=new TreeSet<>();
		String[] names= {"sarfaraj ansari","mithun kumar","kshitiz kumar","kshitiz kumar","prem Ranjan"};
		list.addAll(Arrays.asList(names));
		System.out.println(list);
		System.out.printf("Is Sarfaraj Present Here ! %s %n",list.contains("Sarfaraj Ansari"));
		list.removeIf(s->s.charAt(1) =='a' || s.charAt(3)=='m');
		System.out.println(list);
//		list.sort();
	}

}
