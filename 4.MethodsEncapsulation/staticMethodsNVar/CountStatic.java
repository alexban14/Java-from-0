public class CountStatic {
    private static int count;
    // static (and instance) variables are automatically initialized to the default value
    // in this case 0
    public CountStatic() { count++; }
        public static void main(String[] args) {
            Counter c1 = new Counter();
            Counter c2 = new Counter();
            Counter c3 = new Counter();
            System.out.println(count); // 3
        }
}
