package Org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subscripe_Package_Egypt extends  PageBase{

    @Test
    public void supscripe_by_Egypt(){

        //click on countries icon
        driver.findElement(By.cssSelector("span[id='arrow'] img")).click();
        //select country
        driver.findElement(By.id("eg-contry-flag")).click();
        //create list of supscription Types
        String[ ] ExpectedResultSupscriptionTypes = {"Lite","Classic","Premium"};
        List<WebElement> SupscriptionTypes = driver.findElements(By.cssSelector("strong[class=\"plan-title\"]"));
                int i = 0;
                for(WebElement e : SupscriptionTypes) {
                    String ActualResultSupscriptionTypes = e.getText();
                Assert.assertEquals(ActualResultSupscriptionTypes.toLowerCase(),(ExpectedResultSupscriptionTypes[i].toLowerCase()));
                    i++;
            }
                String [] ExpectedResultPriceAndCurrency = {"0.25 USD/month", "0.5 USD/month", "1 USD/month"};
               List<WebElement> PriceAndCurrency = driver.findElements(By.cssSelector("div[class=\"price\"]"));

                int j =0 ;
                for(WebElement a : PriceAndCurrency) {
            String ActualResultPriceAndCurrency = a.getText();

            Assert.assertEquals(ActualResultPriceAndCurrency.toLowerCase(),(ExpectedResultPriceAndCurrency[j].toLowerCase()));
            j++;
        }

    }


}
