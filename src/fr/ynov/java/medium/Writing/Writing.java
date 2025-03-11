package fr.ynov.java.medium.Writing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Writing {
    public static void main(String[] args) {
        String inputFilePath = "./src/fr/ynov/java/medium/Writing/ok.txt";
        String outputFilePath = "./src/fr/ynov/java/medium/Writing/okbis.txt";

        copyFileContent(inputFilePath, outputFilePath);
    }

    public static void copyFileContent(String inputFilePath, String outputFilePath) {
        Path inputPath = Paths.get(inputFilePath);
        Path outputPath = Paths.get(outputFilePath);

        try {
            Files.copy(inputPath, outputPath);
            System.out.println("File content copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
