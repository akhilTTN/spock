package coreJavaTest;

import coreJavaTesting.Question11;
import spock.lang.Specification
import spock.lang.Unroll;


public class Question11Test extends Specification {

    Question11 question11;
    // Float expectedResult;
    void setup() {
        question11 = new Question11();
    }

    @Unroll
    void addTest() {
        expect:
        Question11.add(a, b) == expectedResult;

        where:
        a   | b   || expectedResult
        1   | 2   || 3
        1.3 | 2.0 || 3.3
        "a" | "b" || "ab"
        5.5 | 6.7 || 12.2
        ""  | ""  || ""
    }

    void add3Test() {
        expect:
        Question11.add(a, b, c) == expectedResult;

        where:
        a   | b   | c    || expectedResult
        "a" | "b" | "ab" || "abab"
        ""  | ""  | ""   || ""
    }

    void mulTest() {
        expect:
        Question11.mul(a, b) == expectedResult as float;

        where:
        a   | b   || expectedResult
        1   | 2   || 2
        1.3 | 2.0 || 2.6
    }

}
