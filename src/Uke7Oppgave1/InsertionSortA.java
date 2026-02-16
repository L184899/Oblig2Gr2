package Uke7Oppgave1;

//Modifiser koden som angitt ovenfor og se om det har betydning for tidsbruken. La antall
//elementer være så stort at det tar minst 5 sekunder å utføre sorteringen. Skriv kort hva dere
//observerer. For å generere tilfeldige data og måle tid, se til slutt i øvingen.

import java.util.Arrays;

public class InsertionSortA {

    //we are going through 1 element: one to another

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

        while (minIndex > 0) {
            T tmp = a[minIndex];
            a[minIndex] = a[minIndex - 1];
            a[minIndex - 1] = tmp;
            minIndex--;
        }

        //start sort fra indeks 1 (0 er minst, så vi kan starte på 1)
        for(int i = 1; i < a.length; i++){

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
    }

    //my little test
    public static void main(String[] args) {

        Integer[] taller = {9,7,6,3,8,2,30,1,11};

        System.out.println("Before: " + Arrays.toString(taller));

        insertionSortA(taller);

        System.out.println("After:  " + Arrays.toString(taller));
    }
}
