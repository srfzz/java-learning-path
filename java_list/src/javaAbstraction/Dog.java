package javaAbstraction;

public class Dog extends Animal {

	public Dog(String type, String size, int weight) {
		super(type, size, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move(String speed) {
		if(speed.equals("slow"))
		{
			System.out.println("slow");
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void makeNoises() {
		// TODO Auto-generated method stub
		if(type=="wolf")
		{
			System.out.println("howl");
		}else
		{
			System.out.println("growl");
		}
		
	}
	
	
	

}
