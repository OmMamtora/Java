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
        
        // Your servlet logic
        List<Student> std = Arrays.asList(new Student(1,"Om"), new Student(2,"ABC"), new Student(3,"XYZ"));
        req.setAttribute("students", std);
        
/*        
        //Forward to another file display.jsp
       	 RequestDispatcher rd = req.getRequestDispatcher("/display.jsp");
         rd.forward(req, res);
        
        
        //This is called SQLTagsDisplay.jsp file
	      RequestDispatcher rd = req.getRequestDispatcher("/SQLTagsDisplay.jsp");
	      rd.forward(req, res);
*/
        //This is called FunctionTags.jsp file
         RequestDispatcher rd = req.getRequestDispatcher("/FunctionTags.jsp");
         rd.forward(req, res);
        
    }
}