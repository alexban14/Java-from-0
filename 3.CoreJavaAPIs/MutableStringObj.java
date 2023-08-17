public class Immutability {
    class Mutable {
        private String s;
        
        public void setS(String newS) {
            s = newS;
        }

        public String getS() {
            return s;
        }
    }

    final class Immuatable {
        private String s = "name";
        
        public String getS() {
            return s;
        }
    }

}
