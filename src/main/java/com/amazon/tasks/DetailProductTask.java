package com.amazon.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.amazon.ui.DetailProductUI.BTN_ADDPRODUCTCART;
import static com.amazon.ui.DetailProductUI.BTN_CART;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DetailProductTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_ADDPRODUCTCART),
                Click.on(BTN_CART)
        );

    }

    public static DetailProductTask ClickOnADDtoCart(){
        return instrumented(DetailProductTask.class);
    }
}
