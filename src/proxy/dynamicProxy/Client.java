package proxy.dynamicProxy;

/**
 * 模拟JDK中的动态代理 
 * 可以对任意的对象、任意的接口方法，实现任意的代理
 * @author Administrator
 *
 */
public class Client {
	public static void main(String[] args) {
		Tank t = new Tank(); // 要被代理的对象
		TimeHandler th = new TimeHandler(t); // 具体的Handler
		
		try {
			// 传入接口和Handler，生成代理类
			Movable m = (Movable)Proxy.newProxyInstance(Movable.class, th);
			// 使用代理类
			m.move();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
