import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("i = " + i);
            i += 2;
        } while (i <= 100);

        int j = 100;
        do {
            System.out.println("j = " + j);
            j -= 5;
        } while (j >= -10);

        long k = 2;
        do {
            System.out.println("k = " + k);
            k *= k;
        } while (k < 1000000);

        for(int m = 100; m >= -10; m -= 5) {
            System.out.println("m = " + m);
        }

        for(long n = 2; n < 1000000; n *= n) {
            System.out.println("n = " + n);
        }
    }

    }

