package class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class myTestSyntax {
    @Test
    public void loginToSyntax(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        // optimum security
        driver.findElement(By.cssSelector("a#continue-with-click")).click();
        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginButoon=driver.findElement(By.xpath("//input[@value='LOGIN']"));
        loginButoon.click();
    }
}
