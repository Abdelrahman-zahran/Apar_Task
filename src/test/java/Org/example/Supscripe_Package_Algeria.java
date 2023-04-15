package Org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Supscripe_Package_Algeria extends PageBase{

    @Test
    public void supscripe_by_Algeria(){

        //click on countries icon
        driver.findElement(By.cssSelector("span[id='arrow'] img")).click();
        //select country
        driver.findElement(By.id("dz-contry-flag")).click();
        //create list of supscription Types
        String[ ] ExpectedResultSupscriptionTypes = {"Lite","Classic","Premium"};
        //Get actual list of web elements of subscription types
        List<WebElement> SupscriptionTypes = driver.findElements(By.cssSelector("strong[class=\"plan-title\"]"));
        int i = 0;
        //Assert on subscription types
        for(WebElement e : SupscriptionTypes) {
            String ActualResultSupscriptionTypes = e.getText();
            Assert.assertEquals(ActualResultSupscriptionTypes.toLowerCase(),(ExpectedResultSupscriptionTypes[i].toLowerCase()));
            i++;
        }
        //Create a list of expected prices and currencies
        String [] ExpectedResultPriceAndCurrency = {"2.7 USD/month", "5.3 USD/month", "8 USD/month"};
        //Define a list of actual web elements of prices and currencies
        List<WebElement> PriceAndCurrency = driver.findElements(By.cssSelector("div[class=\"price\"]"));

        int j =0 ;
        //Assert on prices and currencies
        for(WebElement a : PriceAndCurrency) {
            String ActualResultPriceAndCurrency = a.getText();

            Assert.assertEquals(ActualResultPriceAndCurrency.toLowerCase(),(ExpectedResultPriceAndCurrency[j].toLowerCase()));
            j++;
        }

    }


}


