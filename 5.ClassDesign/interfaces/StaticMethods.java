public class StaticMethods {
    public interface Hop {
        static int getJumpHeight() {
            return 8;
        }
    }

    public class Bunny implements Hop {
        public void printDetails() {
            System.out.println(Hop.getJumpHeight());
        }
    }
}
