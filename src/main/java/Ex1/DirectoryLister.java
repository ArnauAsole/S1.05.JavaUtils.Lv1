package Ex1;

import java.io.File;
import java.util.Arrays;

public class DirectoryLister {
    public static void listDirectoryAlphabetically(String path) {
        File folder = new File(path);
        if (folder.exists() && folder.isDirectory()) {
            File[] files = folder.listFiles();
            if (files != null) {
                Arrays.sort(files);
                for (File file : files) {
                    System.out.println(file.getName());
                }
            }
        } else {
            System.out.println("Invalid directory.");
        }
    }

    public static void main(String[] args) {
        listDirectoryAlphabetically("path/to/your/directory");
    }
}