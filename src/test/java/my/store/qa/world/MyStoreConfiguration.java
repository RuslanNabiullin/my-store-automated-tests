package my.store.qa.world;

import java.util.Properties;

public class MyStoreConfiguration {

    private final String myStorePath;

    public MyStoreConfiguration(Properties properties) {

        this.myStorePath = properties.getProperty("my.store.url");

    }

    public String getMyStorePath() {

        return myStorePath;
    }

}
