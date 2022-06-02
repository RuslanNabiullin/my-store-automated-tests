package my.store.qa.executors;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChromeExecutor {

    private static WebDriver chromeDriver;

    public ChromeExecutor() {

        chromeDriver = createChromeDriver();

    }

    public void goToThePageByUrl(String url) {

        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        chromeDriver.navigate().to(url);

    }

    public boolean isElementDisplayed(By element, Duration duration) {

        chromeDriver.manage().timeouts().implicitlyWait(duration);

        try {
            chromeDriver.findElement(element);
        } catch (NoSuchElementException e) {
            return false;
        }

        return true;

    }

    private WebDriver createChromeDriver() {

        System.setProperty("webdriver.chrome.driver", "/Users/chromedriver/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-popup-blocking");
        options.addArguments("disable-infobars");
        options.addArguments("--disable-features=ChromeWhatsNewUI");

        return new ChromeDriver(options);

    }

}
