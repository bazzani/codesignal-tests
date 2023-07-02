import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

class PayPayCodeSignalTask1Test {

    @Test
    void shouldFindSequenceForDefaultWords() {
        PayPayCodeSignalTask1 sut = new PayPayCodeSignalTask1();
        int solution = sut.solution(
                "hit",
                "cog",
                new String[]{"hot", "dot", "dog", "lot", "log", "cog"}
        );

        assertThat(solution, is(5));
    }

    @Test
    void shouldFindSequenceForABC() {
        PayPayCodeSignalTask1 sut = new PayPayCodeSignalTask1();
        int solution = sut.solution(
                "a",
                "c",
                new String[]{"a", "b", "c"}
        );

        assertThat(solution, is(2));
    }

    @Test
    void shouldFindNoSequence() {
        PayPayCodeSignalTask1 sut = new PayPayCodeSignalTask1();
        int solution = sut.solution(
                "hit",
                "cog",
                new String[]{"hot", "dod", "cog"}
        );

        assertThat(solution, is(0));
    }

    @Test
    void shouldFindNoSequenceForMissingEndWord() {
        PayPayCodeSignalTask1 sut = new PayPayCodeSignalTask1();
        int solution = sut.solution(
                "hit",
                "cog",
                new String[]{"hit", "foo"}
        );

        assertThat(solution, is(0));
    }
}
