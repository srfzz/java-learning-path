package Queue;
import java.util.*;
record User(String name,int id) {}
public class PriorityQueueMian {
	public static void main(String[] args)
	{
		Comparator<User> vipComprator=(u1,u2)->{
			if(u1.name().equals("cat6")) return -1;
			if(u2.name().equals("cat6")) return 1;
			return u1.name().compareTo(u2.name());
			
		};
		Queue<User> us=new PriorityQueue<>(vipComprator);
		for(int i=0;i<=10;i++)
		{
			us.offer(new User("cat"+i,i));
		}
		System.out.println(us.peek());
		System.out.println(us.poll());
		System.out.println(us);
		
		
	}

}
