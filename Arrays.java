import javax.sound.sampled.SourceDataLine;

import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        // int[] marks = { 10, 12, 13 };
        // int english = marks[2];
        // System.out.println(english);
        System.out.println("what you want");
        int x = sc.nextInt();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                System.out.println("x found at index" + i);
            }

        }
    }
}
