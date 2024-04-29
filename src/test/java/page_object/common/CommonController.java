package page_object.common;

import org.openqa.selenium.WebDriver;

public abstract class CommonController extends CommonElements {
    protected WebDriver driver;
    public CommonController(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}