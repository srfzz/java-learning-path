# Java String Guide

## What is String?
A String is a sequence of characters in Java. It's an immutable object, meaning once created, its value cannot be changed.

## Why Use Strings?
- Store and manipulate text data
- Foundation for text processing
- Widely used in applications

## String Immutability
Once a String is created, it cannot be modified. Any operation that appears to change a String actually creates a new String object.

```java
String s1 = "Hello";
String s2 = s1.toUpperCase(); // Creates new String, s1 unchanged
```

## Common String Methods

| Method | Use Case |
|--------|----------|
| `length()` | Get string length |
| `charAt(int)` | Get character at index |
| `substring(int)` | Extract part of string |
| `toUpperCase()` | Convert to uppercase |
| `toLowerCase()` | Convert to lowercase |
| `trim()` | Remove leading/trailing spaces |
| `equals()` | Compare strings (content) |
| `compareTo()` | Compare strings lexicographically |
| `contains()` | Check if substring exists |
| `startsWith()` / `endsWith()` | Check prefix/suffix |
| `indexOf()` | Find substring position |
| `replace()` | Replace characters/substrings |
| `split()` | Split into array |
| `concat()` | Join strings |

## Performance Note
For frequent string modifications, use `StringBuilder` instead of String.
