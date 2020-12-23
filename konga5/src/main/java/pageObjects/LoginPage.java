package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import setUp.setUps;

public class LoginPage extends setUps {

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    private WebDriver driver;
    private By Email = By.id("username");
    private By password = By.id("password");
    private By LoginButton = By.xpath("//button[contains(text(),'Login')]");
    private By companyLogo = By.xpath("//*[@id=\"app-content-wrapper\"]/nav/div[2]/div[1]/a[2]/picture/source[1]");
    private By forgotPassword = By.xpath("//*[@id=\"forgotPasswordLink\"]/a");
    private By loginPanel = By.xpath("//*[@id=" +"\"logInPanelHeading\"]");

    public void enterEmail(String uName){

        driver.findElement(Email).sendKeys(uName);
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
