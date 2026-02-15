package Uke7Oppgave1;

//Kombiner de to triksene ved å flytte minste elementet først (som i a) før sorteringen starter
//og deretter sette inn to elementer om gangen. Pass på at metoden fungerer for både odde
//og jevne n. Skriv kort hva dere observerer.

public class InsertionSortC {

    public static <T extends Comparable<T>> void insertionSortC(T[] a) {

        //ganske kort tabell for å bli sortert
        if(a.length <= 1) return;

        //første posisjon i array
        int minIndex = 0;

        //oppgave a condition
        for(int i = 1; i < a.length; i++){
            if(a[i].compareTo(a[minIndex]) < 0){
                minIndex = i;
            }
        }
        T tempMin = a[0];
        a[0] = a[minIndex];
        a[minIndex] = tempMin;



        for(int i = 1; i < a.length; i += 2){

            if(i == a.length - 1){

                T temp = a[i];
                int j = i - 1;

                while(temp.compareTo(a[j]) < 0){
                    a[j+1] = a[j];
                    j--;
                }
                a[j+1] = temp;
                break;
            }

            //oppgave b condition

            T x = a[i];
            T y = a[i+1];
            T minste, storste;

            //if x <= 0 comparing to y, then x<y
            if(x.compareTo(y)<=0){
                minste = x;
                storste = y;
            } else {
                minste = y;
                storste = x;
            }

            int j = i - 1;

            while(storste.compareTo(a[j]) < 0){
                a[j+2] = a[j];
                j--;
            }
            a[j+2] = storste;

            while(minste.compareTo(a[j]) < 0){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = minste;

        }
    }


}
