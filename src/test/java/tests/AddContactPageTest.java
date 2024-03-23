package tests;
import POM.ContactPage;
import org.junit.Test;
import utilities.TestBase;

public class AddContactPageTest extends TestBase {


    @Test
    public void AddValidContactInfo(){

        ContactPage contactPage=new ContactPage(driver);
        contactPage.clickLogoutButton();
    }
}
