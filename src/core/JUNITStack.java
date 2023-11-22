package core;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUNITStack {



	@Test
	public void testCreateNewEmptyStack() {
		
		Stack s1 = new Stack();
		int size = s1.getSize();
		
		assertEquals(0, size);
		assertTrue(s1.isEmpty());
	}
	
	@Test
	public void TestPushElementtoTop() {
		
		Stack s2 = new Stack();
		assertTrue(s2.isEmpty());
		s2.push(1 );
	
		
		
		assertEquals(1, s2.top());
	}
	
	@Test
	public void testLastInFirstOut() {
		Stack s3 = new Stack();
		
		s3.push(1);
		s3.push(2);
		s3.push(3);

		assertEquals(3, s3.pop());
		assertEquals(2, s3.pop());
		assertEquals(1, s3.pop());

		 
		
		


	
	}

	
}
