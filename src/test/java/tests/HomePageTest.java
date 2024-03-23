package tests;

import POM.HomePage;
import org.junit.Test;
import utilities.TestBase;

public class HomePageTest extends TestBase {

    @Test
    public void viewFirstContact(){
        HomePage homePage=new HomePage(driver);

        homePage.clickToViewContact(0);
    }
}
