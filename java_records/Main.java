
public class Main {
    public static void main(String[] args)
    {
        System .out.println("This is the main method of the program");
        for(int i = 0; i < 100; i++) {
            String name = switch(i) {
                case 0 -> "John";
                case 1 -> "Jane";
                case 2 -> "Jack";
                case 3 -> "Jill";
                default -> "Unknown";
            };
            String id = "ID" + i;
            int age = 18 + i % 5;
            String classList = "Class " + (i % 10 + 1);
            
            Student student = new Student(id,name, age, classList);
            System.out.println(student);
        }
    }

}
