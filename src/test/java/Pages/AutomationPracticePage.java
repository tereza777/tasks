//package Pages;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;
//
//public class AutomationPracticePage {
//    WebDriver driver;
//
//    @FindBy(css = "input[value=\"radio1\"]")
//    WebElement RadioBtn;
//
//    @FindBy(id = "autocomplete")
//    WebElement UnitedStates;
//
//    @FindBy(id = "dropdown-class-example")
//    WebElement dropdownSel;
//
//    public AutomationPracticePage(WebDriver driver) {
//        this.driver = driver;
//        PageFactory.initElements(driver, this);
//    }
//
//    public void clickRadioBtn() {
//        RadioBtn.click();
//    }
//
//    public void ClassExample() {
//        UnitedStates.click();
//        UnitedStates.sendKeys("Unated States");
//    }
//
//    public void ClickDropDown(){
//        Select R = new Select(dropdownSel);
//        R.selectByVisibleText("Option1");
//    }
//
//}
