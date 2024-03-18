package Parsing.Basic;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.w3c.dom.ls.LSOutput;

import java.io.IOException;

import static org.jsoup.Jsoup.connect;
/*
//*[@id="customers"]/tbody/tr[7]
 */

public class TableParser {
    private static Document document;
    private static final String url = "https://www.w3schools.com/html/html_tables.asp";
    public static void main(String[] args) {
        try {
            document = Jsoup.connect(url).get();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        ////*[@id="dialogv6411ef5258561_fio"]

        //Element table = document.getElementById("customers");
        Elements headers = document.select("#customers>tbody>tr>th");
        //System.out.println(headers);
        int i=0;
        for (Element el:headers){

            System.out.println(el.html()+"\t");
            Elements cells =
                    document.select
                            (String.format("#customers>tbody>tr>td:eq(%d)",i++));
            for (Element cell:cells){
                System.out.println("\t"+cell.html());
            }
        }
        //System.out.println(table);
        //System.out.println(document);
    }

}
