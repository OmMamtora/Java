package Practice_Program.Array;

public class Reverse_Array {
    public static void main(String[] args) {
        int[] arr = { 10, 15, 20, 25, 30, 35 };

        System.out.println("Orignal Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;

        }
        System.out.println("Reversed array is: \n");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Reverse string array..

        String str = "Om Mamtora";
        char[] ch = str.toCharArray();

        System.out.print(" Reversed String is ");

        char t;
        for (int i = 0; i < ch.length / 2; i++) {
            t = ch[i];
            ch[i] = ch[ch.length - i - 1];
            ch[ch.length - i - 1] = t;
        }
        System.out.println(ch);

    }
}