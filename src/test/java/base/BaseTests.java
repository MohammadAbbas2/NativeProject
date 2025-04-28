package base;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

import java.util.List;

public class BaseTests {

    private static WebDriver driver;
    protected HomePage homePage;

    @BeforeAll
    public static void setUpDriver(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
    }

    @BeforeEach
    public void setUpHomePage(){
        driver.get("https://the-internet.herokuapp.com/");
        this.homePage = new HomePage(driver);
    }

    @AfterAll
    public static void tearDown(){
        driver.quit();
    }

}
