package iterator;

public class ArrayList implements Collection {
	private Object[] objs = new Object[10];
	private int index = 0;
	@Override
	public void add(Object obj) {
		if (index == objs.length) {
			Object[] newObjs = new Object[objs.length * 2]; // 实际上不能以这样的步长增加
			System.arraycopy(objs, 0, newObjs, 0, objs.length); // 把旧的数据拷贝到新数组
			objs = newObjs; // 把objs的引用指向新数组
		}
		objs[index] = obj;
		index ++;
	}
	@Override
	public int size() {
		return index;
	}

	@Override
	public Iterator iterator() {
		return new ArrayListIterator();
	}
	
	class ArrayListIterator implements Iterator{
		private int currentIndex = 0;
		
		@Override
		public boolean hasNext() {
			return (currentIndex >= index) ? false : true;
		}
		
		@Override
		public Object next() {
			Object o = objs[currentIndex];
			currentIndex++;
			return o;
		}
		
	}
}
