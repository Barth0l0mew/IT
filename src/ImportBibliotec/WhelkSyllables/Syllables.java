package ImportBibliotec.WhelkSyllables;

import io.whelk.hy.phen.Hyphenator;

public class Syllables {
    /*
Разбивка на слоги
<dependency>
    <groupId>io.whelk.hy.phen</groupId>
    <artifactId>whelk-hy-phen-a-tion</artifactId>
    <version>0.1.14</version>
</dependency>
 */

        public static void main(String[] args) {
            var result = Hyphenator.hyphen("computer");
            System.out.println(result);
        }
}
