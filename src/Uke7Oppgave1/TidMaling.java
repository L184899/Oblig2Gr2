package Uke7Oppgave1;

import java.time.Duration;
import java.time.Instant;
import java.util.Random;

import static Uke7Oppgave1.InsertionSortA.insertionSortA;
import static Uke7Oppgave1.InsertionSortB.insertionSortB;
import static Uke7Oppgave1.InsertionSortC.insertionSortC;

public class TidMaling {

    public static void main(String[] args) {

        Random tilfeldig = new Random(1);

        int n = 50000; 
        int antal = 5;

        Integer[][] original = new Integer[antal][n];

        for (int i = 0; i < antal; i++) {
            for (int j = 0; j < n; j++) {
                original[i][j] = tilfeldig.nextInt();
            }
        }

        Integer[][] aA = copy2D(original);
        Integer[][] aB = copy2D(original);
        Integer[][] aC = copy2D(original);

        //A
        Instant startA = Instant.now();
        for (int i = 0; i < antal; i++) {
            insertionSortA(aA[i]);
        }
        Instant sluttA = Instant.now();
        long tidA = Duration.between(startA, sluttA).toMillis();

        System.out.println("Gjennomsnitt A: " + (tidA / antal) + " ms");


        //B
        Instant startB = Instant.now();
        for (int i = 0; i < antal; i++) {
            insertionSortB(aB[i]);
        }
        Instant sluttB = Instant.now();
        long tidB = Duration.between(startB, sluttB).toMillis();

        System.out.println("Gjennomsnitt B: " + (tidB / antal) + " ms");


        //C
        Instant startC = Instant.now();
        for (int i = 0; i < antal; i++) {
            insertionSortC(aC[i]);
        }
        Instant sluttC = Instant.now();
        long tidC = Duration.between(startC, sluttC).toMillis();

        System.out.println("Gjennomsnitt C: " + (tidC / antal) + " ms");
    }
    
    private static Integer[][] copy2D(Integer[][] src) {
        Integer[][] copy = new Integer[src.length][];
        for (int i = 0; i < src.length; i++) {
            copy[i] = src[i].clone();
        }
        return copy;
    }
}
