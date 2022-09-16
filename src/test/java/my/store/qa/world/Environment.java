package my.store.qa.world;

import java.io.InputStream;
import java.util.Properties;

public class Environment {

    public static DriverConfiguration getDriverConfiguration() {

        try {

            InputStream inputStream = Environment.class.getResourceAsStream("/environments/DriverConfiguration.properties");

            Properties properties = new Properties();
            properties.load(inputStream);

            return new DriverConfiguration(properties);

        } catch (Exception e) {
            throw new RuntimeException("Unable to get driver configuration. " + e);
        }
    }

    public static MyStoreConfiguration getMyStoreConfiguration() {

        try {

            InputStream inputStream = Environment.class.getResourceAsStream("/environments/MyStoreConfiguration.properties");

            Properties properties = new Properties();
            properties.load(inputStream);

            return new MyStoreConfiguration(properties);

        } catch (Exception e) {
            throw new RuntimeException("Unable to get driver configuration. " + e);
        }
    }

}
