//
// Created by cuongnt02 on 3/21/2026.
//

#include <stdbool.h>
#include <stddef.h>
#include <stdlib.h>

typedef struct linked_list {
    int item;
    struct linked_list *next;
} linked_list;

linked_list *init() {
    return (NULL);
}

bool empty_list(linked_list *l) {
    if (l == NULL) {
        return (true);
    }
    return (false);
}

linked_list* search_list(linked_list* l, int x) {
    if (l == NULL) return NULL;
    if (l->item == x) return l;
    return search_list(l->next, x);
}

void insert_list(linked_list **l, int x) {
    linked_list *p = malloc(sizeof(linked_list));
    p->item = x;
    p->next = *l;
    *l = p;
}

linked_list* item_ahread(linked_list *l, linked_list *x) {
    if ((l == NULL) || (l->next == NULL)) return NULL;
    if (l->next == x) return l;
    return item_ahread(l->next, x);
}

void delete_list(linked_list **l, linked_list **x) {
    linked_list *pred = item_ahread(*l, *x);
    linked_list *p = *l;

    if (pred == NULL) {
        *l = p->next;
    } else {
        pred->next = (*x)->next;
    }
    free(*x);
}
