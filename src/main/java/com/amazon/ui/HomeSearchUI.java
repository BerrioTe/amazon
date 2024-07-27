package com.amazon.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeSearchUI {
    public static Target INPUT_SEARCH=Target.the("search field")
            .located(By.id("twotabsearchtextbox"));
}
