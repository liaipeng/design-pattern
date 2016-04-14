package factory.abstractFactory;

/**
 * 第二组工厂，魔法世界工厂
 * @author Administrator
 *
 */
public class MagicFactory extends AbstractFactory {

	@Override
	public Food createFood() {
		// TODO Auto-generated method stub
		return new MushRoom();
	}

	@Override
	public Vehicle createVehicle() {
		// TODO Auto-generated method stub
		return new Broom();
	}

	@Override
	public Weapon createWeapon() {
		// TODO Auto-generated method stub
		return new MagicStick();
	}
	
}
