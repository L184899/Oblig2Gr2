package Uke7Oppgave2;

import Uke7Oppgave1.InsertionSortA;
import org.junit.jupiter.api.Test;

import static Uke7Oppgave2.Sortering.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class SorteringTest {

    //tester liten tabell (n = 10)

    @Test
    public void testMergeSortering() {
        Integer[] tabell = {6,9,3,4,8,2,1,7,5};
        Integer[] forventet = {1,2,3,4,5,6,7,8,9};

        mergeSort(tabell);

        assertArrayEquals(forventet, tabell);
    }

    @Test
    public void testInsertionSortering() {
        Integer[] tabell = {6,9,3,4,8,2,1,7,5};
        Integer[] forventet = {1,2,3,4,5,6,7,8,9};

        insertionSort(tabell);

        assertArrayEquals(forventet, tabell);
    }

    @Test
    public void testQuickSortering() {
        Integer[] tabell = {6,9,3,4,8,2,1,7,5};
        Integer[] forventet = {1,2,3,4,5,6,7,8,9};

        quickSort(tabell);

        assertArrayEquals(forventet, tabell);
    }

    @Test
    public void testSelectionSortering() {
        Integer[] tabell = {6,9,3,4,8,2,1,7,5};
        Integer[] forventet = {1,2,3,4,5,6,7,8,9};

        selectionSort(tabell);

        assertArrayEquals(forventet, tabell);
    }

    @Test
    public void testSelectionLikeTall() {
        Integer[] tabell = {4,4,4,4,4,4,4,4,4,4};
        Integer[] forventet = {4,4,4,4,4,4,4,4,4,4};

        selectionSort(tabell);

        assertArrayEquals(forventet, tabell);
    }

    @Test
    public void testQuickLikeTall() {
        Integer[] tabell = {4,4,4,4,4,4,4,4,4,4};
        Integer[] forventet = {4,4,4,4,4,4,4,4,4,4};

        quickSort(tabell);

        assertArrayEquals(forventet, tabell);
    }

    @Test
    public void testInsertionLikeTall() {
        Integer[] tabell = {4,4,4,4,4,4,4,4,4,4};
        Integer[] forventet = {4,4,4,4,4,4,4,4,4,4};

        insertionSort(tabell);

        assertArrayEquals(forventet, tabell);
    }

    @Test
    public void testMergeLikeTall() {
        Integer[] tabell = {4,4,4,4,4,4,4,4,4,4};
        Integer[] forventet = {4,4,4,4,4,4,4,4,4,4};

        mergeSort(tabell);

        assertArrayEquals(forventet, tabell);
    }

    @Test
    public void testMergeFerdigSortert() {
        Integer[] tabell = {1,2,3,4,5,6,7,8,9};
        Integer[] forventet = {1,2,3,4,5,6,7,8,9};

        mergeSort(tabell);

        assertArrayEquals(forventet, tabell);
    }

    @Test
    public void testInsertionFerdigSortert() {
        Integer[] tabell = {1,2,3,4,5,6,7,8,9};
        Integer[] forventet = {1,2,3,4,5,6,7,8,9};

        insertionSort(tabell);

        assertArrayEquals(forventet, tabell);
    }

    @Test
    public void testQuickFerdigSortert() {
        Integer[] tabell = {1,2,3,4,5,6,7,8,9};
        Integer[] forventet = {1,2,3,4,5,6,7,8,9};

        quickSort(tabell);

        assertArrayEquals(forventet, tabell);
    }

    @Test
    public void testSelectionFerdigSortert() {
        Integer[] tabell = {1,2,3,4,5,6,7,8,9};
        Integer[] forventet = {1,2,3,4,5,6,7,8,9};

        selectionSort(tabell);

        assertArrayEquals(forventet, tabell);
    }
}
