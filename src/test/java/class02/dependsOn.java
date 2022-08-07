package class02;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class dependsOn {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("I am before Suite");
    }
    @Test
    public void login(){
        System.out.println("I have looged in succesfully");
        // fail the text case
      // System.out.println(0/0);
    }

    @Test(dependsOnMethods = "login")
    public  void verificationOfDashBoardPage(){
        System.out.println("I am on dashboear page");


    }
}
