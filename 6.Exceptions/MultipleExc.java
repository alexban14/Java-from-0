public class MultipleExc {
    class AnimalsOutForAWalk extends RuntimeException { }
    class ExhibitClosed extends RuntimeException { }
    class ExhibitClosedForLunch extends ExhibitClosed { }

    public void visitPorcupine() {
        try {
            seeAnimal();
        } catch (AnimalOutForAWalk e) {
            System.out.print("try back later");
        } catch (ExhibitClosed e) {
            System.out.print("not today");
        }
    }
}
