package iterator;

public class Main {
	public static void main(String[] args) {
//		ArrayList list = new ArrayList();
//		LinkedList list = new LinkedList();
		Collection list = new LinkedList();
		
		for (int i = 0; i < 15; i++) {
			list.add(i);
		}
		
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}
}
