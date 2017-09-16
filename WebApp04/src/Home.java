import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class Home implements Servlet {
    ServletConfig config=null;
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.config=servletConfig;
        System.out.println("servlet is initialized");
    }

    @Override
    public ServletConfig getServletConfig() {
        return config;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.setContentType("text/html");
        PrintWriter out=servletResponse.getWriter();
        out.print("<html><body>");
        out.print("<b>hello simple servlet</b>");
        out.print("</body></html>");
    }

    @Override
    public String getServletInfo() {
        return "copyright 2007-1010";
    }

    @Override
    public void destroy() {
        System.out.println("servlet is destroyed");
    }
}