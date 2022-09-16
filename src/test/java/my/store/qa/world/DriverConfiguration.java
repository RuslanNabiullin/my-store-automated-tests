package my.store.qa.world;

import java.util.Properties;

public class DriverConfiguration {

    private final String chromeDriverPath;

    public DriverConfiguration(Properties properties) {

        this.chromeDriverPath = properties.getProperty("chrome.driver.path");

    }

    public String getChromeDriverPath() {

        return chromeDriverPath;
    }

}
