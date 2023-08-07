package ser_p;

import java.io.File;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import control.BoardService;
import model_p.BoardDAO;
import model_p.BoardDTO;
import model_p.PageData;

public class BDeleteReg implements BoardService{
	
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
	
		
		String path = request.getRealPath("up");
		path = "C:\\javawork\\mvcProj\\src\\main\\webapp\\up";

		PageData pd = (PageData)request.getAttribute("pd");
		
			
		BoardDTO dto = new BoardDTO();
		dto.setId( Integer.parseInt(request.getParameter("id")));
		
		dto.setPw( request.getParameter("pw"));
		
		String msg = "비밀번호가 일치하지 않습니다.";
		String goUrl = "BDeleteForm?id="+dto.getId()+"&page="+pd.page;
		
		System.out.println(dto);
		//id/pw 검사 및 파일정보가져오기
		BoardDTO delDto = new BoardDAO().idPwChk(dto);
		
		if(delDto!=null) {//id, pw 가 일치한다면
			
			if(!delDto.getUpfile().equals("")) { //파일이 존재한다면
				//파일 삭제
				new File(path+"\\"+delDto.getUpfile()).delete();
			}
			//DB 에서 삭제
			new BoardDAO().delete(dto);
			msg = "삭제되었습니다.";
			goUrl = "BList?page="+pd.page;
		}
				
		request.setAttribute("mainPage", "alert");
		request.setAttribute("msg",msg);
		request.setAttribute("goUrl",goUrl);
		
		
	}

}
