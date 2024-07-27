package com.amazon.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DetailProductUI {
    public static Target BTN_ADDPRODUCTCART=Target.the("button add product to cart")
            .locatedBy("//input[@id='add-to-cart-button']");

    public static Target BTN_CART=Target.the("button cart")
            .locatedBy("//div[@id='nav-cart-text-container']");
}
