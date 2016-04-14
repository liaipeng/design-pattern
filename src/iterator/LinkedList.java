package iterator;

public class LinkedList implements Collection{
	private Node head = null;
	private Node tail = null;
	private int size = 0;
	
	public void add(Object obj) {
		Node node = new Node();
		node.setData(obj);
		
		if (head == null) {
			head = node;
			tail = node;
		}
		
		tail.setNext(node);
		tail = node;
		
		size ++;
	}
	
	public int size() {
		return size;
	}

	@Override
	public Iterator iterator() {
		return new LinkedListIterator();
	}
	
	class LinkedListIterator implements Iterator{
		private Node cur = head;

		@Override
		public boolean hasNext() {
			return (cur == null) ? false : true;
		}

		@Override
		public Object next() {
			Object o = cur.getData();
			cur = cur.getNext();
			return o;
		}
	}
	
	
}
