public class NumberOfDigits {
    public static int countDigits(int n) {
        if (n == 0) {
            return 1;
        }
        return (int) (Math.log10(Math.abs(n)) + 1);
    }

    public static void main(String[] args) {
        int n = 12345;
        System.out.println("Number of digits in " + n + ": " + countDigits(n));
    }
}
