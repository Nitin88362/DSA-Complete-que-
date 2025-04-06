public class Reverse {
    public static void reverse(int num[]) {
        int first = 0, last = num.length - 1;
        while (first < last) {
            int temp = num[first];
            num[first] = num[last];
            num[last] = temp;
            first++;
            last--;

        }
    }

    public static void main(String[] args) {
        int num[] = { 1, 5, 8, 9, 6, 3, 4, 5, 7 };
        reverse(num);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
        }
    }
}
