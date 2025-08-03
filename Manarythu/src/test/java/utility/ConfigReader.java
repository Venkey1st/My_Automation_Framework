package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	private static Properties prop;

    static {
        try {
            FileInputStream fis = new FileInputStream("config/config.properties");
            prop = new Properties();
            prop.load(fis);
        } catch (IOException e) {
            System.out.println("Unable to load config.properties: " + e.getMessage());
        }
    }

    public static String getProperty(String key) {
        return prop.getProperty(key);
    }
}
