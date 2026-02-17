package Uke7Oppgave1;

//Modifiser koden slik at i stedet for å sette inn ett element om gangen, setter vi inn to. De to
//elementene som skal settes inn, kaller vi minste og største (minste <= største). Så lenge det
//største er mindre enn elementet vi sammenligner med i sortert del, så kan vi flytte elementet
//i sortert del to plasser til høyre. Når vi finner rett plass for største, forsetter vi som vanlig
//med å sette inn minste.

import java.util.Arrays;

public class InsertionSortB {

    //we take one pair, inside of this pair storste og minste,
    public static <T extends Comparable<T>> void insertionSortB(T[] a){

        //going through 2 elements each iteration
        for(int i = 1; i < a.length; i +=2){

            //if i is the same element as the last
            if(i == a.length-1){

                T temp = a[i];
                int j = i - 1;

                //hvis j >= 0 and temp > 0 and a[j] < 0
                while(j >= 0 && temp.compareTo(a[j]) < 0){
                    a[j+1] = a[j]; //shift to the right
                    j--;
                }
                a[j+1] = temp;

                break;
            }

            //calling 2 elements, i and before i,
            //for-loop starts fra index 1, so we called a[0] og a[1]
            T x = a[i];
            T y = a[i+1];
            T minste, storste;

            //hvis a[0] <= 0, a[0] = minste, y - største
            if(x.compareTo(y) <= 0){
                minste = x;
                storste = y;
            } else {
                minste = y;
                storste = x;
            }

            //i oppgave A vi bruker j = i-1 fordi vi gå gjennom 1 element i time
            int j = i - 1;

            while(j >= 0 && storste.compareTo(a[j]) < 0){
                a[j+2] = a[j]; //to elementer flytt til hoyre
                j--;
            }
            a[j+2] = storste;

            while(j >= 0 && minste.compareTo(a[j]) < 0){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = minste;
        }
    }
    public static void main(String[] args) {

        Integer[] taller = {9,7,6,3,8,2,30,1,11};

        System.out.println("Before: " + Arrays.toString(taller));

        insertionSortB(taller);

        System.out.println("After:  " + Arrays.toString(taller));
    }
}
