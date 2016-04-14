package interfaceOriented;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


/**
 * 面向接口编程
 * @author Administrator
 *
 */
public class InterfaceOriented {
	
	public static void main(String[] args) {
		//只需修改ArrayList,其他代码无需变换
		Collection<String> c = new ArrayList<String>();
		c.add("Hello");
		c.add("World!");
		Iterator<String> it = c.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
	
}
