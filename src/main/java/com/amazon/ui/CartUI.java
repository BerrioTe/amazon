package com.amazon.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CartUI {
    public static Target LBL_NAMEPRODUCT=Target.the("Name product")
            .locatedBy("//span[contains(@class,'a-truncate sc')]");
}
