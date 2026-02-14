# Polymorphism in Java

## Overview
Polymorphism means "many forms." It's a core OOP concept allowing objects to take multiple forms and enabling a single interface to represent different underlying data types.

## Types of Polymorphism

### 1. Compile-time Polymorphism (Static)

#### Method Overloading
Multiple methods with the same name but different parameters:
```java
class Calculator {
    public int add(int a, int b) { return a + b; }
    public double add(double a, double b) { return a + b; }
    public int add(int a, int b, int c) { return a + b + c; }
}
```

### 2. Runtime Polymorphism (Dynamic)

#### Method Overriding
Subclass provides specific implementation of a parent class method:
```java
class Animal {
    public void sound() { System.out.println("Generic sound"); }
}

class Dog extends Animal {
    @Override
    public void sound() { System.out.println("Bark"); }
}
```

## When to Use Polymorphism

- **Code Reusability**: Write once, use for multiple types
- **Flexibility**: Easy to extend with new classes
- **Loose Coupling**: Depend on abstractions, not concrete implementations
- **Maintainability**: Changes in one place don't break others

## Benefits

✓ Reduces code duplication
✓ Improves code maintainability
✓ Enables extensible designs
✓ Supports the Open/Closed Principle