package Uke6Oppgave1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ParentesSjekkerTest {

    @Test
    void korrekt() {
        assertTrue(ParentesSjekker.sjekkParenteser("{ [ ( ) ] }"));
    }

    @Test
    void manglerSluttparentes() {
        assertFalse(ParentesSjekker.sjekkParenteser("{ [ ( ) }"));
    }

    @Test
    void manglerStartparentes() {
        assertFalse(ParentesSjekker.sjekkParenteser("[ ( ) ] }"));
    }

    @Test
    void sluttparentesKommerForTidlig() {
        assertFalse(ParentesSjekker.sjekkParenteser("{ [ ( ] ) }"));
    }

    @Test
    void javaprogram_korrekt() {
        String javaprogram = """
                class HelloWorld {
                 public static void main(String[] args) {
                  System.out.println("Hello World!");
                 }
                }
                """;
        assertTrue(ParentesSjekker.sjekkParenteser(javaprogram));
    }
}
