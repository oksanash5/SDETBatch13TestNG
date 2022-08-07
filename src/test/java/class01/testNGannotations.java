package class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNGannotations {
    // writing down my first test case
    @Test // Test annotation is used to indicate that this is a tast case
    public void firstTestCase() {
        System.out.println("heyy! I am a first test case");

    }
  // writing  down another test case
    @Test(groups = "smoke")
    public void secondTestCase() {
        System.out.println("heyy! I am a second test case");


    }
   @Test
    public void thirdTestCase(){
       System.out.println("heyy! I am a third test case");
   }
@BeforeMethod
    public void beforeMethod(){
    System.out.println("heyy! I am a before method");
}
@AfterMethod
    public void afterMethod(){
    System.out.println("heyy! I am a after method");
}
}