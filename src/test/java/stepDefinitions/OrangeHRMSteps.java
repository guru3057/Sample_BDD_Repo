package stepDefinitions;

import io.cucumber.java.en.*;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.TestContext;

import java.util.List;
import java.util.Map;


public class OrangeHRMSteps {
    WebDriver driver;
    OrangeHRMMethods orangeHRMMethods = new OrangeHRMMethods();

    public OrangeHRMSteps() {
        this.driver = TestContext.getInstance().getDriver();
    }

    @When("Admin login into Orange HRM")
    public void loginIntoOrangeHRM(List<Map<String, String>> UserCredentials) {
        orangeHRMMethods.EnterUserCredentials(UserCredentials.get(0).get("username"), UserCredentials.get(0).get("Password"));
        orangeHRMMethods.loginIntoApp();
    }

    @And("Admin navigates to Orange HRM homepage and verifies logo")
    public void i_opened_orange_hrm_home_page() {
        orangeHRMMethods.verifyOrangeTitle();

    }

    @And("Admin navigates to Admin tab")
    public void adminNavigatesToAdminTab() {
        orangeHRMMethods.navigateToAdmin();

    }

    @And("Admin search for system users")
    public void adminSearchForSystemUsers(List<Map<String, String>> SystemUsers) {
        orangeHRMMethods.enterSystemUsers(SystemUsers.get(0).get("systemUsername"), SystemUsers.get(0).get("Employee Name"));
        orangeHRMMethods.clickSearchBtn();
    }
}
