public class MyLinkedList<E> 
{
	private Node<E> head, tail;
 
	public MyLinkedList() 
	{
		head = null;
		tail = null;
	}

	public void append(E item) 
	{
		Node<E> newNode = new Node<>(item);

		if (head == null) 
		{
			head = tail = newNode; 
		}
		else 
		{
			tail.next = newNode; 
			tail = newNode; 
		}
	}
	
	//method
	public MyLinkedList<E> determineIfVisible(E item)
	{
		Node<E> currentPtr = head;
        MyLinkedList<E> visibleStarList = new MyLinkedList<E>();

        if(currentPtr == null)//if list empty
		{
            return visibleStarList;
		}
		
        while(currentPtr != null)
        {
            if (((Comparable)currentPtr.element).compareTo(item) >= 0)
            {
                visibleStarList.append(currentPtr.element);
            }
            currentPtr = currentPtr.next;
        }

        return visibleStarList;
	}

	public String toString() 
	{
		String result = "";

		Node<E> ptr = head;
		for (ptr= head;ptr!=null; ptr=ptr.next) 
		{
			result = result +  ptr.element.toString();     
			if (ptr.next != null)
				result = result + ""; // add commas but not to the final 1   
		}
		result += ""; // Insert the closing ] in the string
		return result;
	}

	public void clear() 
	{
		head = tail = null;
	}

	private static class Node<E> 
	{
		E element;
		Node<E> next;

		public Node(E element) 
		{
			this.element = element;
			next = null;
		}
	}
   
} //end of the MyLinkedList class

