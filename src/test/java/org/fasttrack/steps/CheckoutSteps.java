package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import java.util.Locale;

public class CheckoutSteps extends BaseSteps{

    @Step
    public void clickProceedtoCheckoutButton(){
        checkoutPage.clickCheckoutButton();
    }
    @Step
    public void clickNewAddress(){
        checkoutPage.clickNewAddress();
    }
    @Step
    public void clickChooseNewAddress(){
        checkoutPage.clickChooseNewAddress();
    }
    @Step
    public void setAddress(String address){
        checkoutPage.setAddressField(address);
    }

    @Step
    public void setCity(String city){
        checkoutPage.setCityField(city);
    }

    @Step
    public void clickRegionDropDownList(){
        checkoutPage.clickRegionDropDownList();
    }
    @Step
    public void clickRegion(){
        checkoutPage.clickRegion();
    }
    @Step
    public void setPostcode(String postcode){
        checkoutPage.setPostcode(postcode);
    }
    @Step
    public void clickCountryDropdownList(){
        checkoutPage.clickCountryDropdownList();
    }
    @Step
    public void clickCountrySelect(){
        checkoutPage.clickCountrySelect();
    }
    @Step
    public void setPhoneNumber(String phoneNumber){
        checkoutPage.setTelephoneField(phoneNumber);
    }
    @Step
    public void clickContinueFromBillingInfo(){
        checkoutPage.clickContinueFromBillingInfo();
    }
    public void clickContinueFromShippingInfo(){
        checkoutPage.clickContinueFromShippingInfo();
    }
    @Step
    public void clickFreeShippingButton(){
        checkoutPage.clickFreeShippingButton();
    }
    @Step
    public void clickContinueFromShipping(){
        checkoutPage.clickContinueFromShipping();
    }
    @Step
    public void clickContinueFromPayment(){
        checkoutPage.clickContinueFromPayment();
    }
    @Step
    public void clickPlaceOrder(){
        checkoutPage.clickPlaceOrder();
    }
    @Step
    public void verifyIfOrderIsSent(){
        Assert.assertEquals("THANK YOU FOR YOUR PURCHASE!", checkoutPage.getWelcomeText2());
    }

}