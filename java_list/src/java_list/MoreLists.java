	package java_list;
	import java.util.*;
	
	public class MoreLists {
		public static void main(String[] args)
		{
			String[] itemss= {"apple","mango","guava","aalu"};
			List<String> items=List.of(itemss);
			System.out.println(items);
			List<String> newItems=new ArrayList<>(items);
			newItems.add("hehehehe");
			System.out.println(newItems);
			newItems.add("aalu");
			System.out.println(newItems.contains("aalu"));
			System.out.println(newItems.indexOf("aalu")+1);
			System.out.println(newItems);
			//newItems.remove("aalu");
			//newItems.removeIf(i->i.equals("aalu"));
			newItems.sort(Comparator.reverseOrder());
			//newItems.clear();
			System.out.println(newItems);
			System.out.print(newItems.lastIndexOf("aalu")+1);
			System.out.println(Arrays.toString(newItems.toArray(new String[newItems.size()])));
			
			
		}
	
	}
