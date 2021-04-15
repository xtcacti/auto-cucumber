package StepDefinition;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pagefactory.HomePage_PF;
import pagefactory.LoginPage_PF;

public class LoginSteps_Hooks {
    WebDriver driver = null;
    LoginPage_PF loginPage;
    HomePage_PF homePage;

    @Before
    public void browser_is_open() {
        System.out.println("=========Beofre=========");
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void teardown(){
        System.out.println("=========After=========");
        driver.close();
        driver.quit();
    }

    @Given("Hooks -user is on login page")
    public void user_is_on_login_page() {
        loginPage = new LoginPage_PF(driver);
        driver.navigate().to("https://example.testproject.io/web/");
    }

    @When("^Hooks -user enters (.+) and (.+)$")
    public void user_enters_username_and_password(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @When("Hooks -clicks on login button")
    public void clicks_on_login_button() {
        loginPage.clickLogin();
    }

    @Then("Hooks -user is navigated to the homw page")
    public void user_is_navigated_to_the_homw_page() {
        homePage = new HomePage_PF(driver);
        homePage.checkLogoutDisplayed();
    }
}
