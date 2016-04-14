package observer;
/**
 * 具体被观察者
 * @author lap
 *
 */
public class ConcreteSubject extends Subject {
	// 具体的业务
	public void doSomething() {
		/*
		 * do something
		 */
		// 做事情则会通知观察者
		super.notifyObservers();
	}
}