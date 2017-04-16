package coreJavaTest

import coreJavaTesting.Question8
import spock.lang.Specification


class Queston8Test extends Specification {
    Question8 question8

    void setup() {
        question8 = new Question8();
    }

    void printerTest() {
        expect:
        question8.subStrRemover(str).toString() == expectedResult;

        where:
        str          || expectedResult //as StringBuilder
        "akhilsingh" || "hgnia"
        "akhil"      || "lihka"
        ""           || ""
    }

}
