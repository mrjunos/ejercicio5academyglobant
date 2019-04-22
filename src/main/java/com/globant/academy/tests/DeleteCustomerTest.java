package com.globant.academy.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteCustomerTest extends BaseTest{

    @Test
    public void test1(){
        Assert.assertTrue(getDeleteCustomer().test1());
    }

}
