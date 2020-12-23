package setUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObjects.LoginPage;

import java.util.concurrent.TimeUnit;

public class setUps {
    protected LoginPage loginPage;

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    //Create a webdriver object
    private WebDriver driver;

    @BeforeTest
    public void setUp() {
        //importance of a chromedriver
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver1.exe");

        //instantiate a webdriver
        driver = new ChromeDriver();

        //maximize window size
        driver.manage().window().maximize();

        //lauch the application URL
        driver.get("https://www.konga.com/");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        //Instantiate login page after launching the browser
        loginPage = new LoginPage(driver);
    }

    /*@AfterTest
    public void cleanup(){
        driver.manage().deleteAllCookies();
    }*/
    @AfterTest
    public void closeBrowser(){

        driver.quit();
    }
}

