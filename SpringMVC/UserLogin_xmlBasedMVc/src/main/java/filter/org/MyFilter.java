package filter.org;

import javax.servlet.*;
import java.io.IOException;

public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("filter before servlet");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("After servlet");
    }

    @Override
    public void destroy() {

    }
}
