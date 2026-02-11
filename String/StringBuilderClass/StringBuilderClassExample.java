package String.StringBuilderClass;

public class StringBuilderClassExample {
    public static void main(String[] args)
    {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<1000;i++)
        {
            sb.append("number").append(i).append("");
            String result=sb.toString();
            System.out.printf("result is %s%n", result);
        }
    }

}
