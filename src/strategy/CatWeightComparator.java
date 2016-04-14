package strategy;

/**
 * 根据重量比较的策略
 * @author Administrator
 *
 */
public class CatWeightComparator implements Comparator<Cat> {

	@Override
	public int compare(Cat o1, Cat o2) {
		if(o1.getWeight() > o2.getWeight()) return 1;
		else if(o1.getWeight() < o2.getWeight()) return -1;
		else return 0;
	}

}
