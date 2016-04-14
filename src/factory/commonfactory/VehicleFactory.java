package factory.commonfactory;

/**
 * 交通工具工厂
 * @author Administrator
 *
 */
public class VehicleFactory implements AbstractVehicleFactory {
	@SuppressWarnings("unchecked")
	@Override
	public <T extends Moveable> Moveable createVehicle(Class<T> clazz) {
		Moveable m = null;
		try {
			m = (Moveable) Class.forName(clazz.getName()).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return (T)m; // 转为T型返回
	}
}
