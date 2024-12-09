import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			
		//JSTL -> JSP Standard Tag Library.
		
//		String name = "Om";
//		req.setAttribute("label", name);
		
		
//		Student s = new Student(1,"Om");
//		
//		req.setAttribute("student", s);
//		
		List<Student> std = Arrays.asList(new Student(1,"Om"), new Student(2,"ABC"), new Student(3,"XYZ"));
		req.setAttribute("students", std);
		
		//Calling JSP file from Servlet File..
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/display.jsp");
		

		rd.forward(req, res);
	}
}
