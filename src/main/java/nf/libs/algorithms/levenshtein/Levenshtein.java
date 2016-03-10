package nf.libs.algorithms.levenshtein;

import java.lang.Math;

/**
 * An implementation of Levenshtein algorithm.
 *
 * @see <https://fr.wikipedia.org/wiki/Distance_de_Levenshtein>
 */
public class Levenshtein {

    /**
     * Compute the distance.
     *
     * @param s First string.
     * @param t Second string.
     * @return Levenshtein distance.
     */
    static public int distance(char[] s, char[] t) {
        int[] v0, v1; // Arrays.
        int i, j; // Indexes.
        int cost; // Cost.

        // Arrays allocations.
        v0 = new int[t.length + 1];
        v1 = new int[t.length + 1];

        // Initial settings.
        for (i = 0; i <= (v0.length - 1); i++) {
            v0[i] = i;
        }

        // Computing.
        for (i = 0; i <= (s.length - 1); i++) {
            v1[0] = i + 1;
            for (j = 0; j <= (t.length - 1); j++) {
                if (s[i] == t[j]) {
                    cost = 0;
                } else {
                    cost = 1;
                }
                v1[j + 1] = Math.min(Math.min(v1[j] + 1, v0[j + 1] + 1), v0[j] + cost);
            }
            for (j = 0; j <= (v0.length - 1); j++) {
                v0[j] = v1[j];
            }
        }

        return v1[t.length]; // Returns the distance.
    }

    /**
     * Compute the distance.
     *
     * @param s First string.
     * @param t Second string.
     * @return Levenshtein distance.
     */
    static public int distance(String s, String t) {
        return distance(s.toCharArray(), t.toCharArray());
    }
}
