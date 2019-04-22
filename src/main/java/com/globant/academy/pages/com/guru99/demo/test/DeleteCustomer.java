package com.globant.academy.pages.com.guru99.demo.test;

import com.globant.academy.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.logging.Logger;

public class DeleteCustomer extends BasePage {

    private static final Logger LOGGER = Logger.getLogger(DeleteCustomer.class.getName());

    public DeleteCustomer(WebDriver driver) {
        super(driver);
        driver.get("http://demo.guru99.com/test/delete_customer.php");
    }

    @FindBy(xpath = "abc")
    private WebElement idCustomer;

    public boolean test1() {
        idCustomer.sendKeys("alalo");
        return true;
    }
}
