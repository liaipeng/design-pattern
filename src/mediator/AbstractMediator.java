package mediator;

/**
 * 抽象中介者类
 * 
 * @author lap
 * 
 */
public abstract class AbstractMediator {
	// 这边为什么持有的是具体的同事类，而不是抽象同事类？
	// 因为一般情况下，每一个具体同事类做的都是不一样的事情，没有共同的方法，所以没有必要传入他们的抽象类
	protected Purchase purchase;
	protected Sale sale;
	protected Stock stock;

	// 构造函数
	public AbstractMediator() {
		// 每一个同事类也持有中介者的引用
		purchase = new Purchase(this);
		sale = new Sale(this);
		stock = new Stock(this);
	}

	// 中介者最重要的方法叫做事件方法， 处理多个对象之间的关系
	public abstract void execute(String str, Object... objects);
}
