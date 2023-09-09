public class MethodThrowExcep {

    public class Bunny {
        public static void main(String[] args) {
            eatCarrot();// DOES NOT COMPILE
        }

        private static void eatCarrot() throws NoMoreCarrotsException {
        }
    }

    public class BunnyCompiles {
        public static void main(String[] args) {
            throws NoMoreCarrotsException { // declare Exception
                eatCarrot();// DOES NOT COMPILE
            }
        }

        private static void eatCarrot() throws NoMoreCarrotsException {
        }
    }
    
    public class BunnyCompilesSec {
        public static void main(String[] args) {
            public static void main(Stringp[] args) {
                try {
                    eatCarrot();
                catch (NoMoreCarrotsException e) {
                    System.out.print("sad rabbit");
                }

            }
        }

        private static void eatCarrot() throws NoMoreCarrotsException {
        }
    }

}
