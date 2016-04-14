package chain.filter;

import java.util.ArrayList;
import java.util.List;


/**
 * 过滤器链
 * @author Administrator
 *
 */
public class FilterChain implements Filter { // 过滤器链也实现Filter接口，所以可以把一个过滤器链当做一个整体，也是一个过滤器。
	List<Filter> filters = new ArrayList<Filter>();
	
	public FilterChain addFilter(Filter filter) {
		this.filters.add(filter);
		// 小技巧，这样可以形成链式编程
		return this;
	}
	
	// 遍历集合中的所有过滤器
	public String doFilter(String str) {
		String s = str;
		for (Filter filter : filters) {
			s = filter.doFilter(s);
		}
		return s;
	}
}
