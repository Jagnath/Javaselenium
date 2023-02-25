package TestNG;

import org.testng.annotations.*;

public class Annotation {
  @BeforeSuite
      public void beforeSuite(){
          System.out.println("before suite");
      }
      @AfterSuite
    public void afterSuite(){
          System.out.println("after suite");
      }
      @BeforeClass
    public void beforeClass(){
          System.out.println("before class");
      }
      @AfterClass
    public void afterClass(){
          System.out.println("after class");
      }
      @BeforeTest
    public void beforeTest(){
          System.out.println("before test");
      }
      @AfterTest
    public void afterTest(){
          System.out.println("after test");
      }
      @BeforeMethod
    public void beforeMethod(){
          System.out.println("before method");
      }
      @AfterMethod
    public void afterMethod(){
          System.out.println("after method");
      }
      @Test
    public void Test(){
          System.out.println("test");
      }
  }

