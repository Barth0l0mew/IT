package ImportBibliotec.GenerationWords;

import com.maximeroussy.invitrode.WordGenerator;

public class Generator {
    /*
Генерация слов, похожих на английские
<dependency>
    <groupId>com.github.maximeroussy</groupId>
    <artifactId>invitrode</artifactId>
    <version>12e5d68</version>
</dependency>
 */
    public static void main(String[] args) {
        WordGenerator generator = new WordGenerator();
        for (int i=0; i<10; i++)
            System.out.println(generator.newWord(6));
    }
}
