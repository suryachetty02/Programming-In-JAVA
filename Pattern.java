class Pattern {
    public static void main(String args[]) {
        int i, j;
        int n = 4;
        for (i = 1; i <= i; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
            if (i == n)
                break;
        }
        for (i = n - 1; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}