import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class TestAmazonMainPage {

    private WebDriver driver;
    private AmazonMainPage amazonMainPage;


    @Before
    public void setUp(){
        System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://amazon.com");
        amazonMainPage = PageFactory.initElements(driver, AmazonMainPage.class);

    }

    @Test
    public void openProfilePage(){
    amazonMainPage.putPhoneInSearchField();
    amazonMainPage.clickOnSearchField();
    amazonMainPage.chooseAppleCheckBox();
    amazonMainPage.clickNexButton();
    amazonMainPage.clickNexButton();
    amazonMainPage.clickNexButton();
    amazonMainPage.clickNexButton();
    /*
    Дальше не работает, не приходилось такое делать, на разобраться было мало времени
     */
    amazonMainPage.showPhonesCheaper200();

    }

    @After
    public void tearDown(){
       // driver.quit();
    }
}
