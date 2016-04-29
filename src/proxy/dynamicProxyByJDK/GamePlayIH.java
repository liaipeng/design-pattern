package proxy.dynamicProxyByJDK;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayIH implements InvocationHandler{
	// 被代理的实例
	private Object target = null;
	
	public GamePlayIH(Object obj){
		this.target = obj;
	}
	// 调用被代理的方法
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object result = method.invoke(this.target, args);
		if ("upgrade".equals(method.getName())) {
			countPrice();
		}
		return result;
	}
	
	// 代理类可以做附加的事情
	void countPrice() {
		System.out.println("升级成功，收费500元");
	}
}
