package proxy.dynamicProxyByCglib;

import java.util.Random;

/**
 * Tank作为一种交通工具，这次不再实现任何接口
 * @author Administrator
 *
 */
public class Tank{
	public void move() {
		System.out.println("Tank Moving...");
		try {
			Thread.sleep(new Random().nextInt(10000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
