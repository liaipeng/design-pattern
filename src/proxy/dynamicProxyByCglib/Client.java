package proxy.dynamicProxyByCglib;

/**
 * 模拟JDK中的动态代理 
 * 可以对任意的对象、任意的接口方法，实现任意的代理
 * @author Administrator
 *
 */
public class Client {
	public static void main(String[] args) {
		Tank t = new Tank(); // 要被代理的对象
		Tank proxy = (Tank) new TankCglib().getProxy(t); // 传入要对代理的对象，返回代理后的对象
		proxy.move();  // 调用代理对象的move方法
	}
}
