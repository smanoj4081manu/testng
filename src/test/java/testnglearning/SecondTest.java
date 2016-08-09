package testnglearning;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SecondTest {

	@Parameters({ "MyName" })
	@Test(groups = { "functional" })
	public void wFunctionalTest(String MyName) throws InterruptedException {
		System.out.println("W Functional Test executing on thread with Id : " + Thread.currentThread().getId() + " by " + MyName);
		Thread.sleep(20);
	}

	@Parameters({ "MyName" })
	@Test(groups = { "unit" })
	public void xUnitTest(String MyName) throws InterruptedException {
		System.out.println("X Unit Test executing on thread with Id : " + Thread.currentThread().getId() + " by " + MyName);
		Thread.sleep(20);
	}

	@Parameters({ "MyName" })
	@Test(groups = { "functional" })
	public void yFunctionalTest(String MyName) throws InterruptedException {
		System.out.println("Y Functional Test executing on thread with Id : " + Thread.currentThread().getId() + " by " + MyName);
		Thread.sleep(20);
	}

	@Parameters({ "MyName" })
	@Test(groups = { "functional" })
	public void zFunctionalTest(String MyName) throws InterruptedException {
		System.out.println("Z Functional Test executing on thread with Id : " + Thread.currentThread().getId() + " by " + MyName);
		Thread.sleep(20);
	}
	
}
