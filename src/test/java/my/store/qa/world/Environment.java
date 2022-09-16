package my.store.qa.world;

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

    public static MyStoreConfiguration getMyStoreConfiguration() {

        try {

            Properties properties = getProperties("/environments/MyStoreConfiguration.properties");
            return new MyStoreConfiguration(properties);

        } catch (Exception e) {
            throw new RuntimeException("Unable to get driver configuration. " + e);
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
