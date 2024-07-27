package com.amazon.stepDef;
import com.amazon.questions.ValidateProductQuestion;
import com.amazon.tasks.DetailProductTask;
import com.amazon.tasks.OpenAmazonTask;
import com.amazon.tasks.SearchTask;
import com.amazon.tasks.SelectProductTask;
import io.cucumber.java.en.*;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class AddProductToCartStepDef {

    @Given("that user open page Amazon and search any product")
    public void thatUserOpenPageAmazonAndSearchAnyProduct() {
        theActorCalled("User").wasAbleTo(
                OpenAmazonTask.openBrowser()
        );

    }
    @When("user click  on  product tittle and user click on add to cart")
    public void userClickOnProductTittleAndUserClickOnAddToCart() {
        theActorInTheSpotlight().attemptsTo(
                SearchTask.searchProduct(),
                SelectProductTask.selectProduct(),
                DetailProductTask.ClickOnADDtoCart()

        );

    }
    @Then("user can view the product into cart")
    public void userCanViewTheProductIntoCart() {
        theActorInTheSpotlight().should(
                seeThat(
                        ValidateProductQuestion.from(), Matchers.equalTo(true)
                )
        );
    }
}
