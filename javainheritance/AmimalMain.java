public class AmimalMain {
    public static void main(String[] args)
    {
        Animal animal= new Animal("Animal", "Medium", 10);
        animalDoingStuff(animal,"slow");
        Dog dog = new Dog();
        animalDoingStuff(dog, "fast");
        Dog dog1 = new Dog("Yorkie", "Small", 5, "pointy", "straight");
        animalDoingStuff(dog1, "fast");
        Dog dog2 = new Dog("Labrador", "Large", 30);
        animalDoingStuff(dog2, "slow");
        Dog wolf =new Dog("wolf", "Large", 60);
        animalDoingStuff(wolf, "fast");
    }
    public static void animalDoingStuff(Animal animal, String speed)
    {
        System.out.println(animal);
        animal.move(speed);
        animal.makeNoise();
        System.out.println("-----------------------------");
    }

}
