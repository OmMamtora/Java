package OOPS;

/*
 Two types of Polymorphism
    Runtime ->Method over riding.
    Compile time-> Method over Loading.
 
 */

//Method OVERRIDING
class A {
    void show() {
        System.out.println("A");
    }
}

class B extends A {
    @Override
    void show() {
        System.out.println("B");
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int add(float a, int b) {
        return (int) a + b;
    }
}

public class polymorphism_5 {

    // Compile Time Method OVERLOADING..

    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.add(10, 20));
        obj.show();

    }
}
