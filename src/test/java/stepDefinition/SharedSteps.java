package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;

public class SharedSteps {

    private WebDriver driver;

    @Before
    public void setup(Scenario scenario) {
        // Set up WebDriver
        System.setProperty("webdriver.chrome.driver", "D:\\Java eclipse workspace\\Phase4-Cucumber\\drivers\\windows\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        //Browser close
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }
}