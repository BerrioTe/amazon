package com.amazon.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.util.List;
import java.util.Random;

import static com.amazon.ui.ListProductUI.LIST_PRODUCTS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectRandomInteractions implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> listProducts = LIST_PRODUCTS.resolveAllFor(actor);
        int index= (new Random()).nextInt(listProducts.size());
        WebElementFacade producto = listProducts.get(index);
        actor.remember("producto ", producto);
        producto.click();


        
    }
    
    public static SelectRandomInteractions random(){
        return instrumented(SelectRandomInteractions.class);
    }
}
