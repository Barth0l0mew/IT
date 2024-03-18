package Parsing.Basic;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class NestedListParsing {
    private static Document document;
    public static void main(String[] args) {
        File file = new File("src/Parsing/Basic/nestedList.html");
        try {
            document = Jsoup.parse(file,"UTF-8","");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Elements elements = document.select("body>ul>li");
        //System.out.println(elements);
        for (Element el :elements){
            String text = el.text().trim();
            //System.out.println(el.html());
            System.out.println("   "+el.id());
            //System.out.println(text);
            Elements inners = el.select("ul>li");
            for (Element inner : inners){
                System.out.println(inner.text());
            }
        }
        System.out.println();
        Elements newIl2 = document.select("#li2");
        Element element = document.getElementById("li2");
        System.out.println(element.attributes());
        //System.out.println(newIl2);

    }
}
