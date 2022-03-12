package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import java.time.Duration;

public class GoogleBase {
    public WebDriver driver;
    private String baseUrl = ("https://www.google.com/");
    private String baseUrl1 = ("https://auto.am/");
    private String baseUrl2 =("https://rahulshettyacademy.com/AutomationPractice/");
    private String baseUrl3 = ("https://www.saucedemo.com/");

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);
        options.getLogLevel();
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.manage().window().maximize();
        driver.get(baseUrl);
        driver.get(baseUrl1);
        driver.get(baseUrl2);

    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}