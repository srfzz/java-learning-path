
/**
 * A record representing a student entity with essential academic information.
 * 
 * <p>This immutable data carrier class encapsulates student identification and 
 * classification details. As a Java record, it automatically provides:
 * <ul>
 *   <li>A canonical constructor accepting all components</li>
 *   <li>Public accessor methods for each field</li>
 *   <li>Value-based equality comparison via {@code equals()}</li>
 *   <li>Consistent hash code generation for use in hash-based collections</li>
 *   <li>Readable string representation via {@code toString()}</li>
 * </ul>
 * 
 * <p><strong>Immutability:</strong> All fields are implicitly private and final.
 * Once constructed, a Student record instance cannot be modified, ensuring
 * thread-safety and predictable behavior throughout its lifecycle.
 * 
 * @param id         The unique identifier for the student
 * @param name       The full name of the student
 * @param age        The age of the student in years
 * @param classList The assigned class or grade level designation
 * 
 * @since 14
 * @version 1.0
 */
public record Student(String id,String name , int age ,String classList) {
    //The part That is inde the () parenthesis is called record header which defines the components of the record. Each component consists of a name and a type. In this case, the record Student has four components: id (String), name (String), age (int), and classList (String). The record header is used to define the structure of the record and the fields that it contains.
    //By default the field is defined private or final  and record class in immutable which  means that once the instance of the record is created  the values cannot change.this is because the record class is designed to be immutable and to maintain a consistent state for the record instances. The immutability of the record class helps to ensure that the data stored in the record is not modified after it is created, which can help to prevent bugs and improve the reliability of the code.
    // This path is used to create a record class named Student with four fields: id, name, age, and classList. The record class automatically generates a constructor, accessor methods, equals(), hashCode(), and toString() methods based on the fields defined in the record declaration.
    //java generates  a toString() method for the record class that returns a string representation of the record instance. The toString() method is generated based on the fields defined in the record declaration, and it includes the field names and their corresponding values. When you call System.out.println(student), it will automatically invoke the toString() method of the Student record, which will return a string representation of the student instance, including its id, name, age, and classList.
    //java generates an equals() method for the record class that compares the values of the fields defined in the record declaration. The equals() method is generated based on the fields defined in the record declaration, and it checks if the values of all the fields are equal between two instances of the record. If all the field values are equal, then the equals() method returns true; otherwise, it returns false. This allows you to compare two instances of the Student record for equality based on their field values.
    //java Generates a hashCode() method for the record class that computes a hash code based on the values of the fields defined in the record declaration. The hashCode() method is generated based on the fields defined in the record declaration, and it computes a hash code by combining the hash codes of all the fields. This allows you to use instances of the Student record in hash-based collections, such as HashMap or HashSet, where the hash code is used to determine the bucket location for storing and retrieving objects.
    //java generates a publlic accessor  method for each component defined in the record declaration. The accessor methods are generated based on the fields defined in the record declaration, and they allow you to access the values of the fields in a read-only manner. For example, if you have a Student record with a field named "name", Java will generate a public accessor method named "name()" that returns the value of the "name" field. You can use these accessor methods to retrieve the values of the fields from an instance of the Student record.
    

}
