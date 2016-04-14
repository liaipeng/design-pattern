package proxy.dynamicCompile;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.net.URL;
import java.net.URLClassLoader;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import javax.tools.JavaCompiler.CompilationTask;

/**
 * 动态生成代码，动态编译代码，动态实例化
 * @author Administrator
 *
 */
public class Test1 {
	public static void main(String[] args) throws Exception{
		String rt = "\r\n";
		// 字符串src的内容就是要生成的类
		String src = 
			"package proxy.dynamicCompile;" +  rt +
			"public class TankTimeProxy implements Moveable {" + rt +
			"    public TankTimeProxy(Moveable t) {" + rt +
			"        super();" + rt +
			"        this.t = t;" + rt +
			"    }" + rt +
			
			"    Moveable t;" + rt +
							
			"    @Override" + rt +
			"    public void move() {" + rt +
			"        long start = System.currentTimeMillis();" + rt +
			"        System.out.println(\"starttime:\" + start);" + rt +
			"        t.move();" + rt +
			"        long end = System.currentTimeMillis();" + rt +
			"        System.out.println(\"time:\" + (end-start));" + rt +
			"    }" + rt +
			"}";
		// 生成文件
		String fileName = System.getProperty("user.dir") 
							+ "/src/proxy/dynamicCompile/TankTimeProxy.java";
		File f = new File(fileName);
		FileWriter fw = new FileWriter(f);
		fw.write(src);
		fw.flush();
		fw.close();
		
		//compile，必须使用JDK，不能只用JRE
		//此时，编译好的class不在bin目录中
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		StandardJavaFileManager fileMgr = compiler.getStandardFileManager(null, null, null);
		Iterable units = fileMgr.getJavaFileObjects(fileName);
		CompilationTask t = compiler.getTask(null, fileMgr, null, null, null, units);
		t.call();
		fileMgr.close();
		
		//load into memory and create an instance
		// 把src路径下我们生成的class load进内存里
		URL[] urls = new URL[] {new URL("file:/" + System.getProperty("user.dir") +"/src/proxy/dynamicCompile")};
		URLClassLoader ul = new URLClassLoader(urls);
		Class c = ul.loadClass("proxy.dynamicCompile.TankTimeProxy"); // 得到这个类
		System.out.println(c);
		
		// 若直接使用 c.newInstance()，默认是使用其没有参数的构造方法，可是类中没有参数为空的构造方法。所以要用以下方法。
		Constructor ctr = c.getConstructor(Moveable.class); // 获取参数类型为Moveable的构造方法
		Moveable m = (Moveable)ctr.newInstance(new Tank()); // 传入参数 new Tank()，生成m对象
		m.move(); // 调用访法
		
	}
}

