package class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testAnnotationExample {
    //go to facebook.com
    //enter the password
    //enter the username
    //click login
    //make sure the text facebook help is there
    public static WebDriver driver;
    @Test
    public void AtestingForInvalidCredentials() {

        //entering the password and username, then cliking on login
        //  driver.findElement(By.id("email")).sendKeys("syntax@adfasdfasf.com");
        //  driver.findElement(By.id("pass")).sendKeys("whatever");
        //  driver.findElement(By.name("login")).click();
        String text = driver.findElement(By.xpath("//h2")).getText();
        if (text.equals("Connect with friends and the world around you on Facebook.")) {
            System.out.println("succesfull");
        } else {
            System.out.println("failed");
        }

    }

    // go to fb.com
    // m ake sure create account text is there
    @Test
    public void createAccountText() {

        //seting up the Webdriver

        String text = driver.findElement(By.linkText("Create new account")).getText();

        if (text.equals("Create new account")) {
            System.out.println("success");
       } else {
            System.out.println("failure");
        }
    }
@BeforeMethod
    public  void settingupBrowser(){
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.get("https://fb.com");
}
@AfterMethod
   public void quitingTheBrowser(){
      driver.quit();
}
}