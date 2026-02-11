# this vs super Keyword in Java

## this Keyword

### What is it?
`this` refers to the current object instance of the class.

### Usage
```java
public class Student {
    private String name;
    private int age;
    
    // Constructor
    public Student(String name, int age) {
        this.name = name;  // refers to instance variable
        this.age = age;
    }
    
    // Method calling another method
    public void display() {
        System.out.println(this.name);
    }
}
```

### When to Use
- Distinguish between instance variables and parameters
- Call another constructor in the same class
- Pass current object reference as parameter

---

## super Keyword

### What is it?
`super` refers to the parent class object.

### Usage
```java
public class Animal {
    protected String name = "Animal";
    
    public void eat() {
        System.out.println("Eating");
    }
}

public class Dog extends Animal {
    protected String name = "Dog";
    
    public void display() {
        System.out.println(super.name);  // accesses parent variable
        super.eat();  // calls parent method
    }
}
```

### When to Use
- Access parent class methods or variables
- Call parent class constructor

---

## Constructor Chaining

Constructor chaining is calling one constructor from another using `this()` or `super()`.

### Example
```java
public class Person {
    private String name;
    private int age;
    
    // Constructor 1
    public Person() {
        this("Unknown", 0);  // calls constructor 2
    }
    
    // Constructor 2
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Employee extends Person {
    private String empId;
    
    public Employee(String name, int age, String empId) {
        super(name, age);  // calls parent constructor
        this.empId = empId;
    }
}
```

### Key Points
- `this()` must be first statement in constructor
- `super()` must be first statement in constructor
- Enables code reusability and initialization consistency