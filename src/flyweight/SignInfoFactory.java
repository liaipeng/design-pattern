package flyweight;

import java.util.HashMap;

/**
 * 带对象池的工厂类
 * @author lap
 *
 */
public class SignInfoFactory {
	// 池容器
	private static HashMap<String, SignInfo> pool = new HashMap<String, SignInfo>();

	/**
	 * 读者需要注意一点的是@Deprecated注解， 不要有删除投产
		中代码的念头， 如果方法或类确实不再使用了， 增加该注解， 表示该方法或类已经过时， 尽
		量不要再使用了， 我们应该保持历史原貌， 同时也有助于版本向下兼容， 特别是在产品级研
		发中。
	 */
	@Deprecated
	public static SignInfo getSignInfo() {
		return new SignInfo();
	}

	// 从池中获得对象
	public static SignInfo getSignInfo(String key) {
		// 设置返回对象
		SignInfo result = null;
		// 池中没有该对象， 则建立， 并放入池中
		if (!pool.containsKey(key)) {
			System.out.println(key + "----建立对象， 并放置到池中");
			result = new SignInfo4Pool(key);
			pool.put(key, result);
		} else {
			result = pool.get(key);
			System.out.println(key + "---直接从池中取得");
		}
		return result;
	}
}