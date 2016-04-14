package chain.webFilter;

/**
 * 过滤器实例，处理<>
 * @author lap
 *
 */
public class HTMLFilter implements Filter {
	@Override
	public void doFilter(Request request, Response response, FilterChain chain) {
		// 处理Request
		request.requestStr = request.requestStr.replace('<', '[')
				   .replace('>', ']');
		// 调用下一个过滤器
		chain.doFilter(request, response, chain);
		// 处理Response
		response.responseStr += "---HTMLFilter()";
	}

}
