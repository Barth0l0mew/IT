package Parsing.Basic;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import javax.print.Doc;

import java.io.File;
import java.io.IOException;

public class ListParser {
    private static Document document =null;
    public static void main(String[] args) {
    File file = new File("src/Parsing/Basic/index.html");
        try {
            document =  Jsoup.parse(file,"UTF-8","");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Elements items = document.select("li");
        System.out.println(items);
        items.stream().forEach(el-> System.out.println(el.text().trim()));
    }
}
