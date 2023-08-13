public class WhileStatement {
    public static void main (String[] args) {
        if (args.length > 0) {
            int bitesOfCheese = Integer.parseInt(args[0]);
            eatCheese(bitesOfCheese);
        } else {
            System.out.println("Please provide the number of bites of cheese as a command-line argument.");
        }
    }

    public static void eatCheese(int bitesOfCheese) {
        int roomInBelly = 5;
        while (bitesOfCheese > 0 && roomInBelly > 0) {
            bitesOfCheese--;
            roomInBelly--;
        }
        System.out.println(bitesOfCheese+" pieces of cheese left");
    }
}
