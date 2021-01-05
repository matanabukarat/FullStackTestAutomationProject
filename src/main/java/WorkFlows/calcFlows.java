package WorkFlows;

import Extensions.uiActions;
import io.qameta.allure.Step;

import static Utilities.Base.calcMain;

public class calcFlows

{
    @Step("Calculate Addition")
    public static void CalculateAddition()
    {
        uiActions.click(calcMain.btn_clear);
        uiActions.click(calcMain.btn_one);
        uiActions.click(calcMain.btn_plus);
        uiActions.click(calcMain.btn_seven);
        uiActions.click(calcMain.btn_equals);
    }
}
