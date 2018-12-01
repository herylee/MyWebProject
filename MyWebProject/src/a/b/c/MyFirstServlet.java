package a.b.c;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.xml.internal.fastinfoset.sax.Properties;

public class MyFirstServlet implements Servlet {

	// sadasdasdasdad
	
	
	private ServletContext Context; //定义一个属性

	public MyFirstServlet() { // 构造方法
		// TODO Auto-generated constructor stub

		System.out.println("11111111111");
		// 构造方法最先被调用， new这个类的对象累

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

		System.out.println("11111111111");
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub

		System.out.println("11111111111");
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub

		System.out.println("11111111111");
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub

////		String value = config.getInitParameter("user");
////
////		System.out.println("value: " + value);
////		
//	Enumeration<String> enumeration = 	config.getInitParameterNames();
//
//	while (enumeration.hasMoreElements()) {
//		String name = (String) enumeration.nextElement();
//		String value = config.getInitParameter(name);
//		System.out.println("name"+name+"     "+"value        "+value);
//		
//	}
	
		
//		System.out.println(config.getServletName());
		
//		System.out.println(config.getInitParameter("user"));
		
		 this.Context =  config.getServletContext();

		
		
		
		
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
			//这句话，实现了向servletContext域对象的属性空间存入了一个键值对，  aaa-111、
//		Context.setAttribute("aaa", "111");
		
		
		response.getWriter().println(Context.getInitParameter("zzz"));
		

	}

}
