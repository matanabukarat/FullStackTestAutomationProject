package PageObjects.ElectronDemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class mainPage
{
    @FindBy(id = "button-windows")
    public WebElement btn_windows;

    @FindBy(id = "button-app-sys-information")
    public WebElement btn_info;

    @FindBy(id = "screen-info-demo-toggle")
    public WebElement btn_demo_toggle;

    @FindBy(id = "screen-info")
    public WebElement btn_screen_info;

    @FindBy(id = "got-screen-info")
    public WebElement field_screen_info;
}
