package com.globant.academy.tests;

import com.globant.academy.pages.MyDriver;
import com.globant.academy.pages.com.guru99.demo.test.DeleteCustomer;
import lombok.Getter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import java.util.logging.Logger;

public class BaseTest {

    private static final Logger LOGGER = Logger.getLogger(BaseTest.class.getName());
    private MyDriver driver;
    @Getter
    private DeleteCustomer deleteCustomer;

    @BeforeSuite(alwaysRun = true)
    @Parameters({"browser"})
    public void beforeSuite(String browser) {
        driver = new MyDriver(browser);
        deleteCustomer = new DeleteCustomer(driver.getDriver());
    }

    @AfterSuite(alwaysRun = true)
    public void afterSuite() {
        deleteCustomer.dispose();
    }

    public DeleteCustomer getDeleteCustomer() {
        return deleteCustomer;
    }
}
