package sample;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String spec = "https://rozetka.com.ua";
        LinksFinder lf = new LinksFinder();
        FileService fs = new FileService();

        try {
            String htmlText = NetworkService.getTextFromURL(spec, "UTF-8");
            List<String> urls = lf.extractURL(htmlText);
            fs.saveToFile(urls);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
