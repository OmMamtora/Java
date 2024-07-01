package OOPS;

import java.util.ArrayList;

public class Exception_7 {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(2);
        al.add(9);
        System.out.println(al);
        try {
            System.out.println(1 / 0);
        } catch (Exception e) {
            System.out.println(e);
        }
        al.add(4);
        System.out.println(al);
    }
}
