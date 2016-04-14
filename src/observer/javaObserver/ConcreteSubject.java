package observer.javaObserver;

import java.util.Observable;

/**
 * 具体被观察者
 * @author lap
 *
 */
public class ConcreteSubject extends Observable implements Subject{
	// 具体的业务
	@Override
	public void doSomething() {
		System.out.println("done...");
		// 直接使用父类Observable的方法
		super.setChanged();
		super.notifyObservers("我do something啦"); // 该字符串会传给观察者
	}
}