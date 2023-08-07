package r_control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/board/*")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BoardController() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String serviceStr = request.getRequestURI().substring(
				(request.getContextPath()+"/board/").length()
				);
		System.out.println(serviceStr);

		try {
			request.setCharacterEncoding("UTF-8");
			request.setAttribute("mainPage", serviceStr);
			
			BoardService service = (BoardService)Class.forName("review."+serviceStr).newInstance();
			service.execute(request,response);
			
			
			RequestDispatcher dispatcher = 
					request.getRequestDispatcher("/views/template.jsp");
			
			dispatcher.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
