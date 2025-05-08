package Ex1;

import java.io.File;
import java.util.Arrays;

public class DirectoryLister {
    public static void main(String[] args) {
        // Check if a directory path was passed as an argument
        if (args.length == 0) {
            System.out.println("⚠️ Please provide a directory path as an argument.");
            return;
        }

        String path = args[0];
        System.out.println("📁 Checking directory: " + path);

        File dir = new File(path);

        // Validate if the path exists and is a directory
        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("❌ Invalid directory.");
            return;
        }

        // List and sort files
        String[] files = dir.list();
        if (files == null || files.length == 0) {
            System.out.println("📂 The directory is empty.");
            return;
        }

        Arrays.sort(files); // Sort alphabetically

        System.out.println("📄 Directory contents (sorted):");
        for (String file : files) {
            System.out.println(" - " + file);
        }
    }
}