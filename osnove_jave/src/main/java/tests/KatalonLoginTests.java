package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class KatalonLoginTests extends BasicTest {
    @Test(priority = 1)
    public void addingProductWithQuantityToTheCart() {
        driver.navigate().to(baseUrl + "/product/flying-ninja/");
        productPage.getQuantityInput().clear();
        productPage.getQuantityInput().sendKeys("3");
        productPage.getAddToCartButton().click();
        Assert.assertTrue(
                productPage.getAddToCartMessage().getText().contains("been added to your cart."),
                "");

        navPage.getCartLink().click();
        Assert.assertTrue(
                driver.getCurrentUrl().contains("/cart"),
                "");

        Assert.assertEquals(
                cartPage.getProductRows().size(),
                1,
                "");
    }

    @Test(priority = 2)
    public void removingProductFromCart() throws InterruptedException {
        navPage.getCartLink().click();
        Assert.assertTrue(
                driver.getCurrentUrl().contains("/cart"),
                "");
        Assert.assertEquals(
                cartPage.getProductRows().size(),
                1,
                "");
        cartPage.getRemoveButton(0).click();
        cartPage.waitForNumberOfProductRowsToBe(0);

    }
}
