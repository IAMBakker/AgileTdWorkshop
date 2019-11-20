package stepdefinitions.exercises;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager {

    //TODO change back to protected
    public static WebDriver driver;

    @Before
    public static void setupClass(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        driver = new ChromeDriver();
    }

    @After
    public static void terminateClass(){
        driver.quit();
    }

}

