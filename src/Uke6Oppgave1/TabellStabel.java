package Uke6Oppgave1;

import java.util.Arrays;
import java.util.EmptyStackException;

public final class TabellStabel<T> implements StabelADT<T> {

    private T[] stack;
    private int topIndex;

    private static final int DEFAULT_CAPACITY = 10;

    public TabellStabel() {
        this(DEFAULT_CAPACITY); //dersom ikke oppgir størrelse, bruk default, her satt til 10
    }

    @SuppressWarnings("unchecked")
    public TabellStabel(int initialCapacity) {
        stack = (T[]) new Object[initialCapacity]; //lager rekken
        topIndex = -1;                             //setter topIndex til -1, altså tom stabel
    }

    @Override
    public void push(T newEntry) {
        ensureCapacity(); //sjekker om rekken er full, topIndex er satt til -1
        stack[topIndex + 1] = newEntry; //her legges første entry til plass 0, siden default er -1
        topIndex++; //øker topIndex. dvs om vi har 2 entries, blir topIndex 1, og neste entry blir lagt til i plass 2 i rekken
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack[topIndex]; //returnerer topIndex, dvs det som sist ble lagt til i listen. Dersom isEmpty, feilmelding
    }

    @Override
    public T pop() { //skal lese hva som ligger på topp, fjernet det og flytte toppen ned ett hakk
        if (isEmpty()) {
            throw new EmptyStackException(); //feilmelding hvis tom
        }
        T top = stack[topIndex]; //her lagres øvestre element
        stack[topIndex] = null; //her fjernes øverste element
        topIndex--; //minsker teller til riktig antall
        return top; //returnerer midlertidlig lagret element (elementet som ligger på toppen)
    }

    @Override
    public boolean isEmpty() {
        return topIndex < 0; //er topIndex mindre enn null? dvs, er det noe som er lagret i rekken?
    }

    @Override
    public void clear() {
        while (topIndex > -1) { //mens TopIndex ikke er tom
            stack[topIndex] = null; //fjern alle lagrede elementer
            topIndex--; //misker antall så lenge topIndex ikke er tom
        }
    }

    private void ensureCapacity() {
        if (topIndex >= stack.length - 1) { //sjekker om rekken er full
            stack = Arrays.copyOf(stack, 2 * stack.length); //dersomk rekken er full, doble antall ledige plasser
        }
    }
}
