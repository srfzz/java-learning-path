# Java Inheritance

## What is Inheritance?

Inheritance allows me to create a new class based on an existing class. I can extend a class to reuse code and add new functionality.

## Key Points

- I use the `extends` keyword to inherit from a parent class
- I can override parent methods to customize behavior
- I get access to all public and protected members of the parent class

## Example: Animal and Dog
    
```java
// Parent class
class Animal {
    public void eat() {
        System.out.println("I am eating");
    }
}

// Child class extends Animal
class Dog extends Animal {
    public void bark() {
        System.out.println("I am barking");
    }
}

// Using inheritance
Dog myDog = new Dog();
myDog.eat();   // I inherited this from Animal
myDog.bark();  // My own method
```

## Production Grade Example

```java
class Vehicle {
    protected String brand;
    
    public Vehicle(String brand) {
        this.brand = brand;
    }
    
    public void drive() {
        System.out.println("I am driving a " + brand);
    }
}

class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }
    
    @Override
    public void drive() {
        System.out.println("I am driving a car from " + brand);
    }
}
```
