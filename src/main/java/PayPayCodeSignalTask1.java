import java.util.Arrays;
import java.util.List;

public class PayPayCodeSignalTask1 {
    private static final char CHAR_A = 'a';
    private static final char CHAR_Z = 'z';

    int solution(String beginWord, String endWord, String[] wordList) {
        List<String> allowedWords = Arrays.asList(wordList);

        boolean endWordMissing = !allowedWords.contains(endWord);
        if (endWordMissing) {
            // end word not found so sequence must be zero
            return 0;
        }

        var allowedWordIndex = 0;
        var currentWord = beginWord;
        var sequenceLength = 0;
        var foundEndWordInSequence = false;

        while (allowedWordIndex < allowedWords.size()) {
            var nextAllowedWord = allowedWords.get(allowedWordIndex);

            boolean skipCurrentWord = currentWord.equals(nextAllowedWord);
            if (skipCurrentWord) {
                ++allowedWordIndex;
                continue;
            }

            var nextWordFoundInSequence = isNextWordFoundInSequence(currentWord, nextAllowedWord);
            if (nextWordFoundInSequence) {
                ++sequenceLength;

                var endWordIsFoundInSequence = nextAllowedWord.equals(endWord);
                if (endWordIsFoundInSequence) {
                    foundEndWordInSequence = true;
                    break;
                } else {
                    currentWord = nextAllowedWord;
                }
            }
            ++allowedWordIndex;
        }

        var noEndWordInSequence = !foundEndWordInSequence;
        if (noEndWordInSequence) {
            sequenceLength = 0;
        }

        return sequenceLength;
    }

    boolean isNextWordFoundInSequence(String currentWord, String nextWord) {
        char[] currentChars = currentWord.toCharArray();

        for (int charIndex = 0; charIndex < currentChars.length; charIndex++) {
            for (char testChar = CHAR_A; testChar < CHAR_Z; testChar++) {
                char[] clonedChars = currentChars.clone();

                String testString = getStringWithTestChar(charIndex, testChar, clonedChars);
                if (testString.equals(nextWord)) {
                    return true;
                }
            }
        }

        return false;
    }

    private String getStringWithTestChar(int charIndex, char testChar, char[] wordChars) {
        wordChars[charIndex] = testChar;
        return String.valueOf(wordChars);
    }
}
