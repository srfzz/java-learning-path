# What is a Record in Java?

Records were introduced in Java 14 and became an official language feature in Java 16. They reduce boilerplate code in POJOs while enforcing stricter constraints.

Java refers to records as "plain data carriers." A record is a specialized class type designed to hold immutable data and members. Records automatically generate fundamental methods such as constructors and accessors, enabling you to achieve immutability with minimal code.

## Example: Student Record

```java
public record Student(String id, String name, int age, String classList) {
}
```

The components in the record header define the record's structure. Java automatically generates:
- A canonical constructor accepting all components
- Public accessor methods for each field
- `equals()` and `hashCode()` methods for value-based comparison
- `toString()` method for readable string representation

All fields are implicitly `private` and `final`, making records immutable by design.

