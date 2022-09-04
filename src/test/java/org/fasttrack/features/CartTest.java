package org.fasttrack.features;

import org.fasttrack.utils.Constants;
import org.junit.Test;

public class CartTest extends BaseTest {

    @Test
    public void loginAndAddToCartTest(){
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        searchSteps.navigateToProductName("SILVER DESERT NECKLACE");
        cartSteps.addProductToCart();
        cartSteps.checkSuccessMessage("SILVER DESERT NECKLACE");
    }

    @Test
    public void checkTotalAndSubtotalTest(){
        searchSteps.navigateToProductName("SILVER DESERT NECKLACE");
        cartSteps.addProductToCart();
        cartSteps.checkSuccessMessage("SILVER DESERT NECKLACE");

        searchSteps.navigateToProductName("HERALD GLASS VASE");
        cartSteps.addProductToCart();
        cartSteps.checkSuccessMessage("HERALD GLASS VASE");

        cartSteps.checkSubtotalPrice();
        cartSteps.checkTotalPrice();
    }
    @Test
    public void checkTotalForThreeProducts(){
        searchSteps.navigateToProductName("SILVER DESERT NECKLACE");
        cartSteps.addProductToCart();
        cartSteps.checkSuccessMessage("SILVER DESERT NECKLACE");

        searchSteps.navigateToProductName("MODERN MURRAY CERAMIC VASE");
        cartSteps.addWhiteProduct();
        cartSteps.addProductToCart();
        cartSteps.checkSuccessMessage("MODERN MURRAY CERAMIC VASE");

        searchSteps.navigateToProductName("SULLIVAN SPORT COAT");
        cartSteps.addSilverProduct();
        cartSteps.addMSize();
        cartSteps.addProductToCart();
        cartSteps.checkSuccessMessage("SULLIVAN SPORT COAT");

        cartSteps.checkSubtotalPrice();
        cartSteps.checkTotalPrice();
    }
}
