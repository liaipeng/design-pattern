package proxy.dynamicProxy;

import java.lang.reflect.Method;

/**
 * TimeHandler
 * @author Administrator
 *
 */
public class TimeHandler implements InvocationHandler {
	// 要被代理的对象
	private Object target;
	
	// 传入要代理的对象
	public TimeHandler(Object target) {
		super();
		this.target = target;
	}

	// 这边的Object o是生成的具体代理类$Proxy1
	@Override
	public void invoke(Object o, Method m) {
		long start = System.currentTimeMillis();
		System.out.println("starttime:" + start);
		System.out.println(o.getClass().getName());
		try {
			m.invoke(target);
		} catch (Exception e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("time:" + (end-start));
	}

}
