package com.bdd.sample.steps.serenity;

import com.bdd.sample.pages.DictionaryPage;
import com.bdd.sample.pages.HomePageNew;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class EndUserStepsNew extends ScenarioSteps {

    HomePageNew homePage;
    
    @Step
    public void is_the_home_page() {
    	homePage.open();
    }
    
    @Step
    public void is_searching_for_product(String product) {
    	homePage.enter_product_keywords(product);
    }
    
    @Step
    public void is_verifying_for_product_page() {
    	homePage.verify_shoes_product_page();
    }
    

}