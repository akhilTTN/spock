package coreJavaTest

import coreJavaTesting.Question5
import spock.lang.Specification
import spock.lang.Unroll


class Question5Test extends Specification {
    Question5 question5;
    int[] firstArray, secondArray, expectedResult;

    void setup() {
        question5 = new Question5();
    }

    @Unroll
    void commonElementTest() {
        expect:
        question5.commonElements(firstArray, secondArray) == expectedResult;

        where:
        firstArray         | secondArray || expectedResult
        [1, 2, 3, 4, 5, 3] | [2, 4, 5]   || [2, 4, 5]
        [1, 2]             | [3, 4]      || []
        []                 | [2, 3]      || []
        [1, 2]             | []          || []
    }
}
