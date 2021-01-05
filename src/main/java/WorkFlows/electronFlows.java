package WorkFlows;

import Extensions.uiActions;
import Utilities.CommonOps;
import io.qameta.allure.Step;

public class electronFlows extends CommonOps
{

  @Step("Get Screen Info (Resolution)")
    public static void getScreenInfo()
  {
      uiActions.click(ElectronMain.btn_windows);
      uiActions.click(ElectronMain.btn_info);
      if (!ElectronMain.btn_screen_info.isDisplayed())
      {
          uiActions.click(ElectronMain.btn_demo_toggle);
      }
      uiActions.click(ElectronMain.btn_screen_info);

  }
}
