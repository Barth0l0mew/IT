package Parsing.Basic;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
/*
набор данных

https://github.com/linanqiu/reddit-dataset
 */
public class FIOParser {
    private static Document document;
    private static final String url = "https://en.wikipedia.org/wiki/List_of_cities_and_towns_in_Belarus";

    public static void main(String[] args) throws IOException {

        try {
            document = Jsoup.connect(url).get();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int index = 0;
        Elements elements = document.select("table>tbody>tr>td>span>span>span>img");
        for (Element el : elements) {

            System.out.println(String.format("https:%s", el.attribute("src").getValue()));
            String imageUrl = String.format("https:%s", el.attribute("src").getValue());
            URL url = new URL(imageUrl);
            InputStream is = url.openStream();
            OutputStream os = new FileOutputStream(String.format("src/Parsing/Basic/images/%d.png", index++));

            byte[] b = new byte[2048];
            int length;

            while ((length =
                    is.read
                            (b)) != -1) {
                os.write(b, 0, length);
            }

            is.close();
            os.close();

        }
    }


}

