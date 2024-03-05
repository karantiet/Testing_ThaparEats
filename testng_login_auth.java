package thapareats;

import org.openqa.selenium.*;

import org.openqa.selenium.chrome.*;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;

public class NewTest {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Setting system property for Chrome driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dives\\Downloads\\chromedriver-win64\\chromedriver.exe");

        // Creating a new instance of ChromeDriver
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testRegistration() {
        // Opening the registration page
        driver.get("https://tieteats.netlify.app");

        // Perform registration steps
        driver.findElement(By.id("signUp")).click();
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Karan");
        driver.findElement(By.xpath("//input[@placeholder='contact']")).sendKeys("7889080485");
        driver.findElement(By.xpath("//input[@placeholder='city']")).sendKeys("Ludhiana");
        driver.findElement(By.id("email")).sendKeys("ksuhdfbhjhbd1@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Karan@123456");
        driver.findElement(By.id("register")).click();

        // Add assertions here to verify successful registration if needed
    }

    // You can add more test methods for different scenarios

    @AfterClass
    public void tearDown() {
        // Close the browser after all tests are executed
        driver.quit();
    }
}
