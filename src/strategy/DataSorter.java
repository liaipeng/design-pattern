package strategy;

/**
 * 排序器
 * @author Administrator
 *
 */
public class DataSorter {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void sort(Comparable[] o) {
		for(int i=o.length; i>0; i--) {
			for(int j=0; j<i-1; j++) {
				Comparable o1 = (Comparable) o[j];
				Comparable o2 = (Comparable) o[j+1];
				if(o1.compareTo(o2) == 1) {
					swap(o, j, j+1);
				}
			}
		}
	}
	
	private static void swap(Object[] a, int x, int y) {
		Object temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}
	
	public static void print(Object[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + ",");
		}
		System.out.println();
	}
}
