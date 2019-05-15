package javaKodutoo2;

public final class App {

    public static void main(String[] args) {
        PostimeesScraper scraper = new PostimeesScraper("https://www.postimees.ee/");
        scraper.makeWebRequest();
        scraper.extractLinks();
        // System.out.println(scraper.getHtml());
    }
}
