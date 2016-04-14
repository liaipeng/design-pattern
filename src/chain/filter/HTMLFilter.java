package chain.filter;

/**
 * 过滤器实例，处理<>
 * @author lap
 *
 */
public class HTMLFilter implements Filter {

	@Override
	public String doFilter(String str) {
		//process the html tag <>
		String r = str.replace('<', '[')
				   .replace('>', ']');
		return r;
	}

}
