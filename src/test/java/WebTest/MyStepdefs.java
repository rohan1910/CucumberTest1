package WebTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class MyStepdefs extends Utils {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    SoftAssert softAssert = new SoftAssert();

    @Given("^User is on homepage$")
    public void userIsOnHomepage(){

    }

    @When("^User enters log in details$")
    public void userEntersLogInDetails() {
        loginPage.user_fills_out_login_details();
    }

    @Then("^User should be able to log in successfully$")
    public void userShouldBeAbleToLogInSuccessfully() {
        String expected_message = "Tableau de bord";
        String actual_message = get_text_from_Web_element(By.xpath("//div[@class=\"box\"]/div[@class=\"head\"]/h1"));
        System.out.println(actual_message);
//        assert_equals(expected_message,actual_message,"Test case failed");
        softAssert.assertEquals(expected_message,actual_message,"Test case failed");
        softAssert.assertAll();

    }

    @Given("^User is logged in$")
    public void userIsLoggedIn()  {
        loginPage.user_fills_out_login_details();
        userShouldBeAbleToLogInSuccessfully();


    }
}
