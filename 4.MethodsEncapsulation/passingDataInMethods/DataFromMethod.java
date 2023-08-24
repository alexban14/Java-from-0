public class DataFromMethod {
    public static void main(String[] args) {
        int number = 1;
        String letters = "abc";
        number(number); // number is still 1
        letters = letters(letters); // abcd
        System.out.println(number + letters); // 1abcd
    }

    public static int number(int number) {
        number++;
        return number;
    }

    public static String letters(String letters) {
        letters += "d";
        return letters;
    }
}
