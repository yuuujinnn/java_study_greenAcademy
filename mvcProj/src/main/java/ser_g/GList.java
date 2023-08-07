package ser_g;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import control.GalleryService;
import model_p.GalleryDAO;

public class GList implements GalleryService{
	
	public void execute1(HttpServletRequest request, HttpServletResponse response) {
		
		
		request.setAttribute("mainTitle","갤러리 목록");
		
		System.out.println("GList.execute() 실행:");

		request.setAttribute("mainData",new GalleryDAO().list());
		
		
	}

}
