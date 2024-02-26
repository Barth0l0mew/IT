package Fileses.ReadFile;

import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {
    public static void main(String[] args) {
        String nameFile = "src/DATA/data.txt";
        StringBuilder sb;
        try(FileReader fr = new FileReader(nameFile)){
            System.out.println("Enconding "+fr.getEncoding());
            sb = new StringBuilder();
            while (fr.ready())
                sb.append((char)fr.read());
            System.out.println(sb);
        }catch (IOException e){
            System.err.println("Eror");
        }
    }
}
