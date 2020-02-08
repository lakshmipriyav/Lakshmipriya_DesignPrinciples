import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void test() {
		Operation c= new Operation();
		assertEquals(2,c.add(1,1));
	}
	@Test
	void test1() {
		Operation c= new Operation();
		assertEquals(0,c.sub(1,1));
	}
	@Test
	void test2() {
		Operation c= new Operation();
		assertEquals(1,c.mul(1,1));
	}
	@Test
	void test3() {
		Operation c= new Operation();
		assertEquals(1,c.div(1,1));
	}
	@Test
	void test4() {
		Operation c= new Operation();
		assertEquals(0,c.mod(1,1));
	}

}
