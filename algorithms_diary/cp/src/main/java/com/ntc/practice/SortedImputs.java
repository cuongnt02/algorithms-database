package com.ntc.practice;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class SortedImputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputs = sc.nextLine();
        Set<Integer> numbers = Arrays.stream(inputs.trim().split("\\s+")).map(Integer::parseInt).sorted().collect(Collectors.toSet());
        System.out.println(numbers);
    }
}
