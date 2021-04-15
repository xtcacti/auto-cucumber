package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

public class LoginSteps_POM {
    WebDriver driver = null;
    LoginPage loginPage;

    @Given("POM - browser is open")
    public void browser_is_open(){
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Given("POM - user is on login page")
    public void user_is_on_login_page() {
        driver.navigate().to("https://example.testproject.io/web/");
    }

    @When("^POM - user enters (.+) and (.+)$")
    public void user_enters_username_and_password(String username, String password) {
        loginPage = new LoginPage(driver);
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @When("POM - clicks on login button")
    public void clicks_on_login_button() {
        loginPage.clickLogin();
    }

    @Then("POM - user is navigated to the homw page")
    public void user_is_navigated_to_the_homw_page() {
        loginPage.checkLogoutDisplayed();
    }
}
