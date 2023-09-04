public class InterfaceVariables {
    // before compilation
    public interface CanSwim {
        int MAXIMUM_DEPTH = 100;
        final static boolean UNDERWATER = true;
        public static final String TYPE = "Submersible";
    }

    // after compilation
    public interface CanSwim {
        public static final int MAXIMUM_DEPTH = 100;
        public static final boolean UNDERWATER = true;
        public static final String TYPE = "Submersible";
    }
}
