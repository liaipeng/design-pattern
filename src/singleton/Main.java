package singleton;

public class Main {
	public static void main(String[] args) {
		Car car = Car.getInstance();
		car.run();
	}
}
