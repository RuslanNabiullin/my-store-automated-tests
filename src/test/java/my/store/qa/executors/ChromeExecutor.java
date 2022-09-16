package my.store.qa.executors;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeExecutor extends BrowserExecutor {

    public ChromeExecutor(final String executorName) {

        super();
        setDriver(createChromeDriver());
        setExecutorName(executorName);

    }

    private WebDriver createChromeDriver() {

        WebDriverManager.chromedriver().setup();

        return new ChromeDriver();

    }

}
