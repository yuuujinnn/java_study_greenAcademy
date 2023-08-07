package ser_g;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import control.GalleryService;
import model_p.GalleryDAO;

public class GModifyForm implements GalleryService{
	
	public void execute1(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("mainTitle","갤러리 수정");
		System.out.println("GModifyForm.execute() 실행");
		
		int id = Integer.parseInt(request.getParameter("id"));
		request.setAttribute("mainData",new GalleryDAO().detail(id));
	}

}
