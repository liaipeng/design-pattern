package chain.webFilter;

import java.util.ArrayList;
import java.util.List;


/**
 * 过滤器链
 * @author Administrator
 *
 */
public class FilterChain implements Filter { // 过滤器链也实现Filter接口，所以可以把一个过滤器链当做一个整体，也是一个过滤器。
	List<Filter> filters = new ArrayList<Filter>();
	int index = 0; // filters的索引，初始为0
	
	public FilterChain addFilter(Filter filter) {
		this.filters.add(filter);
		return this;
	}

	@Override
	public void doFilter(Request request, Response response, FilterChain chain) {
		if (index == filters.size()) return; // 遍历完过滤器，返回
		Filter f = filters.get(index); // 获取过滤器
		index ++; // 此时索引指向下一个过滤器
		f.doFilter(request, response, chain); // 执行此过滤器的方法
	}
}
