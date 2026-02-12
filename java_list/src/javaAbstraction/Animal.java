package javaAbstraction;

public abstract class Animal {
	protected String type;
	protected String size;
	protected int weight;
	public Animal(String type, String size, int weight) {
		super();
		this.type = type;
		this.size = size;
		this.weight = weight;
	}
	public abstract void move(String speed);
	public  abstract void makeNoises();
	

}
