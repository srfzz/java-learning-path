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
## The `extends` Keyword

The `extends` keyword in Java is used to establish an inheritance relationship between a child class and a parent class.

**Syntax:**
```java
class ChildClass extends ParentClass {
    // Child class code
}
```

**How it works:**
- The child class inherits all non-private fields and methods from the parent class
- `Dog extends Animal` means "Dog is a type of Animal"
- A class can extend only one parent class (single inheritance)
- The child class can add new methods, override parent methods, or add new fields

**Key points:**
- Use `extends` to create a parent-child relationship
- The child class gets access to all public and protected members of the parent
- This is the foundation of inheritance in Java
**Without inheritance**: You'd duplicate `eat()` and `sleep()` in both `Dog` and `Cat`. **With inheritance**: Both classes automatically have these methods, reducing code duplication and making updates easier.

## Benefits in Practice

- **Reduces bugs**: Shared code is tested once, benefits all child classes
- **Faster development**: Less code to write and maintain
- **Extensibility**: Add new animal types without rewriting basic behavior