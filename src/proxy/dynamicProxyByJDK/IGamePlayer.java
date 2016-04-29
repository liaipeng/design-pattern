package proxy.dynamicProxyByJDK;

/**
 * 游戏玩家接口
 * @author lap
 *
 */
public interface IGamePlayer {
	// 登陆
	void login(String user, String password);
	// 杀怪
	void killBoss();
	// 升级
	void upgrade();
}
