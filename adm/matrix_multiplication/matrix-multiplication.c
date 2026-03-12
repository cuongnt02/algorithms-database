/*
 * Problem: Matrix multiplication
 * Input: 2 matrices A(dim XxY) and B(dim YxZ)
 * Output: Matrix C(dim XxZ) where C[i][j] = C[i] dot C[J]
 */
#define MAXV 100
#include <stdio.h>

typedef struct {
    int m[MAXV][MAXV];
    int rows;
    int columns;
} matrix;

void read_matrix(matrix *m);

void print_matrix(matrix *m);

void multiply(matrix *a, matrix *b, matrix *c);


int main(void) {
    matrix a, b, c;
    read_matrix(&a);
    print_matrix(&a);

    read_matrix(&b);
    print_matrix(&b);

    //multiply(&a, &b, &c);
    //print_matrix(&c);
    return 0;
}

void read_matrix(matrix *m) {
    int i, j;
    scanf("%d %d\n", &(m->rows), &(m->columns));
    for (i = 1; i <= m->rows; i++) {
        for (j = 1; j <= m->columns; j++) {
            scanf("%d", &m->m[i][j]);
        }
    }
}

void print_matrix(matrix *m) {
    int i, j;
    for (i = 1; i <= m->rows; i++) {
        for (j = 1; j <= m->columns; j++) {
            printf(" %d", m->m[i][j]);
        }
        printf("\n");
    }
    printf("\n");
}

void multiply(matrix *a, matrix *b, matrix *c) {
}
