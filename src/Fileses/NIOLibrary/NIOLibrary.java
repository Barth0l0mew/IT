package Fileses.NIOLibrary;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.stream.Stream;

public class NIOLibrary {
    public static void main(String[] args) {
//        for (int i=0; i<3;i++) {
//            createDir("folder"+Integer.toString(i));
//            for (int j = 0; j < 3; j++){
//                createFile("folder"+Integer.toString(i)+"/file"+Integer.toString(j));
//            }
//        }
        //удалени в папках
//        for (int i=0;i<3;i++) {
//            Path path = Paths.get("src/DATA/" + "folder" + Integer.toString(i));
//            try {
//                Stream<Path> walk = Files.walk(path);
//                walk.sorted(Comparator.naturalOrder())
//                        .map(Path::toFile)
//                        .peek(System.out::println)
//                        .forEach(File::delete);
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
        //удаления каталогов
        Path path = Paths.get("src/DATA/folder0");
        try {
            Files.delete(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    static void createDir (String name){
        Path path = Paths.get("src/DATA/"+name);
        try {
            Files.createDirectory(path);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    static void createFile (String fileName){
        Path path = Paths.get("src/DATA/"+fileName);
        try {
            Files.createFile(path);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
