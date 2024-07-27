package com.amazon.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static com.amazon.ui.HomeSearchUI.INPUT_SEARCH;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(INPUT_SEARCH, WebElementStateMatchers.isVisible())
                        .forNoMoreThan(20).seconds(),
                Enter.theValue("silla gamer").into(INPUT_SEARCH).thenHit(Keys.ENTER)
        );
    }

    public static SearchTask searchProduct(){
        return instrumented(SearchTask.class);
    }
}
