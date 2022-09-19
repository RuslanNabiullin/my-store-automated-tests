package my.store.qa.world.MyStoreCinfiguration;

import java.util.Properties;

public class MyStoreUrls {

    private final String myStorePath;

    private final String signInPagePath;

    public MyStoreUrls(Properties properties) {

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
