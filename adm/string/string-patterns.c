/*
 * String patterns matching
 * Problem: Substring pattern matching
 * Input: a string t and a pattern string p
 * Output: is p a substring of t, and where is p
 */

#include <stdio.h>
#include <string.h>

int findPatterns(const char* p, const char* t) {
    const unsigned int plen = strlen(p);
    const unsigned int tlen = strlen(t);

    for (int i = 0; i <= (tlen - plen); i++) {
        int j = 0;
        while ((j < plen && t[i + j] == p[j])) {
            j++;
        }
        if (j == plen) {
            return i;
        }
    }

    return (-1);
}


int main(void) {
    const char* t = "The lazy dog jump over the quick brown fox";
    const char* p1 = "quick";
    const char* p2 = "the";
    const char* p3 = "canada";
    printf("p1 matches at: %d (character %c)\n", findPatterns(p1, t), t[findPatterns(p1, t)]);
    printf("p2 matches at: %d (character %c)\n", findPatterns(p2, t), t[findPatterns(p2, t)]);
    printf("p3 matches at: %d (character %c)\n", findPatterns(p3, t), t[findPatterns(p3, t)]);
    return 0;
}
