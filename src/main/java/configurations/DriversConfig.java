package configurations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class DriversConfig {
    private static WebDriver driver;

    public static WebDriver chooseBrowser(BrowsersList browsers) {
        switch (browsers) {
            case CHROME:
                createChrome();
                break;
            case FIREFOX:
                createFirefox();
                break;
        }
        return driver;
    }

    public static void createChrome() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public static void createFirefox() {
    }

    public static void closeBrowser() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}

