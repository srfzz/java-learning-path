package Queue;
import java.util.*;

public class ArrayDqueue {
	public static void main(String[] args)
	{
		Deque<User> us=new ArrayDeque<>();
		for(int i=0;i<=100;i++)
		{
			us.offer(new User("cat"+i,i));
		}
		System.out.println(us);
		System.out.println(us.pollLast());
		us.addLast(new User("sarfaraj",100000));
		System.out.println(us.pollLast());
		
	}

}
