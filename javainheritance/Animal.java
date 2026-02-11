class Animal{
    protected  String name;
    private String size;
    private double weight;
    public Animal() {
    }
    public Animal(String name, String size, double weight) {
        this.name = name;
        this.size = size;
        this.weight = weight;
    }
    public void move(String speed)
    {
        System.out.println(name + " is moving at " + speed);
    }
    public void makeNoise()
    {
        System.out.println("Animal is making noise");
    }
    @Override
    public String toString() {
        return "Animal [name=" + name + ", size=" + size + ", weight=" + weight + "]";
    }
    
}