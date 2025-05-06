package Ex3;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class DirectoryTreeToFile {

    public static void writeTreeToFile(File dir, String indent, BufferedWriter writer) throws IOException {
        File[] files = dir.listFiles();
        if (files == null) return;

        Arrays.sort(files);

        for (File file : files) {
            String type = file.isDirectory() ? "(D)" : "(F)";
            String modified = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(file.lastModified()));
            writer.write(indent + type + " " + file.getName() + " - " + modified + "\n");

            if (file.isDirectory()) {
                writeTreeToFile(file, indent + "  ", writer);
            }
        }
    }

    public static void main(String[] args) {
        File startDir = new File("path/to/your/directory");
        File output = new File("output.txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(output))) {
            writeTreeToFile(startDir, "", writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}