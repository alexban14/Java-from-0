public class ExceptionsOrder {
    class AnimalsOutForAWalk extends RuntimeException { }
    class ExhibitClosed extends RuntimeException { }
    class ExhibitClosedForLunch extends ExhibitClosed { }

    public void visitMonkeys() {
        try {
            seeAnimal();
        } catch (ExhibitClosed e) {
            System.out.print("not today");
        } catch (ExhibitClosedForLunch e) {// DOES NOT COMPILE
            System.out.print("try back later");
        }
    }

    public void visitSnakes() {
        try {
            seeAnimal();
        } catch (RuntimeException e) {
            System.out.print("runtime exception");
        } catch (ExhibitClosed e) {// DOES NOT COMPILE
            System.out.print("not today");
        } catch (Exception e) {
            System.out.print("exception");
        }
    }
}
