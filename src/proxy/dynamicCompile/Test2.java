package proxy.dynamicCompile;
import java.lang.reflect.Method;

/**
 * 获取类中的方法
 * @author Administrator
 *
 */
public class Test2 {
	public static void main(String[] args) {
		Method[] methods = proxy.dynamicProxy.Movable.class.getMethods();
		for(Method m : methods) {
			System.out.println(m.getName());
		}
	}
}