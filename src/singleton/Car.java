package singleton;

/**
 * 单例模式
 *
 * @author lap
 *
 */
public class Car {
	private static Car car = new Car();
//	private static List<Car> cars = new ArrayList<>(); 多例，数据库连接池
	
	// 私有构造方法
	private Car(){
	}
	
	// 只能通过getInstance方法获得，所以在这里可以自己做一些限制
	public static Car getInstance() {
		return car;
	}
	
	public void run() {
		System.out.println("冒着烟奔跑中car.......");
	}
}
