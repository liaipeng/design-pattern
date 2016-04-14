package factory.springFactory;


/**
 * 模拟Spring Bean工厂
 * @author Administrator
 *
 */
public class Main {
	public static void main(String[] args) {
		BeanFactory bf = new ClassPathXmlApplicationContext("src/factory/springFactory/applicationContext.xml");
		Object o = bf.getBean("v");
		Moveable m = (Moveable) o;
		m.run();
	}
}
