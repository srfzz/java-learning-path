package javaAbstraction;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Animal animal=new Animal("wolf","small",65); we cannot create an object for the Abstrcatclass
		Dog dog =new Dog("wolf","small",568);
		List<Animal> animal=new ArrayList<>();
		animal.add(dog);
		animal.add(new Dog("golfish","fast",10));
//		animal.add(new Fish("heheh","medium",56));
		for(Animal a:animal)
		{
			doingStuff(a);	
		}
		
		

	}
	public static void doingStuff(Animal animal)
	{
		animal.makeNoises();
		animal.move("slow");
	}

}
