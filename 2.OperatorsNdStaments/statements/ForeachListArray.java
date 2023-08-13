public class ForeachListArray {
    public static void main(String[] args) {
        if (args.length >= 3) {
           //  getNamesArr(args);
           getNamesList(args);
        } else {
            System.out.println("You must provide 3 names as arguments for the program to work");
        }
    }

    public static void getNamesArr(String[] names) {
        final String[] namesToPrint = new String[3];

        namesToPrint[0] = names[0];
        namesToPrint[1] = names[1];
        namesToPrint[2] = names[2];

        for (String value : namesToPrint) {
            System.out.print(value + ", ");
        }
    }

    public static void getNamesList(String[] names) {
        java.util.List<String> values = new java.util.ArrayList<String>();
        values.add(names[0]);
        values.add(names[1]);
        values.add(names[2]);

        for (String value : values) {
            System.out.println(value + ", ");
        }
    }
}
