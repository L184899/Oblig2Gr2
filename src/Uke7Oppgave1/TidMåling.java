package Uke7Oppgave1;

import java.time.Duration;
import java.time.Instant;
import java.util.Random;

import Uke7Oppgave1.InsertionSortA;
import Uke7Oppgave1.InsertionSortB;
import Uke7Oppgave1.InsertionSortC;

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

        Instant start = Instant.now();

        for (int i = 0; i < antal; i++) {
            insertionSortA(a[i]);
        }
        Instant sluttA = Instant.now();
        long tidA = Duration.between(start, sluttA).toMillis();
        System.out.println("GjennomsnittA: " + (tidA / antal) + " ms");

        for (int i = 0; i < antal; i++) {

            insertionSortB(a[i]);

        }
        Instant sluttB = Instant.now();
        long tidB = Duration.between(start, sluttB).toMillis();
        System.out.println("GjennomsnittB: " + (tidB / antal) + " ms");

        for (int i = 0; i < antal; i++) {

            insertionSortC(a[i]);
        }
        Instant sluttC = Instant.now();
        long tidC = Duration.between(start, sluttC).toMillis();
        System.out.println("GjennomsnittC: " + (tidC / antal) + " ms");


    }

}
