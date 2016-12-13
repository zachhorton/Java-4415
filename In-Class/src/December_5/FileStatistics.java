package December_5;
import java.nio.file.*;
import java.io.IOException;
import java.nio.file.attribute.*;

/**
 * Created by zachhorton on 12/5/16.
 */
public class FileStatistics {
    public static void main(String[] args) {
        Path file = Paths.get("/Users/zachhorton/Desktop/testText.txt");

        try {
            int count = file.getNameCount();
            System.out.println("Path is: " + file.toString());
            System.out.println("File name is: " + file.getFileName());
            System.out.println("Folder Name is: " + file.getName(count - 2));
            System.out.println("Folder name is: " + file.getName(count - 1));
            BasicFileAttributes attr = Files.readAttributes(file, BasicFileAttributes.class);
            System.out.println("File's size is: " + attr.size());
            FileTime time = attr.creationTime();
            System.out.println("File's creation time is: " + time);
            FileTime modified = attr.lastModifiedTime();
            System.out.println("File's last modified time is: " + modified);

        } catch (IOException ex) {
            System.out.println("IO Exception");
        }
    }
}
