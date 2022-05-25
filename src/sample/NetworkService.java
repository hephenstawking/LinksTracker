package sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class NetworkService {

    public static String getTextFromURL(String spec, String code) throws IOException {
        URL url = new URL(spec);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        String result = "";
        try (BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), code ))) {
            String tmp = "";

            for (;;) {
                tmp = br.readLine();
                if (tmp == null) {
                    break;
                }
                result += tmp+System.lineSeparator();
            }
        }

        return result;
    }
}
