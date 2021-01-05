package PageObjects.myfitnesspal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage

{
    @FindBy(id = "username")
    public WebElement txt_userName;

    @FindBy(id = "password")
    public WebElement txt_password;

    @FindBy(className = "submit")
    public WebElement btn_Login;
}
