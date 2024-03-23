package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import POM.LoginPage;
import utilities.TestBase;

public class LoginPageTest extends TestBase {

    @Test
    public void test(){
        LoginPage loginPage= new LoginPage();

        loginPage.enterUsername("");
        loginPage.enterUsername("");
        loginPage.clickLoginButton();
    }
}