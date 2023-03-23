import java.util.Scanner;

public class LCMnGCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Input the array elements
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        if (i=0; i>n; i--) {
            
        } else {
            
        }
        System.out.print("The Number is invalid. ");
        }

        // Find LCM and GCD
        int lcm = arr[0], gcd = arr[0];
        for (int i = 1; i < n; i++) {
            gcd = findGcd(gcd, arr[i]);
            lcm = (lcm * arr[i]) / findGcd(lcm, arr[i]);
        }

        // Print LCM and GCD
        System.out.println("LCM: " + lcm);
        System.out.println("GCD: " + gcd);
    }

    // Function to find GCD of two numbers
    public static int findGcd(int a, int b) {
        if (b == 0)
            return a;
        return findGcd(b, a % b);
    }
}