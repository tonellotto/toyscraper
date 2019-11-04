package it.unipi.dii.scraper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JSoupExample {

    public static void main(String[] args) {

        String html = "<html><head><title>Website title</title></head><body><p>Sample paragraph number 1 </p><p>Sample paragraph number 2</p></body></html>";

        Document doc = Jsoup.parse(html);

        System.out.println(doc.title());

        Elements paragraphs = doc.getElementsByTag("p");

        for (Element paragraph : paragraphs) {

            System.out.println(paragraph.text());

        }

    }
}
