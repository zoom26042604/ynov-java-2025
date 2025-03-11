package fr.ynov.java.medium;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadFile {

    public static void main(String[] args) {
        String folderPath = "./src/fr/ynov/java/medium/ok";
        createFolderWithFiles(folderPath);
        readFilesInFolder(folderPath);
    }

    public static void createFolderWithFiles(String folderPath) {
        File folder = new File(folderPath);
        if (!folder.exists()) {
            folder.mkdir();
        }

        for (int i = 1; i <= 4; i++) {
            try (FileWriter writer = new FileWriter(folderPath + "/" + i + ".txt")) {
                writer.write("This is the content of file " + i + ".txt\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void readFilesInFolder(String folderPath) {
        try (Stream<Path> paths = Files.walk(Paths.get(folderPath))) {
            paths.filter(Files::isRegularFile).forEach(path -> {
                try {
                    System.out.println("Reading file: " + path.getFileName());
                    Files.lines(path).forEach(System.out::println);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}