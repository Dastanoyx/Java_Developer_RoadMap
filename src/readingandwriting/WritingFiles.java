package readingandwriting;

import java.io.FileWriter;
import java.io.IOException;

public class WritingFiles {
    public static void main(String[] args) {
        try(FileWriter write = new FileWriter("output.txt", true)){
            write.write("ooommgg\n");
        } catch (IOException e){
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        }
    }
}
