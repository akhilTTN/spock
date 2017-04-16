import spock.lang.IgnoreRest
import spock.lang.Specification

import java.nio.file.FileAlreadyExistsException


class Tester2 extends Specification {

    Question2 question2;

    def setup() {
        question2 = new Question2();

    }

    def "fileCopySadTest"() {

        when:
        question2.copyFile(System.getProperty("user.dir") + "/src/test2.txt",
                System.getProperty("user.dir") + "/src/copy.txt");
        then:
        thrown(FileNotFoundException);
    }

    def "fileAlreadyCopyHappyTest"() {

        when:
        question2.copyFile(System.getProperty("user.dir") + "/src/test.txt",
                System.getProperty("user.dir") + "/src/copy.txt");
        then:
        thrown(FileAlreadyExistsException);
    }

}
