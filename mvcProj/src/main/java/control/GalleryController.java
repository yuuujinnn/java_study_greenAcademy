package control;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model_p.PageData;


@WebServlet("/gallery/*")
public class GalleryController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public GalleryController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String serviceStr = request.getRequestURI().substring(
				(request.getContextPath()+"/gallery/").length()
				);
		System.out.println(serviceStr);
		try {
			request.setCharacterEncoding("UTF-8");
			request.setAttribute("mainPage", serviceStr);
			
			GalleryService service = (GalleryService)Class.forName("ser_g."+serviceStr).newInstance();
			service.execute1(request,response);
			
			
			RequestDispatcher dispatcher = 
					request.getRequestDispatcher("/views/gtemplate.jsp");
			
			dispatcher.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

