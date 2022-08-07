package class03;

import org.testng.annotations.*;

public class Annotations {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("I am before Suite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("I am after Suite");
    }
    @BeforeTest
    public void beforeTest() {
        System.out.println("I am before Test");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("I am before class");
    }

    @Test
    public void Atest() {
        System.out.println("I am Atest");
    }

    @Test
    public void Btest() {
        System.out.println("I am Btest");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("I am after class");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("I am after Test");
    }
}