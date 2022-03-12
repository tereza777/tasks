package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AutomationPracticePage {
    WebDriver driver;

    @FindBy(css = "input[value=\"radio1\"]")
    WebElement RadioBtn;

    @FindBy(id = "autocomplete")
    WebElement UnitedStates;

    @FindBy(id = "dropdown-class-example")
    WebElement dropdownSel;

    @FindBy(name = "checkBoxOption1")
    WebElement checkbox1;

    @FindBy(id = "openwindow")
    WebElement openWindow;

    @FindBy(id = "opentab")
    WebElement openTabBtn;

    @FindBy(name = "enter-name")
    WebElement inputName;

    @FindBy(id = "alertbtn")
    WebElement alertBtn;

    @FindBy(id = "confirmbtn")
    WebElement confirmBtn;

    @FindBy(linkText = "Advanced Selenium Framework Pageobject, TestNG, Maven, Jenkins,C")
    WebElement webTable9;

    @FindBy(id = "hide-textbox")
    WebElement hideBtn;

    @FindBy(id = "show-textbox")
    WebElement showBtn;

    @FindBy(name = "show-hide")
    WebElement showHideBtn;

    @FindBy(id = "mousehover")
    WebElement mouseHover;

    @FindBy(linkText = "a[href='#top']")
    WebElement top;


    public AutomationPracticePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickRadioBtn() {
        RadioBtn.click();
    }

    public void ClassExample() {
        UnitedStates.click();
        UnitedStates.sendKeys("Unated States (USA)");
    }

    public void ClickDropDown() {
        Select R = new Select(dropdownSel);
        R.selectByVisibleText("Option1");
    }

    public void checkBox1sel() {
        boolean selected = checkbox1.isSelected();
        if (!selected) {
            checkbox1.click();
        }
    }

    public void setOpenWindow() {
        openWindow.click();
        String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();
        while (iterator.hasNext()) {
            String ChildWindow = iterator.next();
            if (!mainWindowHandle.equals(ChildWindow)) {
                System.out.println(driver.switchTo().window(ChildWindow).getTitle());
                driver.close();
                driver.switchTo().window(mainWindowHandle);
            }

        }
    }

    public void setNewTab(){
        openTabBtn.click();
        String mainWindow = driver.getWindowHandle();
        for (String newTab : driver.getWindowHandles()) {
            driver.switchTo().window(newTab);
        }
        Assert.assertEquals(driver.getTitle(), "Rahul Shetty Academy");
        driver.close();
        driver.switchTo().window(mainWindow);
    }

    public void clickAlertBtn() {
        inputName.click();
        inputName.sendKeys("Tereza");
        alertBtn.click();
        Assert.assertEquals(driver.switchTo().alert().getText(), "Hello Tereza, " +
                "share this practice page and share your knowledge");
        driver.switchTo().alert().accept();
    }

    public void setConfirmBtn() {
        confirmBtn.click();
        Assert.assertEquals(driver.switchTo().alert().getText(), "Hello , " +
                "Are you sure you want to confirm?");
        driver.switchTo().alert().accept();
    }

    public void clickHideandShowBtn(){
        hideBtn.click();
        showBtn.click();
        showHideBtn.click();
        showHideBtn.sendKeys("Music");
        assertTrue(true, "Hide and show");

    }

//    public void setMouseHover(){
//            Actions actions = new Actions(driver);
//            actions.moveToElement(mouseHover).perform();
//            System.out.println("Done on Mouse hover btn");
//            actions.moveToElement(top).perform();
//            System.out.println("Done Mouse hover on 'top' from Mouse hover btn");
//            top.click();
//            driver.close();
//        }

//    public void checkWebTable(String webTable){
//        Assert.assertEquals(webTable9.getText(), webTable, "Not Match!");
//
//    }
    }



