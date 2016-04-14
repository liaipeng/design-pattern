package strategy;


/**
 * 策略模式就是定义一系列的算法，将每一个算法封装起来，使它们可以相互转换
 * 策略模式让算法独立于使用它的客户而独立变化
 * 通过模拟JDK的Comparable和Comparator类演示
 * @author Administrator
 *
 */
public class Main {
	//基于用户的角度编写程序
	public static void main(String[] args) {
		Cat[] cats = {new Cat(1, 2), new Cat(2, 4), new Cat(0, 5)};
		DataSorter.print(cats);
		
		DataSorter.sort(cats);
		DataSorter.print(cats);
		
		for(Cat c : cats) {
			c.setComparator(new CatWeightComparator());
		}
		
		DataSorter.sort(cats);
		DataSorter.print(cats);
	}
}
