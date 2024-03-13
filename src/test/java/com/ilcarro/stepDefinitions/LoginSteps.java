package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.HomePage;
import com.ilcarro.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_scouse.An;

import static com.ilcarro.pages.BasePage.driver;

public class LoginSteps {

    @And("User clicks on Login link")
    public void clicks_on_Login_link() {
        new HomePage(driver).clickOnLoginLink();
    }

    @And("User enters valid data")
    public void enter_valid_data() {
        new LoginPage(driver).enterData("arm1020aleqsan@gm.cm", "1020Aleqsan$");
    }

    @And("User clicks on Yalla button")
    public void click_on_Yalla_button() {
        new LoginPage(driver).clickOnYallaButton();
    }

    @Then("User verifies Success message displayed")
    public void verify_Success_message(){
        new LoginPage(driver).isSuccessMessageDisPlayed();
    }

    @And("User enters valid email and invalid password")
    public void enters_valid_email_invalid_password(DataTable dataTable) {
        new LoginPage(driver).enterInvalidPassword(dataTable);
    }


    @Then("User verifies Error message displayed")
    public void verify_Error_message(){
        new LoginPage(driver).isErrorDisplayed();
    }
}

