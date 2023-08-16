import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class addition {
	public int add(int x, int y) 
	{
		return x+y;
		
	}
	
	@Test
	void test() {
		
		assertEquals(4, add(2,2));
	}

}
