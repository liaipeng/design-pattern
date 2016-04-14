package chain.webFilter;

public class SensitiveFilter implements Filter {
	@Override
	public void doFilter(Request request, Response response, FilterChain chain) {
		// 处理Request
		request.requestStr  = request.requestStr.replace("被就业", "就业")
			 .replace("敏感", "");
		// 调用下一个过滤器
		chain.doFilter(request, response, chain);
		// 处理Response
		response.responseStr += "---SensitiveFilter()";
	}

}
