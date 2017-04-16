package coreJavaTest

import coreJavaTesting.Question4
import spock.lang.Specification
import spock.lang.Unroll


class Question4Test extends Specification {
    Question4 question4;

    void setup() {
        question4 = new Question4();
    }

    @Unroll
    void happyTest() {
        expect:
        question4.charPercentCalc(str) == expectedResult;

        where:
        str                               || expectedResult
        "abc123@#AS"                      || [uCase: 20.0, specialCharacters: 20.0, digits: 30.0, lCase: 30.0]
        "dfmsdkfSDLSDSC7482555222@#@##%*" || [uCase: 22.580645161290324, specialCharacters: 22.580645161290324, digits: 32.25806451612903, lCase: 22.580645161290324]
        ""                                || [uCase: 0.0, specialCharacters: 0.0, digits: 0.0, lCase: 0.0]
        "aaaaaa"                          || [uCase: 0.0, specialCharacters: 0.0, digits: 0.0, lCase: 100.0]
        "ZZZZZZ"                          || [uCase: 100.0, specialCharacters: 0.0, digits: 0.0, lCase: 0.0]
        "@#%^\$"                          || [uCase: 0.0, specialCharacters: 100.0, digits: 0.0, lCase: 0.0]
    }
}
