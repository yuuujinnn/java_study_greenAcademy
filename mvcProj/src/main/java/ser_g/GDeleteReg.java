package ser_g;

import java.io.File;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import control.GalleryService;
import model_p.GalleryDAO;
import model_p.GalleryDTO;

public class GDeleteReg implements GalleryService{
	
	public void execute1(HttpServletRequest request, HttpServletResponse response) {
		
	
		
		String path = request.getRealPath("up");
		path = "C:\\javawork\\mvcProj\\src\\main\\webapp\\galleryup";
		
			
		GalleryDTO dto = new GalleryDTO();
		dto.setId( Integer.parseInt(request.getParameter("id")));
		
		dto.setPw( request.getParameter("pw"));
		
		String msg = "비밀번호가 일치하지 않습니다.";
		String goUrl = "GDeleteForm?id="+dto.getId();
		
		System.out.println(dto);
		//id/pw 검사 및 파일정보가져오기
		GalleryDTO delDto = new GalleryDAO().idPwChk(dto);
		
		if(delDto!=null) {//id, pw 가 일치한다면
			
			if(!delDto.getUpfile().equals("")) { //파일이 존재한다면
				//파일 삭제
				new File(path+"\\"+delDto.getUpfile()).delete();
			}
			//DB 에서 삭제
			new GalleryDAO().delete(dto);
			msg = "삭제되었습니다.";
			goUrl = "BList";
		}
				
		request.setAttribute("mainPage", "alert");
		request.setAttribute("msg",msg);
		request.setAttribute("goUrl",goUrl);
		
		
	}

}
