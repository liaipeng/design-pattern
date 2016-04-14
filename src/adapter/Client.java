package adapter;

public class Client {
	public static void main(String[] args) {
		// 没有与外系统连接的时候， 是这样写的
		IUserInfo youngGirl = new UserInfo();
		// 从数据库中查到101个
		for (int i = 0; i < 101; i++) {
			youngGirl.getMobileNumber();
		}
		
		//老板一想不对呀， 兔子不吃窝边草， 还是找借用人员好点
		//我们只修改了这句话
		IUserInfo youngGirl2 = new OuterUserInfo();
		//从数据库中查到101个
		for(int i=0;i<101;i++){
		youngGirl2.getMobileNumber();
		}
	}
}