package Fileses.binWriterFile;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriterBinFile {
    public static void main(String[] args) {
        String fileName ="src/DATA/databin.bin";
        try (
                FileOutputStream fos = new FileOutputStream(fileName,false);
        DataOutputStream dos = new DataOutputStream(fos)) {
            dos.writeUTF("Hello world");
            dos.writeDouble(3.14);
            dos.writeChar(95);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
