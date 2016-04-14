package bridge;

/**
 * 桥接模式：排列组合
 * 礼物种类与礼物类型排列组合
 * 
 * @author Administrator
 *
 */
public class Boy {
	private String name;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void pursue(MM mm) {
		Gift g = new WarmGift(new Ring());
	}
	
	public void give(Gift g, MM mm) {
		
	}
}
