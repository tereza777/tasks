package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import static org.testng.AssertJUnit.assertTrue;

public class AutoAmPage {
    WebDriver driver;

    @FindBy(css = "#filter-make")
    WebElement Tesla;

    @FindBy(name = "model[3508][]")
    WebElement Ymodel;

    @FindBy(name = "year[gt]")
    WebElement Year2018;

    @FindBy(className = "lever")
    WebElement element;

    @FindBy(id = "search-btn")
    WebElement SearchB;

    @FindBy(id = "research-btn")
    WebElement quantity;

    @FindBy(id = "ad-2732552")
    WebElement Tesla3;

    @FindBy(css = "#ad-2732552 > div.card-action > div > span")
    WebElement price;


    public AutoAmPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void checkAutoAmPageTitle(String expTitle) {
        String actTitle = driver.getTitle();
        Assert.assertEquals(actTitle, expTitle, "The Title NOT match!!!!");
    }

    public void selectTesla(String Make) {
        Select sel = new Select(Tesla);
        sel.selectByVisibleText(Make);
    }

    public void SelectModelY(String model) {
        Select t = new Select(Ymodel);
        t.selectByVisibleText(model);
    }

    public void selectY2018(String year) {
        Select Tt = new Select(Year2018);
        Tt.selectByVisibleText(year);
    }

    public void CustomCleared() {
        boolean selected = element.isSelected();
        if (!selected) {
            element.click();
        }
    }

    public void SearchButtn() {

        SearchB.click();
    }

    public void checkQuantity(String quantity3) {
        Assert.assertEquals(quantity.getText(), quantity3, "Not Match!");
    }

    public void checkIfElementisDisplayed() {
        boolean displayed = Tesla3.isDisplayed();
        System.out.println(displayed);
    }

    public void checkPrice(String Price) {
        Assert.assertEquals(price.getText(), Price, "Price not Match!");

    }
}


          //Don't worry, be happy Terezik :) !!!



