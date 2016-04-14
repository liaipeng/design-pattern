package factory.simpleFactory;

/**
 * 交通工具工厂
 * @author Administrator
 *
 */
public interface VehicleFactory {
	Moveable create(); // 注意返回的对象是Moveable接口，多态
}
