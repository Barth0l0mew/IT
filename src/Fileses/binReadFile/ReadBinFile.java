package Fileses.binReadFile;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class ReadBinFile {
    public static void main(String[] args) {
        String fileName ="src/DATA/databin.bin";
        try (FileInputStream fis = new FileInputStream(fileName);
             DataInputStream dis = new DataInputStream(fis)) {
            System.out.println(dis.readUTF());
            System.out.println(dis.readDouble());
            System.out.println(dis.readChar());
            for (int el : dis.readAllBytes())
                System.out.println((char) el);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
