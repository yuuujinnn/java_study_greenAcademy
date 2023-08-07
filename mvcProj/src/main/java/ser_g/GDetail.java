package ser_g;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;
import control.GalleryService;
import model_p.GalleryDAO;

public class GDetail implements GalleryService{
	
	public void execute1(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("mainTitle","갤러리 상세");
		System.out.println("GDetail.execute() 실행");
		
		int id = Integer.parseInt(request.getParameter("id"));
		new GalleryDAO().addCount(id);
		request.setAttribute("mainData",new GalleryDAO().detail(id));
	}

}
