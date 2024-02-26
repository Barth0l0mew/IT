package Fileses.ReadFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LineReadTextFile {
    public static void main(String[] args) {
        String nameFile = "src/DATA/data.txt";
        StringBuilder sb;
        try(BufferedReader br = new BufferedReader(new FileReader(nameFile))){
           // System.out.println("Enconding "+fr.getEncoding());
            sb = new StringBuilder();
            while (br.ready())
                sb.append(br.readLine()+System.lineSeparator());
            System.out.println(sb);
        }catch (IOException e){
            System.err.println("Eror");
        }

    }
}
