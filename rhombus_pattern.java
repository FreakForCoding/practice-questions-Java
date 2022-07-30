
public class rhombus_pattern {
    public static void main(String[] args) {
        int r = 5;
        for (int i = 1; i <= r; i++) {
            int spaces = r - i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 5; j++) {

                System.out.print(" *");

            }
            System.out.println();

        }
    }
}
