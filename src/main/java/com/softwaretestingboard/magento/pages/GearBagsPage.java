package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.utilities.Utility;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class GearBagsPage extends Utility {

    // Click on Product Name ‘Overnight Duffle’
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Overnight Duffle']")
    WebElement overNightDuffle;


    // Click on Product Name ‘Overnight Duffle’
    public void clickOnProductNameOvernightDuffle() throws InterruptedException {
        Reporter.log("Click On OvernightDuffle  " + overNightDuffle.toString());
        CustomListeners.test.log(Status.PASS, "User successful Click on Product" + overNightDuffle);
        Thread.sleep(500);
        clickOnElement(overNightDuffle);
    }


}