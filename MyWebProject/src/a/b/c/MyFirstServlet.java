package a.b.c;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlet  implements Servlet{

	
	
	  public MyFirstServlet() {    //构造方法
		// TODO Auto-generated constructor stub
		  
		  System.out.println("11111111111");
		  //构造方法最先被调用，  new这个类的对象累
		  
		  
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
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

		  System.out.println("11111111111");
		  //对servlet进行初始化
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

//		  System.out.println("11111111111");
		
		HttpServletResponse  res = (HttpServletResponse) response;
		res.getWriter().write("ahha");
		
		
		
		
	}

		
		
	
 
}
