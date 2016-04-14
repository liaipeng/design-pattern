package factory.abstractFactory;

/**
 * 第一组工厂，现实世界工厂
 * @author Administrator
 *
 */
public class DefaultFactory extends AbstractFactory{

	@Override
	public Food createFood() {
		// TODO Auto-generated method stub
		return new Apple();
	}

	@Override
	public Vehicle createVehicle() {
		// TODO Auto-generated method stub
		return new Car();
	}

	@Override
	public Weapon createWeapon() {
		// TODO Auto-generated method stub
		return new AK47();
	}
	
}
