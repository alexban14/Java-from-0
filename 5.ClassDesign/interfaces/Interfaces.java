public class Interfaces {
    public interface Herbivore {
        public int eatPlants(int quantity);
    }

    public interface Omnivore {
        public void eatPlants();
    }

    public class Bear implements Herbivore, Omnivore {
        public int eatPlants(int quantity) {
            System.out.println("Eating plants: "+quantity);
            return quantity;
        }
        public void eatPlants() {
            System.out.println("Eating plants");
        }
    }
}
