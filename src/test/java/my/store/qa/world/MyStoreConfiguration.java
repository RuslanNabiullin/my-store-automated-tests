package my.store.qa.world;

import java.util.Properties;

public class MyStoreConfiguration {

    private final String myStorePath;

    private final String signInPagePath;

    public MyStoreConfiguration(Properties properties) {

        this.myStorePath = properties.getProperty("my.store.url");

        this.signInPagePath = properties.getProperty("my.store.url") + "?" + properties.getProperty("my.store.sign.in.page.url");

    }

    public String getMyStorePath() {

        return myStorePath;
    }

    public String getSignInPagePath() {

        return signInPagePath;
    }

}
