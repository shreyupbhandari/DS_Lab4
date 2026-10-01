import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


class StackTest
{

	MyStack<String> stack;
	
	@BeforeEach
	void setUp() throws Exception
	{
		stack =new MyStack<>();
		assertNotNull(stack);
	}

	@Test 
	void pushAndPopTest()
	{
		assertThrows(StackUnderFlowException.class,
				()->{
					stack.pop();
					});
		stack.push("10");
		assertEquals("10",stack.pop());
		assertTrue(stack.isEmpty());
		stack.push("10");
		stack.push("20");
		assertEquals("20",stack.pop());
		assertEquals("10",stack.pop());
		assertTrue(stack.isEmpty());
		
		
	}
	
	@Test 
	void isEmptyTest()
	{
		assertTrue(stack.isEmpty());
		stack.push("10");
		assertTrue(!(stack.isEmpty()));
	}
	
	@Test 
	void top()
	{
		stack.push("30");
		assertEquals("30",stack.top());
		assertTrue(!(stack.isEmpty()));
	}
	
	
}
