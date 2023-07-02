5 minutes remaining!
Wrap up your work and submit.
Task 2 of 2
0:00:52
Codewriting

---

Given an array of integers a, your task is to calculate the digits that occur the most number of times in the array.
Return the array of these digits in ascending order.

---

Example

For a = [25, 2, 3, 57, 38, 41], the output should be solution(a) = [2, 3, 5].

Here are the number of times each digit appears in the array:

0 -> 0
1 -> 1
2 -> 2
3 -> 2
4 -> 1
5 -> 2
6 -> 0
7 -> 1
8 -> 1
The most number of times any number occurs in the array is 2, and the digits which appear 2 times are 2, 3 and 5. So the
answer is [2, 3, 5].

---

Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer a

An array of positive integers.

Guaranteed constraints:
1 ≤ a.length ≤ 103,
1 ≤ a[i] < 100.

[output] array.integer

The array of most frequently occurring digits, sorted in ascending order.

[Java] Syntax Tips

// Prints help message to the console
// Returns a string
//
// Globals declared here will cause a compilation error,
// declare variables inside the function instead!
String helloWorld(String name) {
System.out.println("This prints to the console when you Run Tests");
return "Hello, " + name;
}

12345678910111213141516171819202122232425262728293031323334353637
int[] solution(int[] a) {
Map<String, Integer> digitCounts = new TreeMap<>();

Arrays.stream(a)
.forEach(testInt -> {
String intAsString = Integer.toString(testInt);

    intAsString.chars()
    .forEach(digitChar -> {
      String digitAsString = Character.toString(digitChar);

TESTS
CUSTOM TESTS
MORE
break
