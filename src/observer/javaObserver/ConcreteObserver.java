package observer.javaObserver;

import java.util.Observable;
import java.util.Observer;

/**
 * 具体观察者
 * 
 * 不再需要自己定义Observer接口，直接用JDK提供的
 * 
 * @author lap
 *
 */
public class ConcreteObserver implements Observer {
	// 重写更新方法
	@Override
	public void update(Observable o, Object arg) {
		System.out.println("接收到信息: "+arg+"， 并进行处理！ ");		
	}
}