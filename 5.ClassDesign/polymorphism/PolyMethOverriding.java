public class PolyMethOverriding {
    public class Animal {
        public String getName() {
            return "Animal";
        }
    }
    public class Gorilla extends Animal {
        // the overriden method is not as accesable as in the extended class
        protected String getName() { // DOES NOT COMPILE
            return "Gorilla";
        }
    }
    public class ZooKeeper {
        public static void main(String[] args) {
            Animal animal = new Gorilla();
            System.out.println(animal.getName());
            // allowed, because the method is public in the Animal class
        }
    }
}
