package com.ilcarro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCarPage extends BasePage{


    public AddCarPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[text()='Ok']")
    WebElement clickOk;
    public AddCarPage clickOk() {
        click(clickOk);
        return this;
    }


    @FindBy(css = ".navigation-link")
    WebElement CarWorkLink;
    public AddCarPage clickOnLetCarWorkLink() {
        click(CarWorkLink);
        return this;
    }

    @FindBy(id = "pickUpPlace")
    WebElement inputLocation;

    @FindBy(css = ".input-label")
    WebElement inputManufacture;

    @FindBy(id = "model")
    WebElement inputModel;

    @FindBy(id = "year")
    WebElement inputYear;

    @FindBy(id = "seats")
    WebElement inputSeats;

    @FindBy(id = "carClass")
    WebElement inputCarClass;

    @FindBy(id = "serialNumber")
    WebElement inputRegistration;

    @FindBy(id = "price")
    WebElement inputPrice;

    @FindBy(id = "about")
    WebElement inputAbout;
    public AddCarPage enterCarData(String location, String manufacture, String model , String year, String seats ,
                             String carClass, String registration , String price, String about) {
        type(inputLocation,location);
        type(inputManufacture,manufacture);
        type(inputModel,model);
        type(inputYear,year);
        type(inputSeats,seats);
        type(inputCarClass,carClass);
        type(inputRegistration,registration);
        type(inputPrice,price);
        type(inputAbout,about);
        return this;
    }

    @FindBy(id = "fuel")
    WebElement inputFuel;

    @FindBy(xpath = "//*[text()='Diesel']")
    WebElement diesel;

    @FindBy(xpath = "//*[text()='Petrol']")
    WebElement petrol;

    @FindBy(xpath = "//*[text()='Hybrid']")
    WebElement hybrid;

    @FindBy(xpath = "//*[text()='Electric']")
    WebElement electric;

    @FindBy(xpath = "//*[text()='Gas']")
    WebElement gas;

    public AddCarPage enterFuel(String[] fuel) {
        for (String s : fuel) {
            if (s.equals("Diesel")) {
                click(inputFuel);
                click(diesel);
            }
            if (s.equals("Petrol")) {
                click(inputFuel);
                click(petrol);
            }
            if (s.equals("Hybrid")) {
                click(inputFuel);
                click(hybrid);
            }
            if (s.equals("Electric")) {
                click(inputFuel);
                click(electric);
            }
            if (s.equals("Gas")) {
                click(inputFuel);
                click(gas);
            }

        }
        return this;

    }

    @FindBy(css = ".file-input-label")
    WebElement Pictures;

    public AddCarPage uploadPictures(String path) {
        Pictures.sendKeys(path);
        return this;
    }

    @FindBy(css = "[type='submit']")
    WebElement submit;
    public AddCarPage clickSubmit() {
        click(submit);
        return this;
    }

    @FindBy(xpath = "//h2[.='Volkswagen Golf added successful']")
    WebElement addMessage;

    public AddCarPage isAddSuccessMessage() {
        assert isElementDisplayed(addMessage);
        return this;
    }
}
