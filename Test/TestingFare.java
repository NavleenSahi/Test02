import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestingFare {
	
	Fare f = new Fare();

	@Test
	void test() {
		
		String[] from1 = new String[] {"Leslie"};
		String[] to1 = new String[] {"Don Mills"};
		
		Double fare = f.calculateTotal(from1,to1);
		assertEquals(2.5,fare,0.0);
	}
	
	@Test
	void test1() {
		String[] from1 = new String[] {"Sheppard"};
		String[] to1 = new String[] {"Finch Station"};
		
		Double fare =f.calculateTotal(from1,to1);
		assertEquals(3.0,fare,0.0);
	}

}
