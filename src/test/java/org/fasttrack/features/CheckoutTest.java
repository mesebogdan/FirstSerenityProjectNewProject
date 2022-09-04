package org.fasttrack.features;

import org.fasttrack.utils.Constants;
import org.junit.Test;

public class CheckoutTest extends BaseTest{

    @Test
    public void validCheckoutTest(){
        loginSteps.doLogin(Constants.USER_EMAIL,Constants.USER_PASS);
        searchSteps.navigateToProductName("SILVER DESERT NECKLACE");
        cartSteps.addProductToCart();
        checkoutSteps.clickProceedtoCheckoutButton();
        checkoutSteps.clickNewAddress();
        checkoutSteps.clickChooseNewAddress();
        checkoutSteps.setAddress("Cluj");
        checkoutSteps.setCity("Cluj");
        checkoutSteps.clickRegionDropDownList();
        checkoutSteps.clickRegion();
        checkoutSteps.setPostcode("407055");
        checkoutSteps.clickCountryDropdownList();
        checkoutSteps.clickCountrySelect();
        checkoutSteps.setPhoneNumber("0754065611");
        checkoutSteps.clickContinueFromBillingInfo();
      //  checkoutSteps.clickContinueFromShippingInfo();
        checkoutSteps.clickFreeShippingButton();
        checkoutSteps.clickContinueFromShipping();
        checkoutSteps.clickContinueFromPayment();
        checkoutSteps.clickPlaceOrder();
        checkoutSteps.verifyIfOrderIsSent();


    }
}
