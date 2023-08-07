package ser_p;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import control.BoardService;
import model_p.BoardDAO;
import model_p.BoardDTO;

public class BWriteReg implements BoardService{
	
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		String path = request.getRealPath("up");
		path = "C:\\javawork\\mvcProj\\src\\main\\webapp\\up";
		
		
		try {
			MultipartRequest mr = new MultipartRequest(
					request,
					path,
					10*1024*1024,
					"utf-8",
					new DefaultFileRenamePolicy()
				);
			
			BoardDTO dto = new BoardDTO();
			dto.setTitle( mr.getParameter("title"));
			dto.setPname( mr.getParameter("pname"));
			dto.setPw( mr.getParameter("pw"));
			dto.setContent( mr.getParameter("content"));
			dto.setUpfile( mr.getFilesystemName("upfile"));
			
			new BoardDAO().write(dto);
			
			System.out.println("newId:"+dto.getId());
			
			
			request.setAttribute("mainPage", "alert");
			request.setAttribute("msg","입력되었습니다.");
			request.setAttribute("goUrl","BDetail?id="+dto.getId());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
		
	}

}
