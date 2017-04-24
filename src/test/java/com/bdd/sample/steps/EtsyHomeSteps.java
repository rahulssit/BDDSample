package com.bdd.sample.steps;

import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.bdd.sample.steps.serenity.EndUserStepsNew;

public class EtsyHomeSteps {

    @Steps
    EndUserStepsNew endUser;
    
    @Given("the user is on etsy home page")
    public void givenTheUserIsOnTheETSYHomePage() {
    	endUser.is_the_home_page();
    }

    @When("the user search the $product")
    public void whenTheUserSearchingForProduct(String product) {
        endUser.is_searching_for_product(product);
    }

    @Then("the user land on shoes section page")
    public void thenTheUserShouldLandOnSearcherdSectionPage() {
        endUser.is_verifying_for_product_page();
    }

   /* @Given("the user is on the Wikionary home page")
    public void givenTheUserIsOnTheWikionaryHomePage() {
        endUser.is_the_home_page();
    }

    @When("the user looks up the definition of the word '$word'")
    public void whenTheUserLooksUpTheDefinitionOf(String word) {
        endUser.looks_for(word);
    }

    @Then("they should see the definition '$definition'")
    public void thenTheyShouldSeeADefinitionContainingTheWords(String definition) {
        endUser.should_see_definition(definition);
    }*/

}
