package com.ilcarro.stepDefinitions;
import com.ilcarro.pages.AddCarPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


import static com.ilcarro.pages.BasePage.driver;

public class AddCarSteps {

    @And("User click on OK button")
    public void click_on_OK_button() {
        new AddCarPage(driver).clickOk();
    }

    @And("User clicks on Let the car work link")
    public void click_on_Let_car_work_link() {
        new AddCarPage(driver).clickOnLetCarWorkLink();
    }

    @And("User enters valid data via car")
    public void enter_valid_data_via_car() {
        new AddCarPage(driver).enterCarData("Tel Aviv, Israel","Volkswagen",
                "Golf","2000","5","Sedan","233536576",
                "500","very good auto");
    }

    @And("User enters valid data fuel")
    public void enter_valid_data_fuel(){
        new AddCarPage(driver).enterFuel(new String[]{""});
    }

    @And("User upload pictures")
    public void upload_pictures() {
        new AddCarPage(driver).uploadPictures("\"C:/Tools/auto.jpg\"");
    }

    @And("User click button submit")
    public void click_button_submit() {
        new AddCarPage(driver).clickSubmit();
    }


    @Then("User verifies AddSuccess message displayed")
    public void verifies_AddSuccess_message() {
        new AddCarPage(driver).isAddSuccessMessage();
    }


}
