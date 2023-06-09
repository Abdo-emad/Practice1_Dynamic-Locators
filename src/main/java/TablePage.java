import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TablePage {
    WebDriver driver;
    public TablePage(WebDriver driver){
        this.driver=driver;
    }

    //By tableCheckBox= By.xpath("//td[.='Algeria']//parent::tr//input[@type=\"checkbox\"]");
    public By tableCheckBoxMethod(String country){
        return   By.xpath("//td[.= '"+ country +"' ]//parent::tr//input[@type=\"checkbox\"]");
    }

    public void LocatorClick(String country){
        driver.findElement(tableCheckBoxMethod(country)).click();
    }
}
