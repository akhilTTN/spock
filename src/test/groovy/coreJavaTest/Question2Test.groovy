package coreJavaTest

import coreJavaTesting.Question2
import spock.lang.Specification
import spock.lang.Unroll

/**
 * Created by akhil on 21/3/17.
 */
class Question2Test extends Specification {
    Question2 q;

    void setup() {
        q = new Question2();
    }

    @Unroll
    void testFunctionMerge() {
        expect:
        q.msort(string_arr as String[], 0 as int, end as int) == result as String[]

        where:
        string_arr                                         | end || result
        ["z", "a", "hi", "string", "this", "is"]           | 5   || ["a", "hi", "is", "string", "this", "z"]
        ["hello", "this", "is", "something", "to", "test"] | 5   || ["hello", "is", "something", "test", "this", "to"]
        [""]                                               | 0   || [""]
        ["akhil"]                                          | 1   || ["akhil"]
    }
}
