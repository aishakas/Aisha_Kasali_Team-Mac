package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class DashboardPage {
    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }
    private WebDriver driver;
    private By welcome= By.id("welcome");
    private By logoutButton = By.linkText("Logout");
    private By SubcribeButton = By.id("Subscriber_Link");
    public void clickwelcome (){
        driver.findElement(welcome).click();
    }
    public LoginPage clickLogout(){
        driver.findElement(logoutButton).click();
        return new LoginPage(driver);
    }
    public SubcriberPage clickSubcribe (){
        driver.findElement(SubcribeButton).click();
        return new SubcriberPage(driver);
    }
}