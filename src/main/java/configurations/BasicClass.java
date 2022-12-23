package configurations;

import org.openqa.selenium.WebDriver;

public class BasicClass {
    public static WebDriver driver;

    static {
        driver = DriversConfig.chooseBrowser(BrowsersList.CHROME);
    }
}
