package edu.TestPackage;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.Assert;

public class ws2 {
    ChromeDriver driver;

    @BeforeMethod
    public void setUp() {
        // Setting system property for Chrome driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dives\\Downloads\\chromedriver-win64\\chromedriver.exe");

        // Creating a new instance of ChromeDriver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(dataProvider = "TestData")
    public void TestLogin(String uname, String paswd) {
        driver.get("https://tieteats.netlify.app");
        driver.findElement(By.id("login_email")).sendKeys(uname);
        driver.findElement(By.id("login_password")).sendKeys(paswd);
        driver.findElement(By.id("login")).click();

        // Add assertions or further test steps as needed
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser after each test method
      //  driver.quit();
    }

    @DataProvider
    public Object[][] TestData() {
        Object[][] data = new Object[3][2];

        data[0][0] = "thapareats@gmail.com";
        data[0][1] = "tiet@1234#";

        data[1][0] = "divesh@gmail.com";
        data[1][1] = "tiet@";

        data[2][0] = "karan@gmail.com";
        data[2][1] = "Test@1234";

        return data;
    }
}
