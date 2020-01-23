import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AmazonMainPage {

    static WebDriver driver;

    public AmazonMainPage (WebDriver driver) {
            this.driver = driver;
        }
        @FindBy (css = "input#twotabsearchtextbox")
        WebElement searchTextField;
         @FindBy (xpath = "//span[@id='nav-search-submit-text']/..")
         WebElement searchButton;
        @FindBy (xpath = "//div[@id='brandsRefinements']//span[text()='Apple']/preceding-sibling::div//label")
        WebElement appleCheckBox;
        @FindBy (xpath = "//a[contains(text(), 'Next')] ")
        WebElement nextButton;
        @FindBy(className = "//span[@class='a-color-base']")
        private List<WebElement> phonesList;


    public void putPhoneInSearchField(){
        searchTextField.sendKeys("phones");
        }
    public void clickOnSearchField(){
        searchButton.click();
    }
    public void chooseAppleCheckBox (){
        appleCheckBox.click();
    }

        public void clickNexButton (){
        nextButton.click();
        }

    /*
       Дальше не работает, не приходилось такое делать, на разобраться было мало времени
        */
        public void showPhonesCheaper200 (){
         for(WebElement element: phonesList) {
             System.out.println(element.getText());
    }
    }
}
