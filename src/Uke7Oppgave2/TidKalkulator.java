package Uke7Oppgave2;

import static Uke7Oppgave2.TidMetoder.equalArray;
import static Uke7Oppgave2.TidMetoder.randomArray;
import static Uke7Oppgave2.Sortering.*;

public class TidKalkulator {
    public static void main(String[] args) {

        int[] N = {32000, 64000, 128000};
        int repeats = 5;

        System.out.println("Random data");

        for (int n : N) {

            Integer[] base = randomArray(n, 1_000_000);

            long ti = timeSort("insert", base, repeats);
            long ts = timeSort("select", base, repeats);
            long tq = timeSort("quick", base, repeats);
            long tm = timeSort("merge", base, repeats);

            System.out.println("\nN = " + n);
            System.out.println("Insertion ms: " + ti / 1_000_000);
            System.out.println("Selection ms: " + ts / 1_000_000);
            System.out.println("Quick ms:     " + tq / 1_000_000);
            System.out.println("Merge ms:     " + tm / 1_000_000);
        }

        System.out.println("\nquick sort - alle lik elementer");

        Integer[] equal = equalArray(20000);
        long t = timeSort("quick", equal, 3);

        System.out.println("Quick equal ms: " + t / 1_000_000);
    }

    static long timeSort(String title, Integer[] base, int repeats) {

        long start = System.nanoTime();

        for (int i = 0; i < repeats; i++) {
            Integer[] copy = base.clone();

            switch (title) {
                case "insert":
                    insertionSort(copy);
                    break;
                case "select":
                    selectionSort(copy);
                    break;
                case "quick":
                    quickSort(copy);
                    break;
                case "merge":
                    mergeSort(copy);
                    break;
            }
        }
        long end = System.nanoTime();
        return (end - start) / repeats;
    }
}
