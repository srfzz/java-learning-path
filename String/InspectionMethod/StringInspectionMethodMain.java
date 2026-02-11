package String.InspectionMethod;

public class StringInspectionMethodMain {
public static void main(String[] args) {
    String str = " sarfaraj Ansari  ";
    String str2 ="sarfaraj Ansari";
    str = str.trim();
    str2 = str2.trim();
    System.out.println("str and str2 are equal: " + str.equals(str2));
    System.out.println("str and str2 are equal ignoring case: " + str.equalsIgnoreCase(str2));
    System.out.println("str and str2 are the same object: " + (str == str2));
    System.out.println("str and str2 are the same object after trimming: " + (str == str2));
    
    // // Length of the string
    // System.out.println("Length: " + str.length());
    System.out.println("Length is : " + str.length());
    System.out.println("Is empty: " + str.isEmpty());
    System.out.println("Contains 'World': " + str.contains("World"));
    if(!str.isBlank())
    {
        System.out.printf("Index of 'o': %d %n", str.indexOf('o'));
        System.out.println("Character at index 7: " + str.charAt(7));
    System.out.printf("Substring (0, 5): %s %n", str.substring(0, 5));
    }
    
    System.out.println("Uppercase: " + str.toUpperCase());
    System.out.println("Lowercase: " + str.toLowerCase());
System.out.println("Trimmed: '" + str.trim() + "'");

System.out.println("Is blank: " + str.isBlank());
    
    // // Check if the string is empty
    // System.out.println("Is empty: " + str.isEmpty());
    
    // // Check if the string contains a substring
    // System.out.println("Contains 'World': " + str.contains("World"));
    
    // // Get a character at a specific index
    // System.out.println("Character at index 7: " + str.charAt(7));
    
    // // Get a substring
    // System.out.println("Substring (0, 5): " + str.substring(0, 5));
    
    // // Convert to uppercase
    // System.out.println("Uppercase: " + str.toUpperCase());
    
    // // Convert to lowercase
    // System.out.println("Lowercase: " + str.toLowerCase());
    
    // // Trim whitespace
    // String strWithWhitespace = "   Hello, World!   ";
    // System.out.println("Trimmed: '" + strWithWhitespace.trim() + "'");
}

}
