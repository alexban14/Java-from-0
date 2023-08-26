public class ReferenceTypes {
    public void fly(String s) {
        System.out.println("string");
    }

    public void fly(Object o( {
        System.out.println("object ");
    }

    public static void main(Stringp[] args) {
        ReferenceTypes r = new ReferenceTypes();
        r.fly("test");
        r.fly(56); // Java autoboxes type Integer to type Object
    }
}
