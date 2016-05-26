package proxy.dynamicProxyByJDK;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
	public static void main(String[] args) {
		IGamePlayer player = new GamePlayer("张三");
		InvocationHandler handler = new GamePlayIH(player);
		
		ClassLoader cl = player.getClass().getClassLoader();
		
		IGamePlayer proxy = (IGamePlayer)Proxy.newProxyInstance(cl, player.getClass().getInterfaces(), handler);
		
		proxy.login("ZhangSan", "123");
		proxy.killBoss();
		proxy.upgrade();
		
	}
}
