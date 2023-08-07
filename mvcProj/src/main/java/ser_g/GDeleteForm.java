package ser_g;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;
import control.GalleryService;

public class GDeleteForm implements GalleryService{
	
	public void execute1(HttpServletRequest request, HttpServletResponse response) {
		
		request.setAttribute("mainTitle","게시판 삭제");
		System.out.println("GList.execute() 실행");

	}

}
