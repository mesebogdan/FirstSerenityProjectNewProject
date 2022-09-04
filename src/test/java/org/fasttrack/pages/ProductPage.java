package org.fasttrack.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{

    @FindBy(css = ".add-to-cart-buttons button")
    private WebElementFacade addToCartButton;

    @FindBy(css = "[Title='White']")
    private WebElementFacade addWhiteButton;

    @FindBy(css = "[Title='Silver']")
    private WebElementFacade addSilverButton;

    @FindBy(id = "option79")
    private WebElementFacade addMSize;


    public void clickAddToCart(){
        clickOn(addToCartButton);
    }
    public void clickWhite(){
        clickOn(addWhiteButton);
    }
    public void clickSilver(){
        clickOn(addSilverButton);
    }
    public void clickM(){
        clickOn(addMSize);
    }

}
