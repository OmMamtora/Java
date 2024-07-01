package OOPS;

/*single level Inheritance and Multi level
class A {
    int amt = 500;
}

class B extends A {

}

class C extends B {

}
*/

// Multiple inheritance
interface Swimming {
    void swim();
}

interface Flying {
    void fly();
}

class Bird implements Swimming, Flying {
    public void swim() {
        System.out.println("Bird is Swimming..");
    }

    public void fly() {
        System.out.println("Bird is flying..");
    }
}

public class Inheritance_4 {
    public static void main(String[] args) {

        Bird duck = new Bird();
        duck.fly();
        duck.swim();
        // C c = new C();
        // System.out.println(c.amt);
    }
}
