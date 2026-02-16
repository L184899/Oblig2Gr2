package Uke7Oppgave1;

//Modifiser koden som angitt ovenfor og se om det har betydning for tidsbruken. La antall
//elementer være så stort at det tar minst 5 sekunder å utføre sorteringen. Skriv kort hva dere
//observerer. For å generere tilfeldige data og måle tid, se til slutt i øvingen.

import java.util.Arrays;

public class InsertionSortA {

    public static <T extends Comparable<T>> void insertionSortA(T[] a) {

        if(a.length <= 1) return; //hvis tabell length <= 1 -- allerede sortert

        int minIndex = 0;

        for(int i = 1; i < a.length; i++){ //start fra index 1

            //if nåværende(current) i index er minste,
            //minIndex = i (mener at det minste element kommer første i tabell)
            if(a[i].compareTo(a[minIndex]) < 0){
                minIndex = i;
            }
        }
        //basic assignation of element to a place
        //we create help variable tempMin and assign to a[0]
        T tempMin = a[0];
        a[0] = a[minIndex];
        a[minIndex] = tempMin;
        //think of it as a ladder


        //start sort fra indeks 2 (0 er minst, 1 skal bli definert)
        for(int i = 2; i < a.length; i++){

            T temp = a[i];
            int j = i - 1; // j = index before i

            //flytt(move) elementer til høyre hvis de er større enn temp,
            // husk at temp = a[i], og a[i] at index 0
            while (temp.compareTo(a[j]) < 0){
                a[j + 1] = a[j]; //shift to the right
                j--;
            }
            a[j + 1] = temp;

        }

        //Imagine: array = {1,2,9,8,3,5}
        //9 = I = temp, 2 < temp, 8
        // T temp = 8 = i
        //int j = 9 = i - 1
        //int j = i -1
        //8 compare to (9) <0




    }

    public static void main(String[] args) {


        Integer[] taller = {9,7,6,3,8,2,30,1,11};

        System.out.println("Before: " + Arrays.toString(taller));

        insertionSortA(taller);

        System.out.println("After:  " + Arrays.toString(taller));
    }
}