package StepDefinition;

import org.junit.Assert;
import pages.LoginPage;
import setup.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions extends Setup {

    LoginPage loginPage;

    @Given("User visited the portal")
    public void user_visited_the_portal() {
        driver.get("https://opensource-demo.orangehrmlive.com/");

    }
    @When("User inputs valid {string} and {string}")
    public void user_inputs_valid_username_and(String username, String password) {
       loginPage=new LoginPage(driver);
        loginPage.doLogin(username,password);
    }
//    @Then("User can see dashboard")
//    public void user_can_see_dashboard() {
//      String url=  driver.getCurrentUrl();
//        Assert.assertTrue(url.contains("dashboard"));
//    }

    @Then("User can see Error Message")
    public void user_can_see_error_message(){
        Assert.assertTrue(loginPage.lblValidationError.getText().contains("Invalid credentials"));
        driver.close();
    }

}
