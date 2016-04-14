package factory.abstractFactory;

/**
 * 抽象工厂
 * @author Administrator
 *
 */
public abstract class AbstractFactory {
	public abstract Vehicle createVehicle();
	public abstract Weapon createWeapon();
	public abstract Food createFood();
	
}
