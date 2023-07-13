package testng; //package//

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPage { //class//
	
	//@BeforeSuite,@BeforeTest,@BeforeClass,@BeforeMethod,@Test,@AfterMethod,@AfterClass,@AfterTest,@AfterSuite//
	
	@BeforeSuite
	
	void beforeSuite() { //Method//
		
		System.out.println("Before Suite");
	}
	
	@BeforeTest
	
	 void beforeTest() {
		System.out.println("Before Test");
	}
	
	@BeforeClass
	
	 void beforeClass() {
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	
	void beforeMethod() {
		System.out.println("Before Method");
	}
	
	@Test  //create 1-3 Test Cases//
	
	void test1() {
		System.out.println("Test-1");
	}
	
	@Test
	
	void test2() {
		System.out.println("Test-2");
	}
	
	@Test
	
	void test3() {
		System.out.println("Test-3");
	}
	
	@AfterMethod
	
	 void afterMethod() {
		System.out.println("After Method");
	}
	
	@AfterClass
	
	void afterClass() {
		System.out.println("After Class");
	}

   @AfterTest
   
   void afterTest() {
	   System.out.println("After Test");
   }
   
   @AfterSuite
   
   void afterSuite() {
	   System.out.println("After Suite");
   }
}

