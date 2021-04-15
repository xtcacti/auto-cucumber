package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @ClassName LoginSteps
 * @Description TODO
 * @Author 15735
 * @Date 2021/4/14 14:45
 * @Version 1.0
 */
public class LoginSteps {
    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("1");
    }

    @When("^user enters (.+) and (.+)$")
    public void user_enters_username_and_password(String username,String password) {
        System.out.println("2");
    }

    @When("clicks on login button")
    public void clicks_on_login_button() {
        System.out.println("3");
    }

    @Then("user is navidated to the homw page")
    public void user_is_navidated_to_the_homw_page() {
        System.out.println("4");
    }
}
