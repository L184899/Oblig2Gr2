package Uke7Oppgave2;

public class Sortering {

    //Insertion
    public static <T extends Comparable<T>> void insertionSort(T[] a) {

        for(int i = 1; i < a.length; i++){

            T temp = a[i];
            int j = i - 1;
            while(j >= 0 && a[j].compareTo(temp) > 0){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = temp;
        }

    }

    //Selection
    public static <T extends Comparable<T>> void selectionSort(T[] a) {

        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j].compareTo(a[min]) < 0) {
                    min = j;
                }
            }
            T temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
    }

    //Quick
    public static <T extends Comparable<? super T>> void quickSort(T[] a) {

        quickSort(a, 0, a.length-1);
    }
    private static <T extends Comparable<? super T>> void quickSort(T[] a, int left, int right) {

        if(left >= right) return;

        int p = partition(a,left,right);
        quickSort(a,left,p-1);
        quickSort(a,p+1,right);
    }
    private static <T extends Comparable<? super T>> int partition(T[] a, int left, int right) {

        T pivot = a[right];
        int i = left;

        for(int j = left; j < right; j++){
            if(a[j].compareTo(pivot) <= 0){

                T temp = a[i];
                a[i] = a[j];
                a[j] = temp;

                i++;
            }
        }

        T temp = a[i];
        a[i] = a[right];
        a[right] = temp;

        return i;
    }

    //Merge
    public static <T extends Comparable<T>> void mergeSort(T[] a) {

        if(a.length<=1)
            return;

        int mid = a.length/2;

        T[] left = java.util.Arrays.copyOfRange(a, 0, mid);
        T[] right = java.util.Arrays.copyOfRange(a, mid, a.length);

        mergeSort(left);
        mergeSort(right);

        merge(a,left,right);

    }

    public static <T extends Comparable<T>> void merge(T[] a, T[] left, T[] right) {

        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {

            if(left[i].compareTo(right[j]) <= 0) {
                a[k++] = left[i++];
            } else {
                a[k++] = right[j++];
            }
        }
        while (i < left.length) {
            a[k++] = left[i++];
        }
        while (j < right.length) {
            a[k++] = right[j++];
        }
    }
}
