package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.ilcarro.pages.BasePage.driver;

public class HomePageSteps {

    @Given("User launches Chrome Browser")
    public void launches_Chrome_Browser() {
        new HomePage(driver).launchBrowser();
    }

    @When("User opens ilcarro Main Page")
    public void User_opens_ilcarro_Main_Page() {
        new HomePage(driver).openUrl();
    }

    @Then("User verifies Main Page title is displayed")
    public void verify_Main_Page_title() {
        new HomePage(driver).isHomePageTitleDisplayed();
    }

    @And("User quites browser")
    public void User_quites_browser() {
        new HomePage(driver).quit();
    }
}
