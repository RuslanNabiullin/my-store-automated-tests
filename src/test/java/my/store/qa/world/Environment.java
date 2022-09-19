package my.store.qa.world;

import my.store.qa.world.MyStoreCinfiguration.MyStoreTexts;
import my.store.qa.world.MyStoreCinfiguration.MyStoreUrls;

import java.io.InputStream;
import java.util.Properties;

public class Environment {

    public static DriverConfiguration getDriverConfiguration() {

        try {

            Properties properties = getProperties("/environments/DriverConfiguration.properties");
            return new DriverConfiguration(properties);

        } catch (Exception e) {
            throw new RuntimeException("Unable to get driver configuration. " + e);
        }
    }

    public static MyStoreUrls getMyStoreUrls() {

        try {

            Properties properties = getProperties("/environments/MyStoreConfiguration/MyStoreUrls.properties");
            return new MyStoreUrls(properties);

        } catch (Exception e) {
            throw new RuntimeException("Unable to get My store urls configuration. " + e);
        }
    }

    public static MyStoreTexts getMyStoreTexts() {

        try {

            Properties properties = getProperties("/environments/MyStoreConfiguration/MyStoreTexts.properties");
            return new MyStoreTexts(properties);

        } catch (Exception e) {
            throw new RuntimeException("Unable to get My store texts configuration. " + e);
        }
    }

    private static Properties getProperties(String path) {

        try {

            InputStream inputStream = Environment.class.getResourceAsStream(path);

            Properties properties = new Properties();
            properties.load(inputStream);

            return properties;

        } catch (Exception e) {
            throw new RuntimeException("Unable to get property configuration. " + e);
        }

    }

}
