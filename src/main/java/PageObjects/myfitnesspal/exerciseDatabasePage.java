package PageObjects.myfitnesspal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class exerciseDatabasePage

{
@FindBy(xpath = "//select[@id='exercise_select']")
   public WebElement chooseExercise;

@FindBy(xpath = "//select[@id='exercise_select']/option")
   public List<WebElement> exerciseList;

@FindBy(id = "calories_burned_description")
   public  WebElement caloriesBurnedDescription;

@FindBy(id = "search")
   public WebElement txt_searchExercises;

@FindBy(xpath = "//input[@value='Search']")
   public WebElement btn_Search;

@FindBy(xpath = "//ul[@id='matching']/li")
   public List<WebElement> matchingExercises;

@FindBy(id = "weight_display_value")
   public WebElement txt_yourWeight;

@FindBy(id = "minutes")
   public WebElement txt_howLong;

@FindBy(id = "cresults")
   public WebElement numOfCaloriesBurned;

@FindBy(xpath = "//i[@class='icon-facebook icon-light']")
   public WebElement img_FacebookLogo;

}
