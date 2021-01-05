package PageObjects.myfitnesspal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class exercisePage

{
    @FindBy(css = "a[href='/exercise/lookup']")
    public WebElement btn_Database;
}
