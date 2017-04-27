package com.bdd.sample.pages;

import ch.lambdaj.function.convert.Converter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.FindElement;

import net.thucydides.core.pages.PageObject;

import java.util.List;

import static ch.lambdaj.Lambda.convert;

@DefaultUrl("http://www.etsy.com")
public class HomePageNew extends PageObject {
	
	@FindBy(id="search-query")
    private WebElementFacade searchText;
	
	/*@FindBy(xpath="//*[@id='gnav-search']/div/div[2]/button") 
    private WebElementFacade searchbutton;*/
	
	@FindBy(xpath="//*[@id='search-bar']/div/div[2]/button") 
    private WebElementFacade searchbutton;
	
	@FindBy(xpath="//*[@id='content']/div/div/div[2]/div/h4")
    private WebElementFacade shoelandingpage;

    
    public void enter_product_keywords(String keyword) {
    	searchText.type(keyword);
    	searchbutton.click();
    }
    
    public void verify_shoes_product_page() {
    	shoelandingpage.isPresent();
    }
    
    
    public void search_product(String keyword) {
    	searchText.type(keyword);
    }

}