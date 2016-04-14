package chain.webFilter;

/**
 * 过滤器接口，既处理请求，也处理返回
 * @author lap
 *
 */
public interface Filter {
	// 因为返回的时候要逆序调用过滤器，所以这边同时还传入了FilterChain。
	void doFilter(Request request, Response response, FilterChain chain);
}
