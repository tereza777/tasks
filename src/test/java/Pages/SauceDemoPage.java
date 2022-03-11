package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import static org.testng.Assert.assertTrue;


public class SauceDemoPage {
    WebDriver driver;

    @FindBy(name = "user-name")
    WebElement userName;

    @FindBy(id = "password")
    WebElement passWord;

    @FindBy(name = "login-button")
    WebElement loginB;

    @FindBy(css = "span[class=\"title\"]")
    WebElement productsPage;

    @FindBy(css = "option[value='lohi']")
    WebElement priceFilter;

    @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
    WebElement fleeceJacket;

    @FindBy(className = "shopping_cart_link")
    WebElement shoppingCart;

    @FindBy(css = "a[href=\"#\"] > div[class=inventory_item_name]")
    WebElement jacketInCart;

    @FindBy(id = "\"checkout\"")
    WebElement checkout;

    @FindBy(id = "id=\"first-name\"")
    WebElement firstName;

    @FindBy(name = "lastName")
    WebElement lastName;

    @FindBy(id = "postal-code")
    WebElement postalCode;

    @FindBy(name = "continue")
    WebElement continueBtn;

    @FindBy(css = "div[class='summary_total_label'] " )
    WebElement totalPrice;

    @FindBy(id = "finish")
    WebElement finishBtn;

    @FindBy(className = "complete-header")
    WebElement headerMsg;

    public SauceDemoPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void Login(){
    userName.sendKeys("standard_user");
    passWord.sendKeys("secret_sauce");
    loginB.click();
}

    public void isProductPageLoad() {
        if (productsPage != null && driver.getTitle().equals("Swag Labs")) {
            assertTrue(true, "Products Page loaded");
        } else {
            assertTrue(false, "Products Page not loaded");
        }
    }

        public void SelectPrice(String lohi) {
            Select t = new Select(priceFilter);
            t.selectByValue(lohi);
        }

        public void checkFilter(){
        boolean displayed = priceFilter.isDisplayed();
        assertTrue(displayed, "Filter is not working properly");
        }

        public void addJacketInCard(){
            fleeceJacket.click();

        }
        public void clickShoppingCard(){

        shoppingCart.click();
        }

        public void checkItemInCard(){
        boolean item = jacketInCart.isDisplayed();
        assertTrue(item, "Jacket isn't Displayed");
    }

        public void pressCheckout(){

        checkout.click();
        }

    public void fillItemForms(){
        firstName.sendKeys("t");
        lastName.sendKeys("tt");
        postalCode.sendKeys("000");
        continueBtn.click();
    }

    public void checkPrice(String Price) {
        Assert.assertEquals(totalPrice.getText(), Price, "Price not Match!");

    }

    public void clickFinish(){
        finishBtn.click();

    }

    public void messageIsDisplayed(){
        boolean msg = headerMsg.isDisplayed();
        assertTrue(msg, "Message isn't Displayed");
    }

    }



