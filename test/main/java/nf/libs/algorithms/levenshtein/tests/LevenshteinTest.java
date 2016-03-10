package nf.libs.algorithms.levenshtein.tests;

import static org.junit.Assert.assertEquals;

import nf.libs.algorithms.levenshtein.Levenshtein;
import org.junit.Test;

public class LevenshteinTest {

    @Test
    public void sameStringDistance() {
        int distance = Levenshtein.distance("toto", "toto");
        assertEquals(0, distance);
    }

    @Test
    public void shortStringDistance() {
        int distance = Levenshtein.distance("toto", "tota");
        assertEquals(1, distance);
    }

    @Test
    public void shortStringPlusOneCharDistance() {
        int distance = Levenshtein.distance("toto", "toto1");
        assertEquals(1, distance);
    }

    @Test
    public void realString() {
        int distance = Levenshtein.distance("toto", "toto1");
        assertEquals(1, distance);
    }

    @Test
    public void insertionString() {
        int distance = Levenshtein.distance("Levenshtein", "Meilenstein");
        assertEquals(4, distance);
    }

    @Test
    public void abcString() {
        int distance = Levenshtein.distance("ABCDEFGHIJKLMNOPQRSTUVWXYZ", "ABCDEFGHIJKL12MNOPQRSTUVWXYZ");
        assertEquals(2, distance);
    }
}
