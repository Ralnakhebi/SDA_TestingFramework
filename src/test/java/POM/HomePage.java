package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage{
    @FindBy(id = "add-contact")
    private WebElement addContactButton;
    //logout
    @FindBy(id = "logout")
    private WebElement logoutButton;
    @FindBy(xpath = "//tr[@class='contactTableBodyRow']")
    private List<WebElement> viewContacts;

    public HomePage(WebDriver driver) {
        super(driver);
    }
    public void clickAddContactButton() {

        addContactButton.click();
    }
    public void clickLogoutButton() {

        logoutButton.click();
    }

    public void clickToViewContact(int contactRow){
        viewContacts.get(contactRow).click();
    }

}
