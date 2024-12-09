package Programs.String;

public class String_method {
    public static void main(String[] args) {
        String name = "Om ";

        System.out.println("Character at index 1 " + name.charAt(1));
        System.out.println("Length of String " + name.length());
        System.out.println("Concate two String " + name.concat(" How Are You!!"));

        String name1 = "Om";
        String name2 = "Om";

        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));
    }
}
