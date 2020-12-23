package Login;

import SetUp.SetUpTests;
import org.testng.annotations.Test;
import pageObject.DashboardPage;
import pageObject.LoginPage;

public class LoginTests  extends SetUpTests {
    //TestNG annotation
    @Test
    public void testLogin() throws InterruptedException{
        String username = "kasali_aisha";
        loginPage.enterUsername(username);
        loginPage.enterUserPassword("@Aishak28262");
        DashboardPage dashboardPage = loginPage.clickLoginBtn();
        dashboardPage.clickWelcomeAdmin();
        loginPage = dashboardPage.clickLogout();
    }
}