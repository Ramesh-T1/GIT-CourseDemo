package GIT1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Practice1
 */
public class Practice1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Practice1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().println("<h1>User 2 accessed</h1>");
		response.getWriter().println("<h1>User 2 made changes</h1>");
		response.getWriter().println("<h1>User 1 accessed again</h1>");
		response.getWriter().println("<h1>User 1 to update file again</h1>");
		response.getWriter().println("<h1>User 1 accessed for develop (SEcond) branch changes</h1>");
		response.getWriter().println("<h1>Changes for develop1 (SEcond) branch</h1>");
	}
	

}
