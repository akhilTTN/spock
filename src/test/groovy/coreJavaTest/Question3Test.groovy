package coreJavaTest

import coreJavaTesting.Question3
import spock.lang.Specification
import spock.lang.Unroll


class Question3Test extends Specification {
    Question3 question3;
    // int expectedResult;
    Character a;

    void setup() {
        question3 = new Question3();

    }

    @Unroll
    def "happyCounterTest"() {

        expect:
        Question3.counter(a, str) == expectedResult;

        where:
        a   | str      || expectedResult
        "a" | "akhil"  || 1
        "s" | "shyams" || 2
        "s" | "ssssss" || 6

    }

    @Unroll
    def "sadCounterTest"() {
        expect:
        Question3.counter(a, str) == expectedResult;

        where:
        a    | str      || expectedResult
        "b"  | "akhil"  || 0
        "s"  | ""       || 0
        "\0" | "ssdsds" || 0
        "d"  | "zzzzzz" || 0
    }
}
