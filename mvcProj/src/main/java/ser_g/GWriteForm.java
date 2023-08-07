package ser_g;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import control.GalleryService;

public class GWriteForm implements GalleryService{
	
	public void execute1(HttpServletRequest request, HttpServletResponse response) {
		
		request.setAttribute("mainTitle","갤러리 글쓰기");
		System.out.println("GList.execute() 실행");

	}

}
