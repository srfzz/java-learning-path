package String.StringComparsionMethods;

public class StringComparisonMethod {
    public static void main(String[] args)
    {
        String str="Sarfaraj Ansari";
        String birthDate="23/12/1998";
        System.out.println(birthDate.indexOf("1998"));
        System.out.println("Birth date is : "+birthDate);
        System.out.println("Birth date is : "+birthDate.substring(6));  
        String[] dateParts=birthDate.split("/");
        System.out.println(dateParts[0]);
        System.out.println(dateParts[1]);
        System.out.println(dateParts[2]);
        String joinedDate=String.join("-", dateParts);
        System.out.println("Joined date: "+joinedDate);
        String formattedDate=String.format("Day: %s, Month: %s, Year: %s", dateParts[0], dateParts[1], dateParts[2]);
        System.out.println(formattedDate);

    }

}
