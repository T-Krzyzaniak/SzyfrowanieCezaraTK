import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

import static java.nio.file.Files.exists;


public class Pliki {
    private static String userHome = System.getProperty("user.home");
    private static Path userDocuments = Paths.get(userHome,"Documents");
    private static Path userInstal = Paths.get(userDocuments.toString(),"Vault");
    private static Path passwordFile = Paths.get(userInstal.toString(), "EncryptedPassword.txt");

    public void checkDirectory() {
        if (!exists(userInstal)) {
            try {
                Files.createDirectory(userInstal);
                System.out.println("Directory created successfully at: " + userInstal);
            } catch (IOException e) {
                System.err.println("Failed to create directory: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }
    public void checkFile() {
        checkDirectory();
        if (!exists(passwordFile)) {
            createNewFile();
        }
    }

    private void createNewFile() {
        try {
            Files.createFile(passwordFile);
        } catch (IOException e) {
            System.err.println("Could not create file: " + e.getMessage());
        }
    }

    public void writeToFile(String tresc){
        try {
            Files.writeString(passwordFile, tresc, StandardOpenOption.APPEND);
        } catch (IOException e){
            System.err.println("Error writting to a file" + e.getMessage());
        }
    }
    public void readFile() {
        OdszyfrowanieK decrypt = new OdszyfrowanieK();
        try {
            List<String> allLines = Files.readAllLines(passwordFile);
            for (String line : allLines) {
                line = decrypt.odszyfruj(line,6);
                System.out.println("Zapis: " + line);
            }
        } catch (IOException e) {
            System.err.println("Could not read file lines: " + e.getMessage());
        }
    }







}
