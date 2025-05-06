package Ex4;

import java.io.*;

public class TxtFileReader {
    public static void readFile(String path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null)
                System.out.println(line);
        } catch (IOException e) {
            System.out.println("Error reading the file.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        readFile("output.txt");
    }
}