package pageObject;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.ThreadLocalRandom;

public class CertificateHillel {
    @FindBy(xpath = "//*[@id=\"certificateCheckForm\"]/div/input")
    WebElement inputField;

    @FindBy(xpath = "//*[@id=\"certificateCheckForm\"]/div/button")
    WebElement checkButton;

    @FindBy(xpath = "//*[@id=\"certificateCheckForm\"]/p")
    WebElement message;

    public void enterCertificateNumber() {
        String rnumb = String.valueOf(ThreadLocalRandom.current().nextInt(200000, 1000000));
        inputField.sendKeys(rnumb);
    }

    public void activeCheckButton() {
        Assert.assertTrue(checkButton.isEnabled());
    }

    public void clickCheckButton() {
        checkButton.click();
    }

    public String getMessage() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return message.getText();
    }
}
