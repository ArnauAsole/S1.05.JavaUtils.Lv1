package Ex4;

import java.io.*;

public class TxtFileReader {

    // Mètode per llegir i mostrar el contingut d’un fitxer TXT
    public static void readFile(String path) {
        File file = new File(path);

        if (!file.exists() || !file.isFile()) {
            System.out.println("El fitxer no existeix o no és vàlid.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error llegint el fitxer: " + e.getMessage());
        }
    }

    // Mètode main per executar el programa
    public static void main(String[] args) {
        // Ruta del fitxer a llegir (pots canviar-ho per un fitxer real)
        String filePath = "prova.txt";

        readFile(filePath);
    }
}
