package strategy;

/**
 * Cat类，实现Comparable方法
 * @author Administrator
 *
 */
public class Cat implements Comparable<Cat>{
	private int Height;
	private int Weight;
	//比较器，默认为CatHeightComparator
	private Comparator<Cat> comparator = new CatHeightComparator();
		
	public Cat(int height, int weight) {
		super();
		Height = height;
		Weight = weight;
	}
	public int getHeight() {
		return Height;
	}
	public void setHeight(int height) {
		Height = height;
	}

	public int getWeight() {
		return Weight;
	}
	public void setWeight(int weight) {
		Weight = weight;
	}
	
	public Comparator<Cat> getComparator() {
		return comparator;
	}
	public void setComparator(Comparator<Cat> comparator) {
		this.comparator = comparator;
	}
	@Override
	public int compareTo(Cat o) {
		//核心！！将比较的任务交给Comparator,可以灵活变换
		return this.comparator.compare(this, o);
	}
	@Override
	public String toString() {
		return this.Height + "&" + this.Weight;
	}
}
