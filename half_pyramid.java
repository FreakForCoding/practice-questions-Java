public class half_pyramid {
    public static void main(String[] args) {
        int n = 5;
        // int number = 10;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }

        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= i; j++) {

        // System.out.print(number + " ");
        // number--;

        // }
        // // for (int j = 1; j <= i; j++) {
        // // System.out.print("*");
        // // }
        // System.out.println();
        // }

        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i; j++) {

        // System.out.print(" ");

        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // for (int i = 1; i <= r; i++) {
        // for (int j = 4; j >= i; j--) {

        // System.out.print("*");

        // }
        // System.out.println();
        // }

        // for (int i = 1; i <= r; i++) {
        // for (int j = 1; j <= i; j++) {

        // System.out.print("*");

        // }
        // System.out.println();
        // }
    }
}