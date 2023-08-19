public class TwoDForEach {
    public static void main(String[] args) {
        int[][] twoD = new int[3][2];
        for (int[] inner : twoD) {
            for (int num : inner) 
                System.out.print(num + " ");
            System.out.println(); 
        }
    }
}
