package setUp;
import org.testng.annotations.Test;
import setUp.setUps;
public class setUpTests extends setUps {
    @Test(priority = 0)
    public void testsetUp (){
        String pageURL ="https://opensource-demo.orangehrmlive.com/";
        if (pageURL.equalsIgnoreCase("https://opensource-demo.orangehrmlive.com/xxx")){
            System.out.println("The website URL is "+ pageURL);
        } else{
            System.out.println("Invalid URL,Actual URL is "+ pageURL);
        }
    }
}