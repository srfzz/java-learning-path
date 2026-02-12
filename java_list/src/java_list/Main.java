package java_list;
import java.util.ArrayList;
import java.util.*;
record GrocesryItem(String name,String type,int count)
{
	public GrocesryItem(String name)
	{
		this(name,"Dairy",1);
	}
	@Override
	public String toString()
	{
		return String.format("%d %s in %s",count,name.toUpperCase(),type);
	}
}

public class Main {
	public static void main(String[] args)
	{
		List<GrocesryItem> item=new ArrayList<>();
		item.add(new GrocesryItem("aalu"));
		item.add(new GrocesryItem("milk","diary",5));
		item.add(new GrocesryItem("apple","fruit",5));
		item.add(new GrocesryItem("mango","fruio",5));
		item.add(2,new GrocesryItem("colgate","daily_needs",5));
		item.remove(2);
		if(!item.isEmpty())
		{
			System.out.println(item.size());
			System.out.println(item);
			System.out.println(item.contains(new GrocesryItem("diary")));
		}
		
		
	}

}
