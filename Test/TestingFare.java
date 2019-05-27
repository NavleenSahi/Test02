import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestingFare {

	@Test
	void test() {
		
		String[] from1 = new String[] {"Leslie"};
		String[] to1 = new String[] {"Don Mills"};
		
		Fare f = new Fare();
		Double fare = f.calculateTotal(from1,to1);
		assertEquals(2.5,fare,0.0);
	}

}
