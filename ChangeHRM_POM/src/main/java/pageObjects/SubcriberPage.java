package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SubcriberPage {
    public SubcriberPage(WebDriver driver) {
        this.driver =driver;
    }
    private WebDriver driver;
    private By SubcriberName= By.id("subcriber_name");
    private By SubcriberEmail = By.id("subcriber_email");
    private By SubcriberButton = By.id("btnSubcribe");
    private By DashboardPage = By.linkText("Dashboard");
    private By LogoutButton = By.id("");
    //private By SubcriberButton = By.id("btnSubcribe");
    public void username (String sName){
        driver.findElement(SubcriberName).sendKeys(sName);
    }
    public void email (String sEmail){
        driver.findElement(SubcriberEmail).sendKeys(sEmail);
    }
    public void
    clickSubscribeButton(){
        driver.findElement(SubcriberButton).click();
    }
    public DashboardPage clickLoginButton(){
        driver.findElement(DashboardPage).click();
        return new DashboardPage(driver);
    }
    public LoginPage clickLogout() {
        driver.findElement(LogoutButton).click();
        return new LoginPage(driver);
    }
}