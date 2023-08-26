public  OverloadingConstructors {
    private String color;
    private int weight;

    public OverloadingConstructors(int weight) { // first constructor
        this(weight, brown);
    }
    public OverloadingConstructors(int weight, String color) { // second constructor
        this.weight = weight;
        this.color = color;
    }
}

// constructor chaining
class Mouse {
    private int numTeeth;
    private int numWhiskers;
    private int weight;

    public Mouse(int weight) {
        this(weight, 16); // calls constructor with 2 parameters
    }

    public Mouse(int weight, int numTeeth) {
        this(weight, numTeeth, 6); // calls constructor with 3 parameters
    }

    public Mouse(int weight, int numTeeth, int numWhiskers) {
        this.weight = weight;
        this.numTeeth = numTeeth;
        this.numWhiskers = numWhiskers;
    }

    public void print() {
        System.out.println(weight + " " + numTeeth + " " + numWhiskers);
        // 15 16 6
    }

    public static void main(String[] args) {
        Mouse mouse = new Mouse(15);
        mouse.print();
    }
}
