package observer.javaObserver;

/**
 * 被观察者
 * 
 * 不再需要去定义addObserver等抽象方法
 * 
 * @author lap
 *
 */
public interface Subject {
	// 增加一个观察者
	public void doSomething();
}