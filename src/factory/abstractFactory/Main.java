package factory.abstractFactory;

/**
 * 抽象 工厂模式，可以根据需要选择用什么工厂系列
 * 缺点:工厂泛滥
 * @author Administrator
 *
 */
public class Main {
	public static void main(String[] args) {
		//只需修改用哪组工厂
		AbstractFactory f = new DefaultFactory();
		Vehicle v = f.createVehicle();
		v.run();
		Weapon w = f.createWeapon();
		w.shoot();
		Food a = f.createFood();
		a.printName();
	}
}
