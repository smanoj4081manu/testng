package testnglearning;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
/*
import junit.framework.Assert;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
*/

public class NewTest {
	

	@Parameters({"MyName"})
	@Test(groups={"unit"})
	public void aUnitTest(String MyName) throws InterruptedException{
		System.out.println("A Unit Test executing on thread with Id : " + Thread.currentThread().getId() + " by " + MyName);
		Thread.sleep(20);
		}
	
	
	@Parameters({"MyName"})
	@Test(groups={"functional"})
	public void bFunctionalTest(String MyName) throws InterruptedException{
		System.out.println("B Functional Test executing on thread with Id : " + Thread.currentThread().getId() + " by " + MyName);
		Thread.sleep(20);
		}
	

	@Parameters({"MyName"})
	@Test(groups={"unit"})
	public void cUnitTest(String MyName) throws InterruptedException{
		System.out.println("C Unit Test executing on thread with Id : " + Thread.currentThread().getId() + " by " + MyName);
		Thread.sleep(20);
		}
	
	
	@Parameters({"MyName"})
	@Test(groups={"functional"})
	public void dFunctionalTest(String MyName) throws InterruptedException{
		System.out.println("D Functional Test executing on thread with Id : " + Thread.currentThread().getId() + " by " + MyName);
		Thread.sleep(20);
		}
  
  /*
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class 1");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class 1");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test 1");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test 1");
  }

  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method 1");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method 1");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suite 1");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suite 1");
  }

  @BeforeGroups
  public void beforeGroups() {
	  System.out.println("Before Group 1");
  }

  @AfterGroups
  public void afterGroups() {
	  System.out.println("After Group 1");
  }

*/

}
