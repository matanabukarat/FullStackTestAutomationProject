package PageObjects.Calculator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class mainPage

{
   @FindBy(name = "נקה")
    public WebElement btn_clear;

    @FindBy(name = "אחת")
    public WebElement btn_one;

    @FindBy(name = "ועוד")
    public WebElement btn_plus;

    @FindBy(name = "שבע")
    public WebElement btn_seven;

    @FindBy(name = "שווה")
    public WebElement btn_equals;

    @FindBy(xpath = "//*[@AutomationId='CalculatorResults']")
    public WebElement field_results;
}
