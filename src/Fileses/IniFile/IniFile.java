package Fileses.IniFile;

import org.checkerframework.checker.nullness.Opt;
import org.ini4j.Wini;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class IniFile {
    public static void main(String[] args) {
        String fileName = "src/DATA/config.ini";
        File file = new File(fileName);
        try {
            file.createNewFile();
            Wini ini = new Wini (file);
            ini.put("Options","name","Vasya");
            ini.put("Options","value",2.1);
            ini.put("Options","array", Arrays.toString(new int[]{1, 2, 3}));
            ini.store();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
