public class DefaultMethods {
    public interface HasFins {
        public default int getNumberOfFins() {
            return 4;
        }
        public default double getLongestFinLength() {
            return 20.0;
        }
        public default boolean doFinsHaveScales() {
            return true;
        }
    }

    public interface SharkFamily extends HasFins {
        public default int getNumberOfFins() {
            return 8;
        }

        // overrides the method from the extended interface by making it abstract
        public double getLongestFinLength();

        public boolean doFinsHaveScales() { // DOES NOT COMPILE, it doesn't have default keyword
            return false;
        }
    }
}
