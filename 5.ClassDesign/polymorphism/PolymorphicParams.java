public class Reptile {
    public String getName() {
        return "Reptile";
    }
}

public class Alligator extends Reptile {
    public String getName() {
        return "Alligator";
    }
}

public class Crocodile extends Reptile {
    public String getName() {
        return "Crocodile";
    }
}

public class ZooWorker {
    public static void feed(Reptile reptile) {
        System.out.println("Feeding reptile "+reptile.getName());
    }
    286 Chapter 5 ■ Class Design
        public static void main(String[] args) {
            feed(new Alligator()); // Alligator
            feed(new Crocodile()); // Crocodile
            feed(new Reptile()); // Reptile
        }
}
