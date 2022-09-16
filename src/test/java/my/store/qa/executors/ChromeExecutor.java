package my.store.qa.executors;

import my.store.qa.world.Environment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeExecutor extends BrowserExecutor {

    public ChromeExecutor(final String executorName) {

        super();
        setDriver(createChromeDriver());
        setExecutorName(executorName);

    }

    private WebDriver createChromeDriver() {

        System.setProperty("webdriver.chrome.driver", Environment.getDriverConfiguration().getChromeDriverPath());

        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-popup-blocking");
        options.addArguments("disable-infobars");
        options.addArguments("--disable-features=ChromeWhatsNewUI");

        return new ChromeDriver(options);

    }

}
