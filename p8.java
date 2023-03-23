import java.util.*;

public class p8 {
    private static Scanner sc;

    public static void main(String[] args) {
        int rows, columns, i, j;
        sc = new Scanner(System.in);

        System.out.print("Please Enter the number of Rows : ");
        rows = sc.nextInt();

        System.out.print("Please Enter the number of Columns : ");
        columns = sc.nextInt();

        for (i = 1; i <= rows; i++) {
            for (j = 1; j < columns; j++) {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }

    }
}