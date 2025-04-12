import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("src\\study.properties");
            Properties p = new Properties();
                p.load(fis);
                String id =p.getProperty("Sid");
            System.out.println(id);
            System.out.println(p.getProperty("name"));
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
