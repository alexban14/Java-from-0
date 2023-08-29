class Animal {
    private int age;
    public Animal(int age) {
        super(); // a call to the java.lang.Object parent class constructor
        this.age = age;
    }
}

public class Zebra extends Animal {
    public Zebra(int age) {
        super(age); // a call to the Animal class parent constructor
    }
    public Zebra() {
        this(4);
    }
}
