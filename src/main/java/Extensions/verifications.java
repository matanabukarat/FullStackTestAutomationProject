package Extensions;

import Utilities.CommonOps;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.testng.Assert;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;


import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;

public class verifications extends CommonOps


{
    @Step("Verify Text In Element")
    public static void textInElement(WebElement elem, String ExpectedText)
    {
        if (!Platform.equalsIgnoreCase("Mobile") && !Platform.equalsIgnoreCase("Electron") && !Platform.equalsIgnoreCase("desktop"))
            wait.until(ExpectedConditions.visibilityOf(elem));
        if (Platform.equalsIgnoreCase("desktop"))
        Assert.assertEquals(elem.getText().replace("התצוגה היא", "").trim(), ExpectedText);
        else
            Assert.assertEquals(elem.getText(), ExpectedText);
    }
    @Step("Verify Button Is Selected")
    public static void buttonSelected(WebElement elem)
    {
        wait.until(ExpectedConditions.visibilityOf(elem));
        Assert.assertTrue(elem.isSelected());
    }

    @Step("Verify Elements List Size")
    public static void ListSize(List<WebElement> li, String ExpectedSize)
    {
        Assert.assertEquals(String.valueOf(li.size()),ExpectedSize);
    }

    @Step("Verify Element Visually")
    public static void VisualElement(WebElement imageElement, String expectedImageName)
    {
        BufferedImage expectedImage = null;
        try
        {
            expectedImage = ImageIO.read(new File(getData("imageRepo") + expectedImageName + ".png"));
        }
        catch (Exception e)
        {
            System.out.println("Error reading image file: "+ e);
        }
        wait.until(ExpectedConditions.visibilityOf(imageElement));
        Screenshot imageScreenShot = new AShot().takeScreenshot(driver, imageElement);
        BufferedImage actualImage = imageScreenShot.getImage();
        Diff = imgDiff.makeDiff(actualImage, expectedImage);
        Assert.assertFalse(Diff.hasDiff(), "Images are not the same");
    }

    @Step("verify Text with Text")
    public static void text(String actual, String expected)
    {
        Assert.assertEquals(actual,expected);
    }
}
