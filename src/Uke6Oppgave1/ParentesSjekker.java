package Uke6Oppgave1;

public class ParentesSjekker {

    public static boolean sjekkParenteser(String s) {
        StabelADT<Character> stabel = new TabellStabel<>();

        for (char c : s.toCharArray()) {

            if (erStartParentes(c)) {
                stabel.push(c);

            } else if (erSluttParentes(c)) {
                if (stabel.isEmpty()) {
                    return false;
                }

                char start = stabel.pop();
                if (!erParentesPar(start, c)) {
                    return false;
                }
            }

        }

        return stabel.isEmpty();
    }

    private static boolean erStartParentes(char c) {
        return c == '(' || c == '{' || c == '[';
    }

    private static boolean erSluttParentes(char c) {
        return c == ')' || c == '}' || c == ']';
    }

    private static boolean erParentesPar(char start, char slutt) {
        return (start == '(' && slutt == ')')
                || (start == '{' && slutt == '}')
                || (start == '[' && slutt == ']');
    }
}




