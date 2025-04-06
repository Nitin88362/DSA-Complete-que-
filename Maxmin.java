public class Maxmin {
    public static int update(int num[]) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (largest < num[i]) {
                largest = num[i];
            }

        }
        return largest;
    }

    public static void main(String args[]) {
        int num[] = { 1, 5, 7, 5, 6, 2 };
        System.out.println(update(num));

    }
}