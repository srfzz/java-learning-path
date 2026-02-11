public class Dog extends  Animal {
    private String earShape;
    private String tailShape;
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
    public Dog(String name, String size, double weight, String earShape, String tailShape) {
        super(name, size, weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }
    @Override
    public String toString() {
        return "Dog [earShape=" + earShape + ", tailShape=" + tailShape + "]";
    }
    
    

}
