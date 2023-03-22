import java.util.Scanner;

public class UglyNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        boolean isUgly = isUglyNumber(n);

        if (isUgly) {
            System.out.println(n + " is an ugly number");
        } else {
            System.out.println(n + " is not an ugly number");
        }
    }

    public static boolean isUglyNumber(int n) {
        if (n <= 0) {
            return false;
        }

        while (n % 2 == 0) {
            n /= 2;
        }

        while (n % 3 == 0) {
            n /= 3;
        }

        while (n % 5 == 0) {
            n /= 5;
        }

        return n == 1;
    }
}