package my.store.qa.executors;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxExecutor extends BrowserExecutor {

    public FirefoxExecutor(final String executorName) {

        super();
        setDriver(createFirefoxDriver());
        setExecutorName(executorName);

    }

    private WebDriver createFirefoxDriver() {

        WebDriverManager.firefoxdriver().setup();

        return new FirefoxDriver();

    }

}
