package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddContactPage extends BasePage {

    @FindBy(id = "firstName")
    private WebElement firstName;
    @FindBy(id = "lastName")
    private WebElement lastName;
    @FindBy(id = "birthdate")
    private WebElement birthdate;
    @FindBy(id = "email")
    private WebElement email;
    @FindBy(id = "city")
    private WebElement city;
    @FindBy(id = "stateProvince")
    private WebElement stateProvince;
    @FindBy(id = "postalCode")
    private WebElement postalCode;
    @FindBy(id = "country")
    private WebElement country;
    @FindBy(id = "phone")
    private WebElement phone;
    @FindBy(xpath = "//input[@id='street1']")
    private WebElement street1;
    @FindBy(xpath = "//input[@id='street2']")
    private WebElement street2;
    @FindBy(xpath = "//button[@id='submit']")
    private WebElement submit;
    @FindBy(xpath = "//button[@id='cancel']")
    private WebElement cancel;
    @FindBy(id = "logout")
    private WebElement logoutButton;
    public AddContactPage(WebDriver driver) {
        super(driver);
    }
    public void enterFirstName(String firstName) {
        this.firstName.sendKeys(firstName);

    }
    public void enterLastName(String lastName) {
        this.lastName.sendKeys(lastName);

    }
    public void enterBirthDate(String birthdate) {
        this.birthdate.sendKeys(birthdate);

    }
    public void enterEmail(String email) {
        this.email.sendKeys(email);

    }
    public void enterCity(String city) {
        this.city.sendKeys(city);

    }
    public void enterStateProvince(String stateProvince) {
        this.stateProvince.sendKeys(stateProvince);

    }
    public void enterPostalCode(String postalCode) {
        this.postalCode.sendKeys(postalCode);

    }
    public void enterCountry(String country) {
        this.country.sendKeys(country);

    }
    public void enterPhone(String phone) {
        this.phone.sendKeys(phone);

    }
    public void enterStreet1(String street1) {
        this.street1.sendKeys(street1);

    }
    public void enterStreet2(String street2) {
        this.street2.sendKeys(street2);

    }
    public void clickSubmitButton() {

        submit.click();
    }

    public void clickCancelButton() {

        cancel.click();
    }
    public void clickLogoutButton() {

        logoutButton.click();
    }

}
