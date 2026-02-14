package Uke6Oppgave1;

public class StabelMain {

    public static void main(String[] args){

        StabelADT<Integer> stabel = new TabellStabel<>();

        System.out.println("Er stabelen tom? " + stabel.isEmpty()); //forventer true

        stabel.push(9000);
        stabel.push(8000);
        stabel.push(7000);
        stabel.push(6000);

        System.out.println("Er stabelen tom? " + stabel.isEmpty()); //forventer false
        System.out.println("Peek-metode: " + stabel.peek()); //forventer 6000 (topIndex)
        System.out.println("Pop-metode og peek etter pop-metode: " + stabel.pop() + ", " + stabel.peek()); //forventer 6000 også 7000

        System.out.println("Legger så inn 'stabel.clear'");
        stabel.clear();
        System.out.println("Er stabelen tom? " + stabel.isEmpty());
    }
}
