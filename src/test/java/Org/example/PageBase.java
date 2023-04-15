package Org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class PageBase {

    WebDriver driver;

    @BeforeMethod
    public void openBrowser() {


        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        //maximize window
        driver.manage().window().maximize();

        //set implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.get("https://subscribe.stctv.com/");
        driver.findElement(By.id("translation-btn")).click();


    }

    @AfterMethod
    public void quitDriver() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(3));
        driver.quit();
    }

}
