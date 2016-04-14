package strategy;

/**
 * 模拟JDK的Comparator接口
 * @author Administrator
 *
 */
public interface Comparator<T> {
	int compare(T o1, T o2);
}
