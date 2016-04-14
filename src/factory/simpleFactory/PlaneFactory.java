package factory.simpleFactory;

public class PlaneFactory implements VehicleFactory {
	@Override
	public Moveable create() {
		return new Plane();
	}

}
