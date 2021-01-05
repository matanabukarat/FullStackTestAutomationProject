package Extensions;

import  Utilities.CommonOps;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class uiActions extends CommonOps

{
    @Step("Click on Element")
    public static void click(WebElement elem)
    {
        if (!Platform.equalsIgnoreCase("Mobile") && !Platform.equalsIgnoreCase("Electron") && !Platform.equalsIgnoreCase("desktop"))
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.click();
    }
    @Step("Update element Text")
    public static void updateText(WebElement elem, String value)
    {
        wait.until(ExpectedConditions.visibilityOf(elem));
        elem.clear();
        elem.sendKeys(value);
    }
    @Step("Update DropDown Field")
    public static void updateDropDown(WebElement elem, String value)
    {
        wait.until(ExpectedConditions.visibilityOf(elem));
        Select myValue = new Select(elem);
        myValue.selectByVisibleText(value);
    }

    @Step("Selecting Element From a List by Text")
    public static  void SelectElementByText(List<WebElement> elems, String name)
    {
        wait.until(ExpectedConditions.visibilityOf(elems.get(elems.size()-1)));
        for (int i = 0; i<elems.size(); i++)
        {
            if (elems.get(i).getText().equalsIgnoreCase(name))
            {
                uiActions.click(elems.get(i));
                break;
            }
        }
    }


}
