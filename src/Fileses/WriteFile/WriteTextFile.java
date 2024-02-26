package Fileses.WriteFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteTextFile {
    public static void main(String[] args) {
        String fileName = "src/DATA/data.txt";
        FileWriter fw = null;
        try {
            fw = new FileWriter(fileName,true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        finally {
//            if (fw!=null) {
//                fw.close();
//            }
//        }
        String s ="Hello \n";
        try {
            fw.append(s);
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
