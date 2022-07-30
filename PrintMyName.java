
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class PrintMyName {
    public static void Factorial(int a) {
        int factorial = 1;
        for (int i = a; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 5;

        Factorial(a);

    }
}