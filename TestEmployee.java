package ntech.com.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class TestEmployee {

	
	///test method
	
	@Test
	public void testSave() {
		System.out.println("hello form test ..");
	}
	
	@Test
	@AfterEach
	public void testGetAll() {
		System.out.println("after each");
	}
	
	
	public void testDriver() {
		System.out.println("driver Tested ...");
	}
}
