package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage extends BasePage{
    @FindBy(id = "logout")
    private WebElement logoutButton;

    public ContactPage(WebDriver driver) {
        super(driver);
    }
    public void clickLogoutButton() {

        logoutButton.click();
    }
}
