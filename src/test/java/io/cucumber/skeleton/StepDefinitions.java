package io.cucumber.skeleton;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitions {
    @Given("I have {int} cukes in my belly")
    public void I_have_cukes_in_my_belly(int cukes) {
        
        WebDriverManager.chromedriver().setup();
//         WebDriverManager.firefoxdriver().setup();
//         System.setProperty("webdriver.gecko.driver", System.getenv("GECKOWEBDRIVER") + "\\geckodriver.exe");
        ChromeOptions options = new ChromeOptions();
options.addArguments("--no-sandbox");
options.addArguments("--disable-dev-shm-usage");
// options.addArguments("--headless");
        
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com");
        
        Belly belly = new Belly();
        belly.eat(cukes);
    }
}
