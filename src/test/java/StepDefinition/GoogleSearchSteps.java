package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleSearchSteps {
    WebDriver driver = null;

    @Given("browser is open")
    public void browser_is_open() {
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @And("user is on google search page")
    public void user_is_on_google_search_page() throws InterruptedException {
        driver.get("https://www.baidu.com");
    }

    @When("user enters a text in search box")
    public void user_enters_a_text_in_search_box() {
        driver.findElement(By.name("wd")).sendKeys("Antomation Step by Step");
    }

    @And("hits enter")
    public void hits_enter() {
        driver.findElement(By.name("wd")).sendKeys(Keys.ENTER);
    }

    @Then("user is navidated to the search results")
    public void user_is_navidated_to_the_search_results() {
        driver.getPageSource().contains("Step");
        driver.close();
        driver.quit();
    }
}
