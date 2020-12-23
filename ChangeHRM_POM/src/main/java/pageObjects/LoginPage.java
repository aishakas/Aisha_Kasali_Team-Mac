package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import setUp.setUps;

public class LoginPage extends setUps {
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    private WebDriver driver;
    private By username = By.id("txtUsername");
    private By password = By.id("txtPassword");
    private By LoginButton = By.name("Submit");
    private By companyLogo = By.xpath("//*[@id=\"divLogo\"]/img");
    private By forgotPassword = By.xpath("//*[@id=\"forgotPasswordLink\"]/a");
    private By loginPanel = By.xpath("//*[@id=" +"\"logInPanelHeading\"]");
    public void enterUsername(String uName){
        driver.findElement(username).sendKeys(uName);
    }
    public void enterPassword(String pwd){
        driver.findElement(password).sendKeys(pwd);
    }
    public DashboardPage clickLoginButton(){
        driver.findElement(LoginButton).click();
        return new DashboardPage(driver);
    }
    public void verifyCompanyLogo(){
        driver.findElement(companyLogo).isDisplayed();
    }
    public void verifyForgotPassword (){
        driver.findElement(forgotPassword).isDisplayed();
    }
    public void verifyLoginPanel(){
        driver.findElement(loginPanel).isDisplayed();
    }
}