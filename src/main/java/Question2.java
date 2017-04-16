import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;

/*
 * Q1. Write a program to copy and paste a file to other location
 */
public class Question2 {
    public static void main(String[] args) throws FileNotFoundException,FileAlreadyExistsException{
        System.out.println(System.getProperty("user.dir") + "/src/test.txt");
        Question2 question1 = new Question2();
        question1.copyFile(System.getProperty("user.dir") + "/src/test.txt",
                System.getProperty("user.dir") + "/src/copy.txt");
    }

    private boolean copyFile(String path, String newPath) throws FileNotFoundException,FileAlreadyExistsException{
        File file = new File(path);
        File newFile = new File(newPath);
        try {
            Files.copy(file.toPath(), newFile.toPath());
            System.out.println("File copied successfully");
            return true;
        } catch (FileAlreadyExistsException e) {
            System.out.println("copy.txt file already exists, first delete it to create a copy");
            throw new FileAlreadyExistsException(System.getProperty("user.dir") + "/src/copy.txt");
        } catch (IOException e) {
          //  e.printStackTrace();
            throw new FileNotFoundException();
        }
    }
}