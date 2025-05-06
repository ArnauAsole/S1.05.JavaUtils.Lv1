package Ex2;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class DirectoryTreeLister {

    public static void listTree(String path, String indent) {
        File dir = new File(path);
        if (!dir.isDirectory()) return;

        File[] files = dir.listFiles();
        if (files == null) return;

        Arrays.sort(files);

        for (File file : files) {
            String type = file.isDirectory() ? "(D)" : "(F)";
            String lastModified = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(file.lastModified()));
            System.out.println(indent + type + " " + file.getName() + " - " + lastModified);

            if (file.isDirectory()) {
                listTree(file.getAbsolutePath(), indent + "  ");
            }
        }
    }

    public static void main(String[] args) {
        listTree("path/to/your/directory", "");
    }
}