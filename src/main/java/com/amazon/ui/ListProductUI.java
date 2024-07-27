package com.amazon.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ListProductUI {

    public static Target LIST_PRODUCTS=Target.the("products list")
            .locatedBy("//span[@class='a-size-base-plus a-color-base a-text-normal']");
}
