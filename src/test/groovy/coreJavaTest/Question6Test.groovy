package coreJavaTest

import coreJavaTesting.Question6
import spock.lang.Specification
import spock.lang.Unroll

class Question6Test extends Specification {

    Question6 question6;
    int[] arr;

    void setup() {
        question6 = new Question6();
    }

    @Unroll
    void uniqueIntTest() {
        expect:
        question6.findUniqueNumber(arr) == expectedResult;

        where:
        arr                               || expectedResult
        [1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6] || 4
        [1, 1, 1, 1]                      || 0
        [1, 1, 1]                         || 1
    }
}
