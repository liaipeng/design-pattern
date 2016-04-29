package proxy.dynamicProxyByCglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;


/**
 * 使用Cglib动态代理
 * 
 * @author lap
 *
 */


public class TankCglib implements MethodInterceptor{
	private Object target;
	
	/**
	 * 创建代理对象
	 * @param target
	 * @return
	 */
	public Object getProxy(Object target) {
		this.target = target;
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(this.target.getClass());
		// 回调函数
		enhancer.setCallback(this);
		// 创建代理对象
		return enhancer.create();
	}
	
	// 回调函数
	@Override
	public Object intercept(Object obj, Method method, Object[] args,
			MethodProxy proxy) throws Throwable {
		long start = System.currentTimeMillis();
		System.out.println("starttime:" + start);
		System.out.println(obj.getClass().getName());
		proxy.invokeSuper(obj, args);
		long end = System.currentTimeMillis();
		System.out.println("time:" + (end-start));
		return null;
	}
}
