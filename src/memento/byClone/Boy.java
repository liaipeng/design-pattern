package memento.byClone;

/**
 * 男孩
 * 
 * 不需要备忘录和备忘录管理者类，直接融合到Boy类中
 * 
 * @author lap
 *
 */
public class Boy implements Cloneable {
	private Boy backup; // 备忘录
	
	// 男孩的状态
	private String state = "";

	// 认识女孩子后状态肯定改变， 比如心情、 手中的花等
	public void changeState() {
		this.state = "心情可能很不好";
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	// 保留一个备份
	public void createMemento() {
		this.backup = this.clone();
	}

	// 恢复一个备份
	public void restoreMemento() {
		// 在进行恢复前应该进行断言，防止空指针
		this.setState(this.backup.getState());
	}
	
	@Override
	protected Boy clone() {
		try {
			return (Boy) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}