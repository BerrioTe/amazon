package com.amazon.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.amazon.ui.CartUI.LBL_NAMEPRODUCT;

public class ValidateProductQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        WebElementFacade producto = LBL_NAMEPRODUCT.resolveFor(actor);
        return LBL_NAMEPRODUCT.resolveFor(actor).isDisplayed();
    }

    public static ValidateProductQuestion from(){
        return new ValidateProductQuestion();
    }
}
