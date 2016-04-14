package factory.simpleFactory;

/**
 * 工厂设计模式
 * @author Administrator
 *
 */
public class Main {
	public static void main(String[] args) {
		//只需修改工厂，若使用配置文件，直接就不需要修改代码
		VehicleFactory vf = new PlaneFactory();
		Moveable m = vf.create();
		m.run();
	}
}
