package javaKodutoo2;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.LinkedList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class PostimeesScraper {
    private String url;
    private String html;
    private LinkedList hrefCollection;

    public PostimeesScraper(String url) {
        this.url = url;
    }

    public void makeWebRequest() {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(this.url)).build();
            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
            this.html = response.body();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void extractLinks() {
        Document doc = Jsoup.parse(this.html);
        Elements links = doc.select("a[href]");
        // System.out.println(links);
        for (Element anchor : links) {
            System.out.println(anchor.attr("abs:href"));
        }
    }

    public String getHtml() {
        return this.html;
    }
}