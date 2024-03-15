package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/web")
public class UserServlet extends HttpServlet{
		protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
		{
			WebBean ub=new WebBean();
			ub.setId(req.getParameter("id"));
			ub.setName(req.getParameter("name"));
			ub.setMail(req.getParameter("mail"));
			ub.setAge(req.getParameter("age"));
			ub.setDob(req.getParameter("dob"));
			int k=new UserDAO().register(ub);
			if(k>0) {
				req.setAttribute("msg", "Data Submited successfully...<br>");
				RequestDispatcher rd=req.getRequestDispatcher("user.jsp");
				rd.forward(req, res);
			}
		}
}
