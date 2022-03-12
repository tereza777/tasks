package Tests;

import Base.GoogleBase;
import Pages.AutomationPracticePage;
import org.testng.annotations.Test;

public class AutomationPracticeTest extends GoogleBase {


    AutomationPracticePage automationPracticePage;


    @Test(priority = 1)


    public void verifyRadioButton() {
        automationPracticePage = new AutomationPracticePage(driver);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        automationPracticePage.clickRadioBtn();
    }

    @Test(priority = 2)

    public void verifyClassexample(){
    automationPracticePage = new AutomationPracticePage(driver);
    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    automationPracticePage.ClassExample();
    }

    @Test(priority = 3)

    public void verifyDropDown() {
    automationPracticePage = new AutomationPracticePage(driver);
    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    automationPracticePage.ClickDropDown();
    }

   @Test(priority = 4)

    public void verifyCheckbox() {
        automationPracticePage = new AutomationPracticePage(driver);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        automationPracticePage.checkBox1sel();
   }

   @Test(priority = 5)

    public void verifyWindowHandle(){
       automationPracticePage = new AutomationPracticePage(driver);
       driver.get("https://rahulshettyacademy.com/AutomationPractice/");
       automationPracticePage.setOpenWindow();
   }

   @Test(priority = 6)

    public void verifyNewTab(){
       automationPracticePage = new AutomationPracticePage(driver);
       driver.get("https://rahulshettyacademy.com/AutomationPractice/");
       automationPracticePage.setNewTab();
   }


    @Test(priority = 7)

    public void verifyAlert(){
        automationPracticePage = new AutomationPracticePage(driver);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        automationPracticePage.clickAlertBtn();
    }

    @Test(priority = 8)

    public void confirmConfirmBtn(){
        automationPracticePage = new AutomationPracticePage(driver);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        automationPracticePage.setConfirmBtn();
    }

    @Test(priority = 9)

    public void verifyHideShowBtn(){
        automationPracticePage = new AutomationPracticePage(driver);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        automationPracticePage.clickHideandShowBtn();
    }

//    @Test(priority = 10)
//
//    public void verifyMouseHoverBtn(){
//        automationPracticePage = new AutomationPracticePage(driver);
//        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//        automationPracticePage.setMouseHover();
//    }

//    @Test(priority = 10)
//
//    public void verifyWebTable(){
//        automationPracticePage = new AutomationPracticePage(driver);
//        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//        automationPracticePage.checkWebTable("Advanced Selenium Framework Pageobject, TestNG, Maven, Jenkins,C");
//    }

}
