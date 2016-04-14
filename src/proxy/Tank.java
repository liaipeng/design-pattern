package proxy;

import java.util.Random;

/**
 * Tank作为一种交通工具，实现Movable
 * @author Administrator
 *
 */
public class Tank implements Moveable {
	@Override
	public void move() {
		System.out.println("Tank Moving...");
		try {
			Thread.sleep(new Random().nextInt(10000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
