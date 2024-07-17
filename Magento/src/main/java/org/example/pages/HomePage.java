package org.example.pages;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends BasePage{

    private static final String hotSellerProductsCSSLocator = "li.product-item";
    private static final String createAccountCSSLocator = "div.header  a[href *= 'account/create']";


    @FindBy(css = hotSellerProductsCSSLocator)
    private List<WebElement> hotSellerProducts;

    @FindBy(css = createAccountCSSLocator)
    private WebElement createAccountButton;

    public HomePage (WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void addItemToCart(Integer index){
        waitForElementsToBeVisible(By.cssSelector(hotSellerProductsCSSLocator));
        WebElement productToAdd = hotSellerProducts.get(index);
        click(productToAdd);

    }

    public void clickOnCreateAccountButton(){
        waitForElementsToBeVisible(By.cssSelector(createAccountCSSLocator));

                click(createAccountButton);


    }

}
