package my.store.qa.world.MyStoreCinfiguration;

import java.util.Properties;

public class MyStoreTexts {

    private final String signInInvalidEmail;

    private final String signInEmailExists;

    public MyStoreTexts(Properties properties) {

        this.signInInvalidEmail = properties.getProperty("my.store.sign.in.page.invalid.email");

        this.signInEmailExists = properties.getProperty("my.store.sign.in.page.existed.email");
    }

    public String getSignInInvalidEmail() {

        return signInInvalidEmail;
    }

    public String getSignInEmailExists() {

        return signInEmailExists;
    }
}
