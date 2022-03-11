package Tests;

import Base.GoogleBase;
import Pages.AutoAmPage;
import Pages.GooglePage;
import org.testng.annotations.Test;

public class AutoAmPageTest extends GoogleBase {
    GooglePage googlePage;
    AutoAmPage autoAmPage;

    @Test(priority = 1)
     public void GoogleSearch() {
        googlePage = new GooglePage(driver);
        googlePage.inputSearchText();
        googlePage.clickGoogleSearchButton();
        googlePage.clickAutoAm();

    }

        @Test(priority = 2)
        public void AutoAm() throws InterruptedException {
            autoAmPage = new AutoAmPage(driver);
            autoAmPage.checkAutoAmPageTitle("Ավտոմեքենաների վաճառք Հայաստանում - Auto.am");
            autoAmPage.selectTesla("Tesla");
            autoAmPage.SelectModelY("Model Y");
            autoAmPage.selectY2018("2018");
            autoAmPage.CustomCleared();
            autoAmPage.SearchButtn();
            autoAmPage.checkQuantity("\uE8B6 3");
            autoAmPage.checkIfElementisDisplayed();
            autoAmPage.checkPrice("$ 67 000");

        }
    }
