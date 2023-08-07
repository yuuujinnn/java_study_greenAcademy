package ser_g;

import java.io.File;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import control.GalleryService;
import model_p.GalleryDAO;
import model_p.GalleryDTO;

public class GModifyReg implements GalleryService{
	
	public void execute1(HttpServletRequest request, HttpServletResponse response) {
		
		String path = request.getRealPath("up");
		path = "C:\\javawork\\mvcProj\\src\\main\\webapp\\galleryup";
		
		try {
			MultipartRequest mr = new MultipartRequest(
					request,
					path,
					10*1024*1024,
					"utf-8",
					new DefaultFileRenamePolicy()
				);
			
			GalleryDTO dto = new GalleryDTO();
			dto.setId(Integer.parseInt(mr.getParameter("id")));
			dto.setTitle( mr.getParameter("title"));
			dto.setPname( mr.getParameter("pname"));
			dto.setPw( mr.getParameter("pw"));
			dto.setContent( mr.getParameter("content"));
			dto.setUpfile( mr.getFilesystemName("upfile"));
			
			String msg = "비밀번호가 일치하지 않습니다.";
			String goUrl = "GModifyForm?id="+dto.getId();
			
			System.out.println(dto);
			
			
			if(new GalleryDAO().modify(dto) > 0) {//id, pw 가 일치한다면
				
				msg = "수정되었습니다.";
				goUrl = "BDetail?id="+dto.getId();
			}else {
				if(mr.getFilesystemName("upfile")!=null) {
					new File(path+"\\"+mr.getFilesystemName("upfile")).delete();
				}
			}
					
			request.setAttribute("mainPage", "alert");
			request.setAttribute("msg",msg);
			request.setAttribute("goUrl",goUrl);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
		
	}

}
