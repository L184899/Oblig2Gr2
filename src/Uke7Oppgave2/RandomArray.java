package Uke7Oppgave2;

import java.util.Random;

public class RandomArray {
    static Integer[] randomArray(int n, int max) {

        Random random = new Random(123);
        Integer[] a = new Integer[n];

        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(max);
        }
        return a;
    }

}
