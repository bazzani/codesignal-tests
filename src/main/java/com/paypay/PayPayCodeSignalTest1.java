package com.paypay;

public class PayPayCodeSignalTest1 {
    public static void main(String[] args) {

    }
}

// Consider a rectangular h × w board with all cells initially white. You are to process several queries of the following types:
//
//"x a b" - color the white cell (a, b) (0-based coordinates, the first one is a row index, and the second one is a column index) black;
//"> a b" - find the leftmost white cell to the right of the white cell (a, b);
//"< a b" - find the rightmost white cell to the left of the white cell (a, b);
//"v a b" - the same, but the search should be done downwards;
//"^ a b" - the same, but the search should be done upwards;
//For each query, except the ones of the first type, find the answer.
//
//Example
//
//For h = 3, w = 5, and
//queries = ["v 1 2", "x 2 2", "v 1 2", "> 2 1", "x 2 3", "> 2 1", "< 2 0"],
//the output should be
//solution(h, w, queries) = [[2, 2], [-1, -1], [2, 3], [2, 4], [-1, -1]].
//
//Check out the image above to see the state of the board after each query of the first type:
//
//
//Input/Output
//
//[execution time limit] 3 seconds (java)
//
//[memory limit] 1 GB
//
//[input] integer h
//
//A positive integer.
//
//Guaranteed constraints:
//1 ≤ h ≤ 500.
//
//[input] integer w
//
//A positive integer.
//
//Guaranteed constraints:
//1 ≤ w ≤ 500.
//
//[input] array.string queries
//
//Queries in the above-described format.
//
//Guaranteed constraints:
//5 ≤ queries.length ≤ 104.
//
//[output] array.array.integer
//
//For each query except the ones of the first type, store the answer's coordinates in the array. If the desired cell doesn't exist, store [-1, -1] instead. The answers should be stored in the same order as the queries.
