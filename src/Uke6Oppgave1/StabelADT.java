package Uke6Oppgave1;


public interface StabelADT<T> {
    /**
     * interface, forteller hva en stabel kan gjøre, "regelbok"
     * her er Uke6Oppgave1.StabelADT "navnet på kontrakten"
     * <T> generisk type, stabelen kan lagre alle verdier
    */
    public void push(T newEntry);
    /**
     *  metode for å legge til et element på toppen av stabelen
     *  returnerer ingenting
    */
    public T pop();

    /**
     * metode som fjerner og returnerer elementet som ligger øverst i stabelen
     * dersom stavelen er tom, throw new EmptyStackException
     */

    public T peek();

    /**
     * metode som ser på første element, fjerner det ikke
     * returnerer T
     */
    public boolean isEmpty();

    /**
     * metode som sjekker om stabelen er tom
     * returnerer true/false
     */
    public void clear();

    /**
     * metode som tømmer hele stabelen
     * returnerer ingenting
     */
}