package lambdaIntro;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class LambdaExpressinConsumerExample {
	public static void main(String[] args)
	{
		List<String> list=new ArrayList<String>(List.of(
				"apple","mango","orange","guava","potato"
				
				));
		for(String s:list)
		{
			System.out.println(s);
		}
		System.out.println("_________");
		list.forEach(e->{
			char letter=e.charAt(0);
			System.out.println(letter);
		});
		int result=calculator((a,b)->a+b, 14, 15);
		System.out.println(result);
		
	}
	public static <T> T calculator(BinaryOperator<T> function,T valueOne,T valueTwo)
	{
		System.out.println("The type of T is: " + valueOne.getClass().getSimpleName());
		T result= function.apply(valueOne, valueOne);
		
		System.out.println(result);
		return result;
	}

}
