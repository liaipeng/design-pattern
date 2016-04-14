package factory.commonfactory;

/**
 * 工厂设计模式
 * @author Administrator
 *
 */
public class Main {
	public static void main(String[] args) {
		AbstractVehicleFactory avf = new VehicleFactory();
		Moveable m = avf.createVehicle(Plane.class);
		m.run();
	}
}
