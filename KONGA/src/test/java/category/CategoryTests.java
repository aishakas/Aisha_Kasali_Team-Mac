package category;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.LoginPage;

import java.util.concurrent.TimeUnit;

public class CategoryTests {

    //Create a WebDriver object
    private WebDriver driver;
    //Create a Login Object
    protected LoginPage loginPage;

    @BeforeClass
    public void setUpTests() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver1.exe");

        driver = new ChromeDriver();

        //get page url
        driver.get("https://www.konga.com/");
        Thread.sleep(5000);

        //maximize browser window
        driver.manage().window().maximize();

        //Make page wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    //Assert page title.
    @Test
    void PageTitle() {
        String title = driver.getTitle();
        Assert.assertEquals("title", "title");
    }

    @Test(priority = 0)
    void MyCartTest()
    {
        //Assert Mycart element
        WebElement MyCart = driver.findElement(By.xpath("/html/body/div[1]/div/section/div[3]/nav/div[2]/div/div[3]/a/span[1]"));
        Assert.assertEquals(MyCart.isDisplayed(),MyCart.isDisplayed());
    }

    @Test(priority = 1)
    void Store()
    {
        //Assert Store Locator  element
        WebElement Store = driver.findElement(By.xpath("/html/body/div[1]/div/section/div[3]/nav/div[2]/div/div[1]/a"));
        Assert.assertEquals(Store.isDisplayed(),Store.isDisplayed());
    }

    @Test(priority = 2)
    void Categories ()
    {
        //Assert Categories element.
        WebElement Categories = driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[3]/nav/div[3]/div/a[1]"));
        Assert.assertEquals(Categories.isDisplayed(),Categories.isDisplayed());
    }

    @Test(priority = 3)
    void Laptops ()
    {
        //Assert Laptops element.
        WebElement Laptops = driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/nav/div[3]/div/div[3]/ul/li[1]/a"));
        Assert.assertEquals(Laptops.isDisplayed(),Laptops.isDisplayed());
    }

    @Test(priority = 4)
    void MacBooks()
    {
        //Assert MacBooks element.
        WebElement MacBooks = driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/nav/div[3]/div/div[3]/ul/li[1]/a"));
        Assert.assertEquals(MacBooks.isDisplayed(),MacBooks.isDisplayed());
    }


    @AfterTest
    public void closeBrowser()
    {
        // quit/exit the session.
        driver.quit();
    }

}