package com.bevans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlmostIncreasingSequence {
    public static void main(String[] args) {
//        int[] ints = new int[100_000];
        int[] ints = new int[100];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = i + 1;
        }
//        ints[99_999] = 2;
        ints[99] = 2;

        boolean increasing = true == new AlmostIncreasingSequence().solution(ints);

        System.out.println("increasing  = " + increasing);
    }

    boolean solution(int[] sequence) {
        var intList = Arrays.stream(sequence).boxed().toList();
        var increasingSeq = false;

        for (int i = 0; i <= sequence.length - 1; i++) {
            increasingSeq = allInSequence(intList, i);

            if (increasingSeq) {
                return true;
            }
        }

        return increasingSeq;
    }

    boolean allInSequence(List<Integer> intList, int removeIndex) {
        System.out.println("---\n");

        var testList = new ArrayList<>(intList);
        testList.remove(removeIndex);

        System.out.println("testList: " + testList);

//        for (int i = testList.size() - 1; i > 0; i--) {
//            var last = testList.get(i);
//            var prev = testList.get(i - 1);
//
//            System.out.println(last + " <= " + prev);
//            System.out.println();
//
//            if (last <= prev) {
//                System.out.println("           not in sequence");
//                return false;
//            }
//        }

        for (int i = 0; i < testList.size() - 1; i++) {
            var current = testList.get(i);
            var next = testList.get(i + 1);

            System.out.println(current + " >= " + next);
            System.out.println();

            if (current >= next) {
                System.out.println("           not in sequence");
                return false;
            }
        }

        System.out.println("           in sequence");

        return true;
    }


}
