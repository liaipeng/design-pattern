package strategy;

/**
 * 根据高度的比较策略
 * @author Administrator
 *
 */
public class CatHeightComparator implements Comparator<Cat> {

	@Override
	public int compare(Cat o1, Cat o2) {
		if(o1.getHeight() > o2.getHeight()) return 1;
		else if(o1.getHeight() == o2.getHeight()) return 0;
		else return -1;
		
//		if(o1 instanceof Cat && o2 instanceof Cat) {
//			Cat c1 = (Cat)o1;
//			Cat c2 = (Cat)o2;
//			if(c1.getHeight() > c2.getHeight()) return 1;
//			else if(c1.getHeight() == c2.getHeight()) return 0;
//			else return -1;
//		}
//		else
//			return -200;
	}

}
