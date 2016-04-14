package chain.filter;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String msg = "大家好:),<Script>,敏感,被就业,网络授课没感觉,因为看不到大家伙儿";
		MsgProcessor mp = new MsgProcessor();
		mp.setMsg(msg);
		FilterChain fc = new FilterChain();
		fc.addFilter(new HTMLFilter())
		  .addFilter(new SensitiveFilter());
		FilterChain fc2 = new FilterChain();
		fc2.addFilter(new FaceFilter());
		
		fc.addFilter(fc2); // 因为FilterChain也实现了Filter接口
		
		mp.setFc(fc);
		String result = mp.process();
		System.out.println(result);
	}

}
