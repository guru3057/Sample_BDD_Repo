package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMPageObjects {

    @FindBy(id = "txtUsername")
    public WebElement userName;

    @FindBy(id = "txtPassword")
    public WebElement passWord;

    @FindBy(id = "btnLogin")
    public WebElement loginBtn;

    @FindBy(id = "searchSystemUser_userName")
    public WebElement systemUserName;

    @FindBy(id = "searchSystemUser_employeeName_empName")
    public WebElement systemEmployeeName;

    @FindBy(id = "searchBtn")
    public WebElement searchBtn;

    @FindBy(id = "menu_admin_viewAdminModule")
    public WebElement adminTab;

    @FindBy(xpath = "//*[@id=\"searchSystemUser_userType\"]/option")
    public WebElement userRoleList;

    @FindBy(xpath = "searchSystemUser_userType")
    public WebElement userType;


    public OrangeHRMPageObjects(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

}


