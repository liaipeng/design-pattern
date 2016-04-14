package factory.simpleFactory;

/**
 * 汽车
 * @author Administrator
 *
 */
public class Car implements Moveable {
	@Override
	public void run() {
		System.out.println("冒着烟奔跑中car.......");
	}

}
