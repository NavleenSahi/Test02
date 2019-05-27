import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestingFare {
	
	Fare f = new Fare();

	
	//R1
	@Test
	void test() {
		
		String[] from1 = new String[] {"Leslie"};
		String[] to1 = new String[] {"Don Mills"};
		
		Double fare = f.calculateTotal(from1,to1);
		assertEquals(2.5,fare,0.0);
	}
	
	
	//R2
	@Test
	void test1() {
		String[] from1 = new String[] {"Sheppard"};
		String[] to1 = new String[] {"Finch Station"};
		
		Double fare =f.calculateTotal(from1,to1);
		assertEquals(3.0,fare,0.0);
	}
	
	
	//R3
	@Test
	void test2() {
		String[] from1 = new String[] {"Don Mills"};
		String[] to1 = new String[] {"Finch Station"};
		
		Double fare = f.calculateTotal(from1,to1);
		assertEquals(3.0,fare,0.0);
	}
	
	//R4
		@Test
		void test3() {
			String[] from1 = new String[] {"Don Mills"};
			String[] to1 = new String[] {"Finch"};
			String[] from2 = new String[] {"Leslie"};
			String[] to2 = new String[] {"Don Mills"};
			
			Double fare = f.calculateTotal(from1, to2);
			assertEquals(5.50,fare,0.0);
			
		}
}
