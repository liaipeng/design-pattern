package proxy;

/**
 * 代理设计思想:聚合
 * @author Administrator
 *
 */
public class Client {
	public static void main(String[] args) {
		Tank t = new Tank();
		TankTimeProxy ttp = new TankTimeProxy(t);
		TankLogProxy tlp = new TankLogProxy(ttp);
		Moveable m = tlp;
		m.move();
	}
}
