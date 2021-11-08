package utilities;

import org.openqa.selenium.WebDriver;

public class TestContext {
    public static TestContext TESTCONTEXT=null;
    private WebDriver driver;
    private TestContext(){

    }
    public static TestContext getInstance(){
        if(TESTCONTEXT==null)
            TESTCONTEXT=new TestContext();
        return TESTCONTEXT;
    }


    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
}
