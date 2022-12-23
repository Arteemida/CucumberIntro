package runners;

import configurations.BasicClass;
import configurations.BrowsersList;
import configurations.DriversConfig;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class Runner {
    @BeforeClass
    public static void openDriver(){
//        System.setProperty("");
        BasicClass.driver = DriversConfig.chooseBrowser(BrowsersList.CHROME);
    }
    @AfterClass
    public static void closeBrowser(){
        BasicClass.driver.quit();
    }

}
