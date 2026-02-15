package Uke7Oppgave1;

//Modifiser koden slik at i stedet for å sette inn ett element om gangen, setter vi inn to. De to
//elementene som skal settes inn, kaller vi minste og største (minste <= største). Så lenge det
//største er mindre enn elementet vi sammenligner med i sortert del, så kan vi flytte elementet
//i sortert del to plasser til høyre. Når vi finner rett plass for største, forsetter vi som vanlig
//med å sette inn minste.

import java.util.Arrays;

public class InsertionSortB {

    public static <T extends Comparable<T>> void sort(T[] a){

        //going through 2 elements each iteration
        for(int i = 1; i < a.length; i +=2){

            //if i = a[0]
            if(i == a.length-1){


                //temp = a[1]
                T temp = a[i]; //temp start from no index
                //j = a[0]
                int j = i - 1;

                //hvis j >= 0 and temp
                while(j >= 0 && temp.compareTo(a[j]) > 0){
                    a[j+1] = a[j]; //shift to the right
                    j--;
                }
                a[j+1] = temp;

                break;
            }

            //calling 2 elements, i and before i,
            //for-loop starts fra index 1, so we called a[0] og a[1]
            T x = a[i-1];
            T y = a[i];
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
            int j = i-2;

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
}
