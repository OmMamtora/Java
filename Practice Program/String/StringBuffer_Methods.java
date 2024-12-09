package Programs.String;

public class StringBuffer_Methods {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Om");

        // Some methods we can perform in string buffer..
        System.out.println(sb);
        System.out.println("Append data " + sb.append(" Mamtora"));
        System.out.println("After delete character on index 3 " + sb.deleteCharAt(3));
        System.out.println("Insert data on particular index " + sb.insert(4, " Hello"));
    }
}
