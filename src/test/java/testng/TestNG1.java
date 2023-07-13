package testng; //package//

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG1 { //class//
	
	//@BeforeSuite,BeforeTest,BeforeClass,BeforeMethod,Test,AfterMethod,AfterClass,AfterTest,AfterSuite//
	
	
	@BeforeMethod
	
	 void beforeMethod() {
		System.out.println("Before Method");
	}
     @Test
     
     void test1() {
    	 System.out.println("Test 1-perform");
     }
     
     @Test
     
     void test2() {
    	 System.out.println("Test-2 perform");
     }
     
     @Test
     
     void test3() {
    	 System.out.println("Test-3 perform");
    	 
     }
     
     @AfterMethod
     
     void afterMethod() {
    	 System.out.println("After Method");
     }
}
