package factory.springFactory;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * BeanFactory的实现类
 * @author lap
 *
 */
public class ClassPathXmlApplicationContext implements BeanFactory  {
	// bean容器，存储配置文件中的id和class：Key是id，Value是class的实例
	Map<String, Object> container = new HashMap<String, Object>();
	
	// 构造方法，读取XML配置文件，把id和class装进容器container中
	public ClassPathXmlApplicationContext(String filename) {
		SAXReader reader = new SAXReader();
		File file = new File(filename);
		try {
			Document doc = reader.read(file);
			Element root = doc.getRootElement();
			
			@SuppressWarnings("unchecked")
			List<Element> beans = root.elements("bean");
			for (Element bean : beans) {
				String id = bean.attributeValue("id");
				String clazz = bean.attributeValue("class");
				
				Object o = Class.forName(clazz).newInstance(); // 注意！一定不要忘记newInstance()	
				container.put(id, o);
			}
			
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
	@Override
	public Object getBean(String id) {
		return container.get(id); // 根据id返回相应的class
	}
}

	
	
// 简化版，读取properties配置文件
//	Object o = null;
//	@Override
//	public Object getBean(String id) {
//		Properties props = new Properties();
//		try {
//			props.load(Main.class.getClassLoader().
//					getResourceAsStream("factory/springFactory/spring.properties"));
//			o = Class.forName(props.getProperty("VehicleType")).newInstance();
//		} catch (Exception e) {
//			e.printStackTrace();
//		} 
//		return o;
//	}
