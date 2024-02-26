package Fileses.IniFile;

import org.ini4j.Wini;

import java.io.File;
import java.io.IOException;

public class ReadIniFile {
    public static void main(String[] args) {
        String fileName = "src/DATA/config.ini";
        File file = new File(fileName);
        try {
            file.createNewFile();
            Wini ini = new Wini (file);
            String str = ini.get("Options", "name");
            System.out.println(str);
            double num = Double.parseDouble(ini.get("Options","value"));
            System.out.println(num);
            ini.store();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
