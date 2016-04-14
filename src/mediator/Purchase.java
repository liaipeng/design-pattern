package mediator;

public class Purchase extends AbstractColleague {
	public Purchase(AbstractMediator _mediator) {
		super(_mediator);
	}

	// Depend-Method：采购IBM电脑
	public void buyIBMcomputer(int number) {
		// 把任务交给中介者处理
		super.mediator.execute("purchase.buy", number);
	}

	// Self-Method：不再采购IBM电脑
	public void refuseBuyIBM() {
		System.out.println("不再采购IBM电脑");
	}
}
