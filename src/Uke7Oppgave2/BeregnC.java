package Uke7Oppgave2;

public class BeregnC {

    //c = T / n² (Insertion & Selection)
    //c = T / (n * log2(n))  (Quick & Merge)

    public static double fInsertion(int n) {
        return (double) n * n; //n'2
    }

    public static double fSelection(int n) {
        return (double) n * n; //n'2
    }

    public static double fQuick(int n) {
        return n * (Math.log(n) / Math.log(2)); //n*nlog2 n
    }

    public static double fMerge(int n) {
        return n * (Math.log(n) / Math.log(2)); //n*nlog2 n
    }

    public static void main(String[] args) {

        int[] N = {32000, 64000, 128000};

        //tider(ms)
        double[] insertion = {634, 3387, 10955};
        double[] selection = {559, 2339, 8725};
        double[] quick = {6, 9, 20};
        double[] merge = {12, 13, 25};

        double cInsertion = insertion[0] / fInsertion(N[0]);
        double cSelection = selection[0] / fSelection(N[0]);
        double cQuick = quick[0] / fQuick(N[0]);
        double cMerge = merge[0] / fMerge(N[0]);

        System.out.println("c-verdier:");
        System.out.println("Insertion c = " + cInsertion);
        System.out.println("Selection c = " + cSelection);
        System.out.println("Quick c = " + cQuick);
        System.out.println("Merge c = " + cMerge);
    }
}
