package observer.javaObserver;

import java.util.Observer;

/**
 * 场景类
 * @author lap
 *
 */
public class Client {
	public static void main(String[] args) {
		// 创建一个被观察者
		ConcreteSubject subject = new ConcreteSubject();
		// 定义N个观察者
		Observer obs1 = new ConcreteObserver();
		Observer obs2 = new ConcreteObserver();
		// 观察者观察被观察者
		subject.addObserver(obs1);
		subject.addObserver(obs2);
		// 观察者开始活动了
		subject.doSomething();
	}
}