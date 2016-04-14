package proxy;

/**
 * 时间代理
 * @author Administrator
 *
 */
public class TankTimeProxy implements Moveable {
	public TankTimeProxy(Moveable m) {
		super();
		this.m = m;
	}
	
	Moveable m;
	
	@Override
	public void move() {
		long start = System.currentTimeMillis();
		m.move();
		long end = System.currentTimeMillis();
		System.out.println("Time: " + (end - start));
	}

}
