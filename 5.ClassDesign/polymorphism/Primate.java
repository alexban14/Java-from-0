public class Primate {
    public boolean hasHair() {
        return true;
    }
}

public interface HasTail {
    public boolean isTailStriped();
}

public class Lemur extends Primate implements HasTail {
    public boolean isTailStriped() {
        return false;
    }
    public int age = 10;
    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);

        HasTail hasTail = lemur;
        System.out.println(hasTail.isTailStriped());
        System.out.println(hasTail.age); // DOES NOT COMPILE
        // the reference hasTail has direct access only to the methods defined within the HasTail interface

        Primate primate = lemur;
        System.out.println(primate.hasHair());
        System.out.println(primate.isTailStriped()); // DOES NOT COMPILE
        // the reference primate has access only to methods defined in the Primate class
        
        // object casting

        Primate primate = lemur;
        Lemur lemur2 = primate; // DOES NOT COMPILE

        Lemur lemur3 = (Lemur)primate;
        System.out.println(lemur3.age); // 10
    }
}
