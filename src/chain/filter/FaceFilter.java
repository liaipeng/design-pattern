package chain.filter;

/**
 * 过滤器实例，处理笑脸
 * @author lap
 *
 */
public class FaceFilter implements Filter {

	@Override
	public String doFilter(String str) {
		return str.replace(":)", "^V^");
	}

}
