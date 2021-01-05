package PageObjects.myfitnesspal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class mainPage

{
    @FindBy(xpath = "//div[@class='left']/h2")
    public WebElement txt_mainHeader;

    @FindBy(className = "close-btn-container")
    public WebElement btn_closeContainer;

    @FindBy(css = "a[href='/exercise/diary']")
    public WebElement btn_Exercise;

    @FindBy(xpath = "//div/a[@href='/account/login']")
    public WebElement btn_Login;

}
