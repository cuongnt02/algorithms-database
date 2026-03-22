cmake_minimum_required(VERSION 4.1)
project(adm C)

set(CMAKE_C_STANDARD 11)

add_executable(adm main.c
        string/string-patterns.c
        sort/insertion-sort.c
        matrix_multiplication/matrix-multiplication.c
        linked_list/linked-list.c)
