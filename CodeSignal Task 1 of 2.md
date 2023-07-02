5 minutes remaining!
Wrap up your work and submit.
Task 1 of 2
0:01:10
Codewriting

Given two words, beginWord and endWord, and a wordList of approved words, find the length of the shortest transformation
sequence from beginWord to endWord such that:

Only one letter can be changed at a time

Each transformed word must exist in the wordList.

The length of the sequence is defined as the number of words in it, e.g. the length of "cot" -> "hot" -> "hit" is 3, and
the length of "dog" -> "cog" is 2.

Return the length of the shortest transformation sequence, or 0 if no such transformation sequence exists.

Note: beginWord does not count as a transformed word. You can assume that beginWord and endWord are not empty and are
not the same.

---

Example

For beginWord = "hit", endWord = "cog", and wordList = ["hot", "dot", "dog", "lot", "log", "cog"], the output should be
solution(beginWord, endWord, wordList) = 5.

The shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog" with a length of 5.

For beginWord = "a", endWord = "c", and wordList = ["a", "b", "c"], the output should be
solution(beginWord, endWord, wordList) = 2.

It is possible to obtain endWord = "c" from beginWord = "a" without using any additional words in the middle: "a" -> "
c".

---

Input/Output

[execution time limit] 3 seconds (java)

[input] string beginWord

Guaranteed constraints:
1 ≤ beginWord.length ≤ 5.

[input] string endWord

Guaranteed constraints:
endWord.length = beginWord.length.

[input] array.string wordList

An array containing all of the approved words. All words in the array are the same length and contain only lowercase
English letters. You can assume that there are no duplicates in wordList.

Guaranteed constraints:
2 ≤ wordList.length ≤ 600,
wordList[i].length = beginWord.length.

[output] integer

An integer representing the length of the shortest transformation sequence from beginWord to endWord using only words
from wordList as described above.

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


---

Saved
123456789101112131415161718192021222324
int solution(String beginWord, String endWord, String[] wordList) {
int sequenceLength = 0;
List<String> allowedWords = Arrays.asList(wordList);

if(!allowedWords.contains(beginWord) || !allowedWords.contains(endWord)) {
// start word or end work not found so sequence must be zero as it cannot be reached
return 0;
}

if(allowedWords.contains(beginWord)) {
… // 2. increment each
return false;
}
TESTS
CUSTOM TESTS
Tests passed: 3/12.
Test 1
Test 2
Test 3
Test 4
Test 5
Test 6
Test 7
Test 8
Test 9
Test 10
Test 11
Test 12
Test 13
Test 14
Test 15
Test 16
Test 17
Test 18
Test 19
Test 20
Test 21
Test 22
Test 23
MORE
break
