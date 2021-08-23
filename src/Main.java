import org.apache.lucene.queryParser.ParseException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        LuceneTester tester;
        try {
            tester = new LuceneTester();
            //tester.createIndex();
            tester.search("Monetization methods");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
