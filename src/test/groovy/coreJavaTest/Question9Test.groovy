package coreJavaTest

import coreJavaTesting.Question9
import spock.lang.IgnoreRest
import spock.lang.Specification
import spock.lang.Unroll


class Question9Test extends Specification {

    Question9 question9;

    void setup() {
        question9 = new Question9();
    }

    @Unroll
    void happyTest() {
        expect:
        Question9.printer().toString() == expectedResult //as StringBuilder;

        where:
        expectedResult = "Yes, in fact my,\n" +
                "as such the\n" +
                "which is how they";

    }
}
