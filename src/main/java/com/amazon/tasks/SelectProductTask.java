package com.amazon.tasks;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.amazon.interactions.SelectRandomInteractions.random;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectProductTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                random()
        );
        WebElementFacade producto = actor.recall("producto");
    }

    public static SelectProductTask selectProduct(){
        return instrumented(SelectProductTask.class);
    }
}
