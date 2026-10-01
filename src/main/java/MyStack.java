public class MyStack<T>
{
	public class Node<T>
	{
		T val;
		Node<T> next;
		
		public Node(T val, Node<T> node)
		{
			this.val=val;
			next=node;
		}
	}
	Node<T> head = null;
	public MyStack()
	{

		
	}

	/**
	 * Pushes an element to the stack
	 * @param val
	 */
	public void push(T val)
	{
		if (head==null)
		{
			head= new Node<>(val, null);
		}
		else
		{
			head= new Node<>(val,head);
		}
	}

	/**
	 * Throws stack underflow exception if empty
	 * @return the top element on the stack
	 */
	public T top() throws StackUnderFlowException
	{
		if (head==null)
		{
			throw new StackUnderFlowException();
		}
		
		return head.val;
		
	}

	/**
	 * Pops the top element of the stack and returns it.
	 * Throws stack underflow exception if empty
	 * @return the popped element from the stack
	 */
	public T pop() throws StackUnderFlowException
	{
		if (head==null)
		{
			throw new StackUnderFlowException();
		}
		
		T value=head.val;
		head = head.next;
		
		return value;
		
	}

	/**
	 * 
	 * @return true if the stack is empty
	 */
	public boolean isEmpty()
	{
		return head==null;
	}

}