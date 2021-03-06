package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePageObjects {

    public WebDriver driver;
    public WebDriverWait wait;

    public BasePageObjects(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
    }
}
