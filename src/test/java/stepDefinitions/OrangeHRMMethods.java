package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import pageObjects.OrangeHRMPageObjects;
import utilities.TestContext;


public class OrangeHRMMethods extends OrangeHRMPageObjects {
    public static WebDriver driver;

    public OrangeHRMMethods(){
        super(TestContext.getInstance().getDriver());
        driver=TestContext.getInstance().getDriver();
    }

    public void EnterUserCredentials(String email, String password) {
        userName.sendKeys(email);
        passWord.sendKeys(password);

    }

    public  void loginIntoApp(){
        loginBtn.click();
    }
    public void verifyOrangeTitle(){
        String actualTitle = driver.getTitle();
        System.out.println("Title Name is "+actualTitle);
        String expectedTitle = "OrangeHRM";
        Assert.assertEquals("Condition true", actualTitle, expectedTitle);
    }
    public  void enterSystemUsers(String systemUsername, String employeeName){
        systemUserName.sendKeys(systemUsername);
        systemEmployeeName.sendKeys(employeeName);
    }
    public void navigateToAdmin(){
        adminTab.click();
    }
    public  void  clickSearchBtn(){
        searchBtn.click();
    }

}
