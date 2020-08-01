import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class CrawlSongExample {
    public static void main(String[] args) {
        try {
            // Code here
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    URL url;

    {
        try {
            url = new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
    // open the stream and put it into BufferedReader
    Scanner scanner;

    {
        try {
            scanner = new Scanner(new InputStreamReader(url.openStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
     scanner.useDelimiter("\\Z");
     String content = scanner.next();
// close scanner
     scanner.close();
    // remove all new line
    content = content.replaceAll("\\n+", "");
}
