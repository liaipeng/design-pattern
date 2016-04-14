package proxy;

/**
 * 日志代理
 * @author Administrator
 *
 */
public class TankLogProxy implements Moveable {
	public TankLogProxy(Moveable m) {
		super();
		this.m = m;
	}
	
	Moveable m;
	
	@Override
	public void move() {
		System.out.println("Tank Start...");
		m.move();
		System.out.println("Tank Stop...");
	}

}
