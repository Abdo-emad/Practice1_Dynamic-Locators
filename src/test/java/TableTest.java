import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class TableTest {


    WebDriver driver;
    TablePage tablePage;

    @BeforeTest
    public void open(){
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://cosmocode.io/automation-practice-webtable/");
        tablePage= new TablePage(driver);

    }
    @Test
    public void execute(){
        tablePage.LocatorClick("Egypt");

    }


    @AfterTest
    public void Finish() throws InterruptedException {
        Thread.sleep(10000);
        driver.quit();
    }
}
