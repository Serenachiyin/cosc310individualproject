import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class Translator{
    /*
    public static void main(String[] args) throws IOException {
        String text = "中文";
        //Translated text: Hallo Welt!
        System.out.println("Translated text: " + translate("", "en", text));
    }
    */
    static String translate(String langFrom, String langTo, String text) throws IOException {
        // INSERT YOU URL HERE
        //https://script.google.com/macros/s/AKfycbzDVNd9YhAkhyZ4ztEiv_9hcpJq5eKD_ftNAWZpk_Y3tp0MBy9a6YDSM4FX1nZ8rUii/exec
        //String urlStr = "https://your.google.script.url" +
        String urlStr = "https://script.google.com/macros/s/AKfycbxySzZC1VAw0LuE0mgzYS_uv7PXzZzFH692fN1Z0mYhHFZemkkJAb6fF7YDJBdHfclD/exec" +
                "?q=" + URLEncoder.encode(text, "UTF-8") +
                "&target=" + langTo +
                "&source=" + langFrom;
        URL url = new URL(urlStr);
        StringBuilder response = new StringBuilder();
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestProperty("User-Agent", "Mozilla/5.0");
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        return response.toString();
    }

    

}