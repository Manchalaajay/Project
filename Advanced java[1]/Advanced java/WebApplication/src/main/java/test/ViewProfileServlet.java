package test;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/view")
public class ViewProfileServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		HttpSession hs=req.getSession(false);
		if(hs==null)
		{
			req.setAttribute("msg", "Session expired...<br>");
			req.getRequestDispatcher("user.jsp").forward(req, res);
		}else
		{
			ArrayList<WebBean>al=new ViewProfileDAO().retrieve();
			hs.setAttribute("alist", al);
			req.getRequestDispatcher("ViewProfile.jsp").forward(req, res);
		}
	}

}
