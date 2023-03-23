import java.util.Scanner;

public class DeciToBin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        // convert decimal to binary
        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            binary.append(decimal % 2);
            decimal /= 2;
        }

        // reverse the binary number
        StringBuilder reverse = binary.reverse();

        System.out.println("Binary: " + reverse);
    }
}