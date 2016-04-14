package factory.commonfactory;

/**
 * 抽象交通工具工厂
 * @author Administrator
 *
 */
public interface AbstractVehicleFactory {
	// 使用<T extends Moveable>，则在调用createVehicle方法时传入的必须是Moveable的子类，要不然编译无法通过。泛型控制。
	public <T extends Moveable> Moveable createVehicle(Class<T> clazz);
}
