
import spock.lang.Specification;
import spock.lang.Unroll;

class Tester1 extends Specification {

    @Unroll
    void testFindUniqueChars() {

        expect:
        Question1 q = new Question1();
        q.findUniqueChars(str) == expectedResult

        where:

        str     || expectedResult
        "akhil" || 5
        "aaaaa" || 1
        "aqwa"  || 3
    }

}
