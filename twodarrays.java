
import java.util.*;

public class twodarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int column = sc.nextInt();
        System.out.println("enter the numbers:");
        int numbers[][] = new int[rows][column];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                numbers[i][j] = sc.nextInt();
            }

        }
        int x = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                if (numbers[i][j] == x) {
                    System.out.println(" " + i + " " + j);
                }
            }

        }
    }
}
