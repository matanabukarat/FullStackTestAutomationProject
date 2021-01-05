package Utilities;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.yandex.qatools.ashot.AShot;


import javax.imageio.ImageIO;
import java.io.File;

public class helperMethods extends CommonOps

{
    @Step("Take ScreenShot And Save it on The Repository")
    public static void takeElementScreenShot(WebElement ImageElement, String ImageName)
    {
        wait.until(ExpectedConditions.visibilityOf(ImageElement));
        imageScreenShot = new AShot().takeScreenshot(driver, ImageElement);
      try
      {
          ImageIO.write(imageScreenShot.getImage(), "png", new File(getData("imageRepo")+ ImageName + ".png"));
      }
      catch (Exception e)
      {
          System.out.println("Error writing image file, see details: "+e);
      }
    }
}
