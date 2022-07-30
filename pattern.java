import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = 4;
        int k = 5;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= k; j++) {
                if (i == 1 || j == 1 || i == r) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println("*");
        }
    }
}
