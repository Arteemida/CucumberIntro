package featureFiles.stepsDescription;

import configurations.BasicClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import pageObject.CertificateHillel;


public class MyStepdefs extends BasicClass {
    static CertificateHillel certificateHillel = PageFactory.initElements(driver, CertificateHillel.class);

    @When("The page is opened {string}")
    public void thePageIsOpened(String url) {
        driver.get(url);
    }

    @Then("Enter random certificate number")
    public void enterRandomCertificateNumber() throws InterruptedException {
        certificateHillel.enterCertificateNumber();
        Thread.sleep(3000);
    }

    @Then("The Check button is active")
    public void theCheckButtonIsActive() {
        certificateHillel.activeCheckButton();
    }

    @And("Press the Check button")
    public void pressTheCheckButton() {
        certificateHillel.clickCheckButton();
    }

    @Then("The message Сертифікат не знайдено is displayed")
    public void theMessageСертифікатНеЗнайденоIsDisplayed() {
        Assert.assertEquals("Сертифікат не знайдено", certificateHillel.getMessage());
    }
}
