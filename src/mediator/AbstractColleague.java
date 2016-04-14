package mediator;

/**
 * 抽象同事类
 * @author lap
 *
 */
public class AbstractColleague {
	protected AbstractMediator mediator;
	
	public AbstractColleague(AbstractMediator _mediator){
		this.mediator = _mediator;
	}
}
