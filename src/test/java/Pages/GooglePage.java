package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class GooglePage {

    WebDriver driver;

    @FindBy(css = "q")
    WebElement googleInput;

    @FindBy(name = "btnK")
    WebElement googleSearchButton;

    @FindBy(css = "a[href='https://auto.am/']")
    WebElement AutoAm;


    public GooglePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void inputSearchText(){

        googleInput.sendKeys("auto am");
    }

    public void clickGoogleSearchButton(){

        googleSearchButton.click();
    }

    public void clickAutoAm() {

        AutoAm.click();
    }
}
