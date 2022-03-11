package Tests;

import Base.GoogleBase;
import Pages.SauceDemoPage;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SauceDemoPageTest extends GoogleBase {

    SauceDemoPage sauceDemoPage;

    @Test(priority = 1)
    public void SauceDemo(){
        sauceDemoPage = new SauceDemoPage(driver);
        driver.get("https://www.saucedemo.com/");
        sauceDemoPage.Login();
        sauceDemoPage.isProductPageLoad();
        sauceDemoPage.SelectPrice(2);
        sauceDemoPage.checkFilter();
        sauceDemoPage.addJacketInCard();
        sauceDemoPage.clickShoppingCard();
        sauceDemoPage.checkItemInCard();
        sauceDemoPage.pressCheckout();
        sauceDemoPage.fillItemForms();
        sauceDemoPage.checkPrice("Total: $53.99");
        sauceDemoPage.clickFinish();
        sauceDemoPage.messageIsDisplayed();
}
}
