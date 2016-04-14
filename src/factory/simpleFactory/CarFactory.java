package factory.simpleFactory;

/**
 * 汽车工厂
 * @author Administrator
 *
 */
public class CarFactory implements VehicleFactory {
	// Car的生产控制交给工厂，工厂实现VehicleFactory
	@Override
	public Moveable create() {
		return new Car();
	}

}
