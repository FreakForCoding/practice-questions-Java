public class butterfly_pattern {
    public static void main(String[] args) {
        int r = 4;

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            // spaces
            int spaces = 2 * (r - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = r; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            // spaces
            int spaces = 2 * (r - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
