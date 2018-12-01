package a.b.c;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MySecondServlet implements Servlet {

	private ServletContext Context;

	public MySecondServlet() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub

		this.Context = config.getServletContext();
//		System.out.println(config.getInitParameter("user"));

	}

	@Override
	public void service(ServletRequest req, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		// String value= (String) Context.getAttribute("aaa");
		// System.out.println("MySecondServlet的获取到了第一个域对象的value"+ " "+value);
		// res.getWriter().println(value);

		response.getWriter().println(Context.getInitParameter("zzz"));

	}

}
