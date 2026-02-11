public class Dog extends Animal{
    private String earShape;
    private String tailShape;
    public Dog()

    {
        super("dog", "Medium", 20);
    }
    public Dog(String name, String size, double weight) {
       this(name,size,weight,"floppy","curled");
    }
    public Dog(String name,String size,double weight,String earShape,String tailShape)
    {
        super(name,(weight < 10 ? "small":(weight>50 ? "large":"medium")),weight);
        this.earShape=earShape;
        this.tailShape=tailShape;

    }
    public String getEarShape() {
        return earShape;
    }
    public void setEarShape(String earShape) {
        this.earShape = earShape;
    }
    public String getTailShape() {
        return tailShape;
    }
    public void setTailShape(String tailShape) {
        this.tailShape = tailShape;
    }
    @Override
    public String toString() {
        return "Dog [earShape=" + earShape + ", tailShape=" + tailShape + "]";
    }
    @Override
    public void makeNoise()
    {
        super.makeNoise();
        System.out.println("Woof");
        this.bark();
    }
    @Override
    public void move(String speed)
    {
        super.move(speed);
        System.out.println("Dog is moving at " + speed);
        if(name.equals("wolf"))
        {
            System.out.println("Dog is moving at " + speed);
        }
        this.run();
        this.walk();
    }
    private void bark()
    {
        System.out.println("dog barks Woof");
    }
    private void run()
    {
        System.out.println("dog is running");
    }
    private void walk()
    {
        System.out.println("dog is walking");
    }
    
    
}
