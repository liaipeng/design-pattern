package composite;

/**
 * 场景类
 * @author lap
 *
 */
public class Client {
	public static void main(String[] args) {
		// 创建一个根节点
		Composite root = new Composite();
		root.doSomething();
		// 创建一个树枝构件
		Composite branch = new Composite();
		// 创建一个叶子节点
		Leaf leaf = new Leaf();
		// 建立整体
		root.add(branch);
		branch.add(leaf);
	}

	// 通过递归遍历树
	public static void display(Composite root) {
		// 高层模块不必关心自己处理的是单个对象还是整个组合结构， 简化了高层模块的代码。
		for (Component c : root.getChildren()) {
			if (c instanceof Leaf) { // 叶子节点
				c.doSomething();
			} else { // 树枝节点
				display((Composite) c);
			}
		}
	}
}