package readingandwriting;

import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFiles {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("file.txt")) {
            int data;
            while  ((data = reader.read()) != -1){
                System.out.println((char) data);
            }
        } catch (IIOException e){
            System.out.println("An I/O error occurred!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
