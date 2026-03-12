#include <stdio.h>
/*
 * Insertion sort
 * Problem: Sorting
 * Input: A sequence of elements with no specific order
 * Output: A sequence of element with defined order
 */
void swap(int* a, int* b);
void insertion_sort(int arr[], int size);

int main(void) {
    int arr[] = {5, 7, 2, 3, 3, 0};
    insertion_sort(arr, 6);
    for (int i = 0; i < 6; i++) {
        printf("%d ", arr[i]);
    }
    return 0;
}

void swap(int* a, int* b) {
    const int temp = *a;
    *a = *b;
    *b = temp;
}

void insertion_sort(int arr[], int size) {
    for (int i = 1; i < size; i++) {
        int j = i;
        while (j > 0 && arr[j - 1] > arr[j]) {
            swap(&arr[j - 1], &arr[j]);
            j--;
        }
    }
}
