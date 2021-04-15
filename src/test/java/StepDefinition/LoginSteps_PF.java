package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pagefactory.HomePage_PF;
import pagefactory.LoginPage_PF;

public class LoginSteps_PF {
    WebDriver driver = null;
    LoginPage_PF loginPage;
    HomePage_PF homePage;

    @Given("PF - browser is open")
    public void browser_is_open() {
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Given("PF - user is on login page")
    public void user_is_on_login_page() {
        loginPage = new LoginPage_PF(driver);
        driver.navigate().to("https://example.testproject.io/web/");
    }

    @When("^PF - user enters (.+) and (.+)$")
    public void user_enters_username_and_password(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @When("PF - clicks on login button")
    public void clicks_on_login_button() {
        loginPage.clickLogin();
    }

    @Then("PF - user is navigated to the homw page")
    public void user_is_navigated_to_the_homw_page() {
        homePage = new HomePage_PF(driver);
        homePage.checkLogoutDisplayed();
    }
}
