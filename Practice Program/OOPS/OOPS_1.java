package OOPS;

class Animal {
    int legs;

    void eat() {
        System.out.println("Eating..");
    }
}

public class OOPS_1 {
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.legs = 4;
        cat.eat();
        System.out.println(cat.legs);
    }
}
