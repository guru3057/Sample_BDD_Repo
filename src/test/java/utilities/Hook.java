package utilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import io.cucumber.java.Scenario;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.Properties;


public class Hook {

    public static WebDriver driver;
    public TestContext context=TestContext.getInstance();
    public Properties properties=ReadProperties.getProperties();

    @Before(order = 1)
    public void launchBrowser(Scenario scenario){
        switch (properties.getProperty("BROWSER")){
           case "chrome" :
           default:
              System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"browser_drivers"+File.separator+"chromedriver.exe");
              driver = new ChromeDriver();
              break;

        }
        driver.get(properties.getProperty("URL"));
        driver.manage().window().maximize();
        context.setDriver(driver);
    }

    @After
    public void destroyDriver(Scenario scenario) {
        context.getDriver().quit();
    }


}
