package Uke7Oppgave1;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Random;

import static Uke7Oppgave1.InsertionSortA.insertionSortA;
import static Uke7Oppgave1.InsertionSortB.insertionSortB;
import static Uke7Oppgave1.InsertionSortC.insertionSortC;

public class TidMåling {
    public static void main(String[] args) {

        Random tilfeldig = new Random(1);
        int n = 32000;
        int antal = 5;

        Integer[][] a = new Integer[antal][n];

        for (int i = 0; i < antal; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = tilfeldig.nextInt();
            }
        }

        Integer[] tallerA = {9,7,6,3,8,2,30,1,11};

        System.out.println("Before(insertionA): " + Arrays.toString(tallerA));

        insertionSortA(tallerA);

        System.out.println("After(insertionA):  " + Arrays.toString(tallerA));

        Instant start = Instant.now();

        for (int i = 0; i < antal; i++) {
            insertionSortA(a[i]);
        }
        Instant sluttA = Instant.now();
        long tidA = Duration.between(start, sluttA).toMillis();
        System.out.println("GjennomsnittA: " + (tidA / antal) + " ms");
        System.out.println();

        Integer[] tallerB = {4,9,1,0,22,11,89,2,28};

        System.out.println("Before(insertionB): " + Arrays.toString(tallerB));

        insertionSortB(tallerB);

        System.out.println("After(insertionB):  " + Arrays.toString(tallerB));

        for (int i = 0; i < antal; i++) {

            insertionSortB(a[i]);

        }
        Instant sluttB = Instant.now();
        long tidB = Duration.between(start, sluttB).toMillis();
        System.out.println("GjennomsnittB: " + (tidB / antal) + " ms");
        System.out.println();

        Integer[] tallerC = {100,15,5,44,99,88,22,33,11};

        System.out.println("Before(insertionC): " + Arrays.toString(tallerC));

        insertionSortB(tallerC);

        System.out.println("After(insertionC):  " + Arrays.toString(tallerC));


        for (int i = 0; i < antal; i++) {

            insertionSortC(a[i]);
        }
        Instant sluttC = Instant.now();
        long tidC = Duration.between(start, sluttC).toMillis();
        System.out.println("GjennomsnittC: " + (tidC / antal) + " ms");
        System.out.println();


    }

}
