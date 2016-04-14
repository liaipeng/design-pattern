package proxy.dynamicProxy;

import java.lang.reflect.Method;

/**
 * 调用方法接口
 * @author Administrator
 *
 */
public interface InvocationHandler {
	// 传入对象o，调用对象o的方法m
	public void invoke(Object o, Method m);
}
