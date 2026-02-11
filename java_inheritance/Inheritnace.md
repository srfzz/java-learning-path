what is inheritance and why it is used ?
we can look inheritnace as a form of code reuse 
its a way to organise  classes into  a parent-child heirarchy,which lets which lets the child class to inherit(reuse) parent clas field and methods.

## Why Inheritance is Used

Inheritance solves several key problems in software development:

- **Code Reuse**: Avoid duplicating common functionality across multiple classes
- **Maintainability**: Update shared code in one place instead of multiple locations
- **Hierarchy & Organization**: Establish logical relationships between related classes
- **Polymorphism**: Write flexible code that works with parent class types

## Example: Animal Hierarchy

```java
// Parent class
class Animal {
    String name;
    
    void eat() {
        System.out.println(name + " is eating");
    }
    
    void sleep() {
        System.out.println(name + " is sleeping");
    }
}

// Child classes inherit from Animal
class Dog extends Animal {
    void bark() {
        System.out.println(name + " says: Woof!");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println(name + " says: Meow!");
    }
}
```

**Without inheritance**: You'd duplicate `eat()` and `sleep()` in both `Dog` and `Cat`. **With inheritance**: Both classes automatically have these methods, reducing code duplication and making updates easier.

## Benefits in Practice

- **Reduces bugs**: Shared code is tested once, benefits all child classes
- **Faster development**: Less code to write and maintain
- **Extensibility**: Add new animal types without rewriting basic behavior