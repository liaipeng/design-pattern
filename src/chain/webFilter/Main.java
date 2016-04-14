package chain.webFilter;

public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String msg = "大家好:),<Script>,敏感,被就业,网络授课没感觉,因为看不到大家伙儿";
		Request request = new Request();
		request.setRequestStr(msg);
		Response response = new Response();
		response.setResponseStr("response");
		FilterChain fc = new FilterChain();
		fc.addFilter(new HTMLFilter())
		  .addFilter(new SensitiveFilter());
		fc.doFilter(request, response, fc);
		System.out.println(request.getRequestStr());
		System.out.println(response.getResponseStr());
		 
	}

}
