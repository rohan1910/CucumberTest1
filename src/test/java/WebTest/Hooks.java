package WebTest;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static WebTest.BasePage.driver;

public class Hooks extends Utils {

    @Before
    public void open_browser(){
        System.setProperty("webdriver.chrome.driver", "src\\test\\Resources\\BrowserDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
        //website where the tests will run on
        //will run in google chrome browser
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }
    @After
    public void close_browser(){
        close_Browser();
    }






}
